package SnS.System.SnSApplication.Repositories;

import SnS.System.SnSApplication.Entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
