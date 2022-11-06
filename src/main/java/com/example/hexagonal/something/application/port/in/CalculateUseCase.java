package com.example.hexagonal.something.application.port.in;

import com.example.hexagonal.something.domain.CalculateLog;

import java.util.List;

public interface CalculateUseCase {
	CalculateLog getCalculateLog(int id);
	List<CalculateLog> getAllCalculateLog();
}
