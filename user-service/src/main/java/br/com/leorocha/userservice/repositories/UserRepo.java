package br.com.leorocha.userservice.repositories;

import br.com.leorocha.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
  
}
