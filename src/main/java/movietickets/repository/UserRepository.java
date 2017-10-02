package movietickets.repository;

import movietickets.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);

    //User findByUserId(int userId);

    //List<User> findAll();


}
