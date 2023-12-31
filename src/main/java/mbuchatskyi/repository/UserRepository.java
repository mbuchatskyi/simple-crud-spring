package mbuchatskyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mbuchatskyi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}