package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Actor {
	 private Integer actorId;
	 private String actorName;
	 private String actorAddrs;
	 private Long phone;
	 private Float remuneration;



}
