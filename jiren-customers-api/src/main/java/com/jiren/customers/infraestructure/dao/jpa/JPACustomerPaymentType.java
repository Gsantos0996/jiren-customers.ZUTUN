package com.jiren.customers.infraestructure.dao.jpa;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(schema = "customers", name = "customer_payment_type")
public class JPACustomerPaymentType {
	@Id
	String guid;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_guid", referencedColumnName = "guid", nullable = false)
	JPACustomer customer;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_guid", referencedColumnName = "guid", nullable = false)
	JPAPaymentType paymentType;
	
	Integer type;
	Boolean active;
}
