package edu.jspiders.manytoonemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="feedback_table")
public class FeedbackDTO {
	
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Id
	@Column(name="id")
	private int id;
	@Column(name="feedback")
	private String feedback;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="subject_batch_code")
	private SubjectDTO subject;
	
	public SubjectDTO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDTO subject) {
		this.subject = subject;
	}

	public FeedbackDTO() {
	}
	
	public FeedbackDTO(String feedback) {
		this.feedback = feedback;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "FeedbackDTO [id=" + id + ", feedback=" + feedback + "]";
	}
	
}
