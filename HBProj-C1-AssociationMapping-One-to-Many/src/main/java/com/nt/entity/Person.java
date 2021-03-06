package com.nt.entity;

import java.io.Serializable;
import java.util.Set;



import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Person implements Serializable {
	private Integer pid;
    @NonNull
    private  String pname;
    @NonNull
    private  String paddrs;
    @NonNull
    private Set<BankAccount>  accounts;
    
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}
    
}
