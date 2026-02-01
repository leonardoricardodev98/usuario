package com.leonardoricardo.demo.infrastructure.repository;

import com.leonardo.aprendendo_spring1.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
