package com.nt.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {
private Integer Eid;
private String Ename;
private String Eaddr;
private Float Esal;
public   Employee() {
	System.out.println("Employee::  0-param constructor");
}
}
