package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CallerTune implements Serializable {
private Integer callerTuneId;
private String callerName;
private String provider;
private Long mobileNo;
private Integer changeCount;
}
