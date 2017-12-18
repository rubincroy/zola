package com.zola.invoice.demo.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Invoice implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String id;
	
	@Column(name = "invoice_number", nullable= false)
	private String invoiceNumber;
	
	@Column(name = "po_number", nullable= false)
	private String poNumber;
	
	@Column(name = "due_date", nullable= false)
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	
	@Column(name = "amount_cents", nullable= false)
	private BigInteger amountCents;
	
	@Column(name = "created_at")
	@CreationTimestamp
	private Date createdAt;

	
	public Invoice() {
		super();
	}

	
	public Invoice(String id, String invoiceNumber, String poNumber, Date dueDate, BigInteger amountCents,
			Date createdAt) {
		super();
		this.id = id;
		this.invoiceNumber = invoiceNumber;
		this.poNumber = poNumber;
		this.dueDate = dueDate;
		this.amountCents = amountCents;
		this.createdAt = createdAt;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BigInteger getAmountCents() {
		return amountCents;
	}

	public void setAmountCents(BigInteger amountCents) {
		this.amountCents = amountCents;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
