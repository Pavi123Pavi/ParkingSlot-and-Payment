package com.parkingslotallocation.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Payment")
public class Payment {
	@Id
	@Column(name = "Payment_Id")
	private long paymentId;
	@Column(name = "Payment_Type")
	@Enumerated(EnumType.ORDINAL)
	private PaymentType type;
	@Column(name = "Payment_Date_Time")
	private Date paymentDateTime;
	@Column(name = "Amount_Paid")
	private double amountPaid;
	@Column(name = "Payment_Status")
	@Enumerated(EnumType.ORDINAL)
	private PaymentStatus status;
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public PaymentType getType() {
		return type;
	}
	public void setType(PaymentType type) {
		this.type = type;
	}
	public Date getPaymentDateTime() {
		return paymentDateTime;
	}
	public void setPaymentDateTime(Date paymentDateTime) {
		this.paymentDateTime = paymentDateTime;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	Payment(long paymentId, PaymentType type, Date paymentDateTime, double amountPaid, PaymentStatus status) {
		super();
		this.paymentId = paymentId;
		this.type = type;
		this.paymentDateTime = paymentDateTime;
		this.amountPaid = amountPaid;
		this.status = status;
	}
	Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
