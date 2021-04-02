package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="BankAccount")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount implements Serializable {
	@Id
@Column(name="AccNumber")
private Integer AccNumber;
@Column(name="ACHName", length=20, unique=true,nullable=false)
private String ACHName;
@Column(name="ACHMname", length=20, unique=true,nullable=false)
private String ACHMname;
@Column(name="ACHLname", length=20, unique=true,nullable=false)
private String ACHLname;
@Column(name="ACHAddress",  unique=true,nullable=false)
private String ACHAddress;
@Column(name="Email", unique=true,nullable=false)
private String Email;
@Column(name="Phone",length=20, unique=true,nullable=false)
private String Phone;
@Column(name="Nominies", length=20, unique=true,nullable=false)
private String Nominies;
@Column(name="openingdate")
private Date openingdate  ;

}
