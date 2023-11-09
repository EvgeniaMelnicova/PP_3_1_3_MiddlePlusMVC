package ru.morrigan.spring.boot.security.bootstrap.service;

import ru.morrigan.spring.boot.security.bootstrap.model.Role;
import java.util.Set;

public interface RoleService {
  Set<Role> getAllRoles();
    void save(Role role);

  Role getRoleByName(String role);
}
