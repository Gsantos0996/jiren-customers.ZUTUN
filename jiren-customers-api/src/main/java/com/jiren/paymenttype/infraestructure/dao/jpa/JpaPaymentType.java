package com.jiren.paymenttype.infraestructure.dao.jpa;

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
@Table(schema = "customers", name = "payment_type")
public class JpaPaymentType {
	@Id
	String guid;
		
	String description;
	String name;
	String alternativeName;
	Boolean sellin;
	Boolean sellout;
	String mode;
	Integer index;
	Boolean active;
	
	public JpaPaymentType(String guid) {
		this.guid = guid;
	}
}
