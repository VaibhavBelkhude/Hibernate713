package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Actor {
	private int actorId;
	private String actorName;
	private String actorAddrs;
	private long phone;
	private float remuneration;
  // private float age; 	

}
