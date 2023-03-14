package com.insper.gerenciadorBrasileirao.Time;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {
    Time findByIdentifier(String identifier);
}
