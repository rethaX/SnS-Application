package Entity;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<User> roles = new HashSet<>();

    // Getters and Setters
    // ...

}
