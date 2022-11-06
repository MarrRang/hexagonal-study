package com.example.hexagonal.something.adapter.out;

import com.example.hexagonal.something.adapter.out.persistence.CalculateRepository;
import com.example.hexagonal.something.application.port.out.CalculateOutPort;
import com.example.hexagonal.something.domain.CalculateLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CalculateLogAdapter implements CalculateOutPort {
	private final CalculateRepository calculateRepository;

	public CalculateLogAdapter(CalculateRepository calculateRepository) {
		this.calculateRepository = calculateRepository;
	}

	@Override
	public CalculateLog getCalculateLog(int id) {
		return calculateRepository.findById(id).orElse(null);
	}

	@Override
	public List<CalculateLog> getAllCalculateLog() {
		return calculateRepository.findAll();
	}
}
