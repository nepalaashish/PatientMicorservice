package stl.tech.patient.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import stl.tech.patient.entity.Patient;
import stl.tech.patient.services.Patientservice;

@RestController
public  class PatientController {
	
	@Autowired
	private Patientservice patientservice;
	
	@GetMapping("/Patient")
	public List <Patient> getallpatient() 
	{
	
		 return patientservice.getallpatient();
	}
	
	@PostMapping("/Patient")
	public Patient addpatient(@RequestBody Patient patient)
	 {
		 Patient p = patientservice.save(patient);
		 return p;
        }
	 @PutMapping("/Patient/{Pid}")
		public void updatepatient(@PathVariable ("Pid") int Pid,@RequestBody Patient patient) 
		{
	        patientservice.updatepatient(Pid, patient);
	    }
	 
	 @DeleteMapping("/Patient/{Pid}")
		public void deletepatient(@PathVariable("Pid") int Pid) 
		{
			patientservice.deletepatient(Pid);
		}

}
