package br.com.paganidev.estudocamadas.repositories;

import br.com.paganidev.estudocamadas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
