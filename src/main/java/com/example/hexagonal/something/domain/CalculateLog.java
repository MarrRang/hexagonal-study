package com.example.hexagonal.something.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "CAL_LOG")
@Entity
public class CalculateLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "X")
	private int x;

	@Column(name = "Y")
	private int y;

	@Column(name = "RESULT")
	private int result;
}
