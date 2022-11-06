package com.example.hexagonal.something.application.service;

import com.example.hexagonal.something.adapter.out.persistence.CalculateRepositoryAdapter;
import com.example.hexagonal.something.application.port.in.CalculateUseCase;
import com.example.hexagonal.something.domain.CalculateLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateService implements CalculateUseCase {
	private final CalculateRepositoryAdapter calculateRepositoryAdapter;

	public CalculateService(CalculateRepositoryAdapter calculateRepositoryAdapter) {
		this.calculateRepositoryAdapter = calculateRepositoryAdapter;
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}

	public CalculateLog getCalculateLog(int id) {
		return calculateRepositoryAdapter.findById(id).orElse(null);
	}

	public List<CalculateLog> getAllCalculateLog() {
		return calculateRepositoryAdapter.findAll();
	}
}
