package com.ElectroWorld.ElectroWorld.POJO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="feedback_table")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private int feedbackId;
	
	@NotEmpty
	private String feedback_comment;
	
	@NotEmpty
	private Date feedback_date;
	
	@NotEmpty
	private String rating;
	
	
	@ManyToOne(targetEntity = Customer.class)
	private Customer cust;
	/*
	 * @JoinColumn(name="customer_id") private Customer cust;
	 */

	public int getFeedbackId() {
		return feedbackId;
	}


	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}


	public String getFeedback_comment() {
		return feedback_comment;
	}


	public void setFeedback_comment(String feedback_comment) {
		this.feedback_comment = feedback_comment;
	}


	public Date getFeedback_date() {
		return feedback_date;
	}


	public void setFeedback_date(Date feedback_date) {
		this.feedback_date = feedback_date;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public Customer getCust() {
		return cust;
	}


	public void setCust(Customer cust) {
		this.cust = cust;
	}


	public Feedback(int feedbackId, @NotEmpty String feedback_comment, @NotEmpty Date feedback_date,
			@NotEmpty String rating, Customer cust) {
		super();
		this.feedbackId = feedbackId;
		this.feedback_comment = feedback_comment;
		this.feedback_date = feedback_date;
		this.rating = rating;
		this.cust = cust;
	}


	public Feedback() {
		super();
	}


	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", feedback_comment=" + feedback_comment + ", feedback_date="
				+ feedback_date + ", rating=" + rating + ", cust=" + cust + "]";
	}
	
	
	
	
	
	
	
	
}
