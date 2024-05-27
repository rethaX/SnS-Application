package SnS.System.SnSApplication.Repositories;

import SnS.System.SnSApplication.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
