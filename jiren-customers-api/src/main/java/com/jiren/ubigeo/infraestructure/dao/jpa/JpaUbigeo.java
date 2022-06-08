package com.jiren.ubigeo.infraestructure.dao.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "customers", name = "ubigeo")
public class JpaUbigeo {
	@Id
	String guid;
	
	String district;
	String province;	
	String department;	
}
