package br.com.leorocha.statusservice.repos;

import br.com.leorocha.statusservice.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status, Long> {
    Status findByUserId(Long userId);
}
