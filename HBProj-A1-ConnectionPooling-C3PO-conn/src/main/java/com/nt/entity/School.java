package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nt.id.Schoolid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity

public class School implements Serializable{
	
@EmbeddedId
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Schoolid id;
@Column(length=20)
private String Schname;
@Column(length=20)
private String Sname;
@Column(length=20)
private String Addr;
@Column(length=20)
private  String CourseName;
private   Integer StudentSize;
}
