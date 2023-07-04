package com.fdp.mule.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {
	
	@Id
    public Integer id;
    public String name;

}
