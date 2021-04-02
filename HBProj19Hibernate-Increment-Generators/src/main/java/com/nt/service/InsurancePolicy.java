package com.nt.service;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePolicy implements Serializable {
	private Long  policyId;
	private String policyName;
	private  String company;
	private  Float tenure;
}
