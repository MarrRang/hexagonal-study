package com.example.hexagonal.something.application.service;

import com.example.hexagonal.something.application.port.in.CalculateUseCase;
import com.example.hexagonal.something.application.port.out.CalculateOutPort;
import com.example.hexagonal.something.domain.CalculateLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateService implements CalculateUseCase {
	private final CalculateOutPort calculateOutPort;

	public CalculateService(CalculateOutPort calculateOutPort) {
		this.calculateOutPort = calculateOutPort;
	}

	public CalculateLog getCalculateLog(int id) {
		return calculateOutPort.getCalculateLog(id);
	}

	public List<CalculateLog> getAllCalculateLog() {
		return calculateOutPort.getAllCalculateLog();
	}
}
