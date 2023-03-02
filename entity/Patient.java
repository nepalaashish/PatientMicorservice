package stl.tech.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String name;
	
	private int age;
	
	
	public Patient(String name, int pid, int age) 
	{
		super();
		this.name = name;
		this.pid = pid;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Patient() 
	{
		super();
	}


	@Override
	public String toString() 
	{
		return "Patient [name=" + name + ", pid=" + pid + ", age=" + age + "]";
	}
	
	
	}
