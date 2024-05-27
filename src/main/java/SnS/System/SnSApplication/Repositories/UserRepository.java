package SnS.System.SnSApplication.Repositories;

import SnS.System.SnSApplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByUsernameAndPassword (String username, String password);
    User findbyPassword (String password);
}
