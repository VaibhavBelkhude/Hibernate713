package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
private Integer Sid;
private String Sname;
private String saddr;
private Float Fees;
}
