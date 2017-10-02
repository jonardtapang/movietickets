
--CREATE TABLE IF NOT EXISTS CINEMA (ID INTEGER primary key, NAME VARCHAR(100) not null, availableseats INTEGER)
--CREATE TABLE IF NOT EXISTS MOVIE (ID INTEGER primary key, NAME VARCHAR(100) not null, genre VARCHAR(100))

CREATE TABLE IF NOT EXISTS CINEMA
( cinema_id         INTEGER PRIMARY KEY,
  cinema_name       VARCHAR(100) ,
  available_seats   INTEGER
);

CREATE TABLE IF NOT EXISTS SEAT
( seat_id           INTEGER PRIMARY KEY,
  cinema_id         INTEGER REFERENCES CINEMA (cinema_id),
  seat_name         VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS MOVIE
( movie_id          INTEGER PRIMARY KEY,
  movie_name        VARCHAR(100) ,
  duration          VARCHAR(100),
  genre             VARCHAR(100),
  img_link          VARCHAR(500),
  description       VARCHAR(5000),
  director          VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS SCREENING
( screen_id         INTEGER PRIMARY KEY,
  cinema_id         INTEGER REFERENCES CINEMA (cinema_id),
  movie_id          INTEGER REFERENCES MOVIE (movie_id),
  screen_start      TIMESTAMP ,
  screen_end        TIMESTAMP
);


CREATE TABLE IF NOT EXISTS MOVIE_RESERVATIONS
( reserve_id        INTEGER PRIMARY KEY,
  seat_id           INTEGER REFERENCES SEAT (seat_id),
  screen_id         INTEGER REFERENCES SCREENING (screen_id),
  reserve_flag      INTEGER
);

CREATE TABLE IF NOT EXISTS USERS (
  user_id INTEGER PRIMARY KEY,
  username VARCHAR(100) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(500) NOT NULL ,
  enabled BOOLEAN NOT NULL DEFAULT true
  );

CREATE TABLE IF NOT EXISTS USER_ROLES (
  user_role_id INTEGER PRIMARY KEY,
  user_id INTEGER REFERENCES USERS(user_id),
  role varchar(200) NOT NULL
  );
