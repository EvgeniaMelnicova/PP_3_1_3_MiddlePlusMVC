package ru.morrigan.springbootbootstrap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.morrigan.springbootbootstrap.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByUserRole(String userRole);
}