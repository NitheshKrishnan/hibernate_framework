package edu.jspiders.onetoonemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="trainer_professional")
public class TrainerProfessionalDTO {

	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="salary")
	private double salary;
	@Column(name="experience")
	private double experience;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainer_personal_id")
	private TrainerPersonalDTO personal;
	
	public TrainerPersonalDTO getPersonal() {
		return personal;
	}

	public void setPersonal(TrainerPersonalDTO personal) {
		this.personal = personal;
	}

	public TrainerProfessionalDTO() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "TrainerProfessionalDTO [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", experience=" + experience + "]";
	}
}
