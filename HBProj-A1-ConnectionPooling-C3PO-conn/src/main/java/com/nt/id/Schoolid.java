package com.nt.id;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class Schoolid implements Serializable{
	private Integer CourseId;
	private Integer Schoolid;
}
