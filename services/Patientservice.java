package stl.tech.patient.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import stl.tech.patient.entity.Patient;
import stl.tech.patient.reprository.Patientreprository;



@Service
public class Patientservice {
	
	@Autowired
	public Patientreprository Patientrepo;
	
	public List <Patient> getallpatient()
	{
		List<Patient> list = (List<Patient>) this.Patientrepo.findAll( );
		return list;
	}
	
	

	public void updatepatient(int pid ,Patient patient) 
	{
		Patientrepo.save(patient);
		
	}
	
	public void deletepatient(@PathVariable int pid ) 
	{
		Patientrepo.deleteById(pid);;
		
	}

	



	public Patient save(Patient patient) {
		// TODO Auto-generated method stub
		return Patientrepo.save(patient);
	}

	
	

}
