package movietickets.repository;

import movietickets.domain.model.Screening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jmtapang on 9/28/17.
 */
@Repository
public interface ScreeningRepository extends CrudRepository<Screening, Long> {

    //Screening screeningId(int screenId);

    List<Screening> findAll();
}
