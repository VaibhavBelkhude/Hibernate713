package com.nt.model;

import lombok.Data;

@Data
public class Employee {
private Integer Eid;
private String Ename;
private String Eaddr;
private Float Esal;
public   Employee() {
	System.out.println("Employee::  0-param constructor");
}
}
