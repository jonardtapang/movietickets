insert into CINEMA (cinema_id, cinema_name, available_seats) values (1, 'cinema1', 20);
insert into CINEMA (cinema_id, cinema_name, available_seats) values (2, 'cinema2', 20);
insert into CINEMA (cinema_id, cinema_name, available_seats) values (3, 'cinema3', 20);

insert into MOVIE (movie_id, movie_name, genre, duration, img_link, description, director)
            values
            (1, 'Kita-Kita', 'comedy', '2hrs', 'https://cdn3.clickthecity.com/images/movies/poster/215/16092.jpg', 'Comedy romantic film', 'Empoy');
insert into MOVIE (movie_id, movie_name, genre, duration, img_link, description, director)
            values
            (2, 'Annabelle Creation', 'Horror', '2hrs', 'https://cdn3.clickthecity.com/images/movies/poster/215/15767.jpg', 'Horror film', 'Foreigner');
insert into MOVIE (movie_id, movie_name, genre, duration, img_link, description, director)
            values
            (3, 'Zombies', 'Horror', '2hrs', 'https://cdn3.clickthecity.com/images/movies/poster/215/16146.jpg', 'Horror film', 'Foreigner');


insert into SCREENING(screen_id, movie_id, cinema_id, screen_start, screen_end)
            VALUES
            (1, 1, 1, '2017-09-28 11:00', '2017-09-28 13:00');
insert into SCREENING(screen_id, movie_id, cinema_id, screen_start, screen_end)
            VALUES
            (2, 1, 1, '2017-09-28 13:30', '2017-09-28 15:30');
insert into SCREENING(screen_id, movie_id, cinema_id, screen_start, screen_end)
            VALUES
            (3, 1, 1, '2017-09-28 16:00', '2017-09-28 18:00');


insert into SEAT(seat_id, seat_name, cinema_id) VALUES (1, 'A1', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (2, 'A2', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (3, 'A3', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (4, 'A4', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (5, 'A5', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (6, 'A6', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (7, 'A7', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (8, 'A8', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (9, 'A9', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (10, 'A10', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (11, 'B1', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (12, 'B2', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (13, 'B3', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (14, 'B4', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (15, 'B5', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (16, 'B6', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (17, 'B7', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (18, 'B8', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (19, 'B9', 1);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (20, 'B10', 1);

insert into SEAT(seat_id, seat_name, cinema_id) VALUES (21, 'A1', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (22, 'A2', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (23, 'A3', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (24, 'A4', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (25, 'A5', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (26, 'A6', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (27, 'A7', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (28, 'A8', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (29, 'A9', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (30, 'A10', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (31, 'B1', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (32, 'B2', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (33, 'B3', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (34, 'B4', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (35, 'B5', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (36, 'B6', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (37, 'B7', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (38, 'B8', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (39, 'B9', 2);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (40, 'B10', 2);

insert into SEAT (seat_id, seat_name, cinema_id) VALUES (41, 'A1', 3);
insert into SEAT (seat_id, seat_name, cinema_id) VALUES (42, 'A2', 3);
insert into SEAT (seat_id, seat_name, cinema_id) VALUES (43, 'A3', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (44, 'A4', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (45, 'A5', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (46, 'A6', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (47, 'A7', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (48, 'A8', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (49, 'A9', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (50, 'A10', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (51, 'B1', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (52, 'B2', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (53, 'B3', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (54, 'B4', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (55, 'B5', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (56, 'B6', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (57, 'B7', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (58, 'B8', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (59, 'B9', 3);
insert into SEAT(seat_id, seat_name, cinema_id) VALUES (60, 'B10', 3);

INSERT INTO USERS (user_id, username,email,password,enabled)
VALUES (01, 'user','user@gmail.com','$2a$06$dX.9.PI1PLkGRYs3YGp0BO1rg1dcL6HxEUivBCd.R2mVexum0K8mK', true);
INSERT INTO USERS (user_id, username,email,password,enabled)
VALUES (02, 'admin','admin@gmail.com','$2a$06$oFCA/0t8c7eRe3Ocf1PDTesyNbWd8HrNtDccbcBg1yMW.5B/Gt0t6', true);

INSERT INTO user_roles (user_role_id, user_id, role)
VALUES (1, 01, 'ROLE_USER');
INSERT INTO user_roles (user_role_id, user_id, role)
VALUES (2, 02, 'ROLE_ADMIN');