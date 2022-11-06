package com.example.hexagonal.something.application.port.out;

import com.example.hexagonal.something.domain.CalculateLog;

import java.util.List;

public interface CalculateOutPort {
	CalculateLog getCalculateLog(int id);
	List<CalculateLog> getAllCalculateLog();
}
