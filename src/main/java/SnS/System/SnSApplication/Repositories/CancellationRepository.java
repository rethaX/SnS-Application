package SnS.System.SnSApplication.Repositories;


import SnS.System.SnSApplication.Entity.Cancellation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancellationRepository extends JpaRepository<Cancellation, Long> {
}
