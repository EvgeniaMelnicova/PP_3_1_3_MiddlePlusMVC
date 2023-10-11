package ru.morrigan.springbootbootstrap.service;

import lombok.AllArgsConstructor;
import ru.morrigan.springbootbootstrap.repository.RoleRepository;
import ru.morrigan.springbootbootstrap.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role getRole(String userRole) {
        return roleRepository.findByUserRole(userRole);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
