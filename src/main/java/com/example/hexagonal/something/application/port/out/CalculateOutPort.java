package com.example.hexagonal.something.application.port.out;

import com.example.hexagonal.something.domain.CalculateLog;

public interface CalculateOutPort {
	int add(int x, int y);
	int minus(int x, int y);
	int multiply(int x, int y);
	int divide(int x, int y);
	CalculateLog getCalculateLog(int id);
}
