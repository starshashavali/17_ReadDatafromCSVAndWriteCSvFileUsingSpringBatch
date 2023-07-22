package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	private String name;
	private Integer salary;
}