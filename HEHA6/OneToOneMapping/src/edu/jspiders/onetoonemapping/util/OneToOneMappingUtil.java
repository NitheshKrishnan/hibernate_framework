package edu.jspiders.onetoonemapping.util;

import edu.jspiders.onetoonemapping.dao.OneToOneMappingDAO;
import edu.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import edu.jspiders.onetoonemapping.dto.TrainerProfessionalDTO;

public class OneToOneMappingUtil {

	public static void main(String[] args) {
		
		TrainerProfessionalDTO trainer = new TrainerProfessionalDTO();
		
		trainer.setFirstName("Shikhar");
		trainer.setLastName("Dhawan");
		trainer.setSalary(4.2);
		trainer.setExperience(5.6);
	
		TrainerPersonalDTO personal = new TrainerPersonalDTO();
		
		personal.setMotherTongue("Hindi");
		personal.setHometown("UP");
		personal.setStatus("Married");
	
		OneToOneMappingDAO dao = new OneToOneMappingDAO();
		
		dao.insert(trainer, personal);
	}
}
