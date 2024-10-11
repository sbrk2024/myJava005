package kim.chinatelecom.myjava005.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kim.chinatelecom.myjava005.models.ERole;
import kim.chinatelecom.myjava005.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}