package stl.tech.patient.reprository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stl.tech.patient.entity.Patient;


@Repository
public interface Patientreprository extends CrudRepository<Patient,Integer> 
{
	
	

}
