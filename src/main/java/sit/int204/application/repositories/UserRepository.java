package sit.int204.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sit.int204.application.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
