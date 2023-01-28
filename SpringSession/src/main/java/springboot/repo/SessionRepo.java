package springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springboot.model.SessionModel;

@Repository
public interface SessionRepo extends CrudRepository<SessionModel,Long> {

}
