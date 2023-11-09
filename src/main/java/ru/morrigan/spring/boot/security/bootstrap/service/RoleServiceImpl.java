package ru.morrigan.spring.boot.security.bootstrap.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.morrigan.spring.boot.security.bootstrap.model.Role;
import ru.morrigan.spring.boot.security.bootstrap.repository.RoleRepository;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
  private final RoleRepository roleRepository;

  @Override
  public Set<Role> getAllRoles() {
    return StreamSupport
        .stream(roleRepository.findAll().spliterator(), false)
        .collect(Collectors.toSet());
  }

  @Override
  public void save(Role role) {roleRepository.save(role);}

  @Override
  public Role getRoleByName(String role) {
    return roleRepository.findByName(role);
  }
}
