package ru.morrigan.springbootbootstrap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.morrigan.springbootbootstrap.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByEmail(String email);
  User findByLogin(String login);
}
