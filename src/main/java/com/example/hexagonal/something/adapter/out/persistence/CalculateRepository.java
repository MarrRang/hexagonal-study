package com.example.hexagonal.something.adapter.out.persistence;

import com.example.hexagonal.something.domain.CalculateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculateRepository extends JpaRepository<CalculateLog, Integer> {
}
