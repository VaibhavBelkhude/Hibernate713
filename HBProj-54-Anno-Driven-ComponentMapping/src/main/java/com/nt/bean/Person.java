package com.nt.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Person implements Serializable {
private Integer Pid;
@NonNull
private String Pname;
@NonNull
private String Paddr;
@NonNull
private JobDetails details;
}
