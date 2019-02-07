package edu.jspiders.onetomanymapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects_table")
public class SubjectDTO {
	
	@Id
	@Column(name="batch_code")
	private String batchCode;
	@Column(name="subject")
	private String subject;

	public SubjectDTO() {
	}
	
	public SubjectDTO(String batchCode, String subject) {
		this.batchCode = batchCode;
		this.subject = subject;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "SubjectDTO [batchCode=" + batchCode + ", subject=" + subject + "]";
	}
}
