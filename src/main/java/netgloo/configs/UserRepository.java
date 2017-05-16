package netgloo.configs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import netgloo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
