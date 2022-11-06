package com.example.hexagonal.something.adapter.in;

import com.example.hexagonal.something.application.service.CalculateService;
import com.example.hexagonal.something.domain.CalculateLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculateController {
	private final CalculateService calculateService;

	public CalculateController(CalculateService calculateService) {
		this.calculateService = calculateService;
	}

	@GetMapping("/log")
	public List<CalculateLog> getAllCalculateLog() {
		return calculateService.getAllCalculateLog();
	}

	@GetMapping("/log/{id}")
	public CalculateLog getCalculateLogById(@PathVariable("id") int id) {
		return calculateService.getCalculateLog(id);
	}
}
