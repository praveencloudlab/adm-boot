package com.cts.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.patient.dao.DoctorDao;
import com.cts.patient.dao.PatientDao;
import com.cts.patient.entity.Doctor;
import com.cts.patient.entity.Patient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Application.class, args);

		PatientDao patientDao = ac.getBean(PatientDao.class);
		DoctorDao docDao = ac.getBean(DoctorDao.class);
		
		Patient p1=new Patient();
		Patient p2=new Patient();
		Patient p3=new Patient();
		
		Doctor d1=new Doctor();
		Doctor d2=new Doctor();
		Doctor d3=new Doctor();
		
		p1.setPatientName("Praveen");
		p2.setPatientName("James");
		p3.setPatientName("Kavya");
		
		d1.setDocName("Doc1");
		d2.setDocName("Doc2");
		d3.setDocName("Doc3");
		
		d1.getPatients().add(p1);
		d1.getPatients().add(p2);
		d1.getPatients().add(p3);
		
		d2.getPatients().add(p2);
		d2.getPatients().add(p3);
		
		d3.getPatients().add(p1);
		
		//docDao.saveAll(Arrays.asList(d1,d2,d3));
		//patientDao.saveAll(Arrays.asList(p1,p2,p3));
		
		
		Doctor doc = docDao.findById(10).orElse(null);
		System.out.println(doc.getDocId());
		System.out.println(doc.getDocName());
		System.out.println("-------------------------");
		for(Patient p:doc.getPatients()) {
			System.out.println(p.getPatientId());
			System.out.println(p.getPatientName());

		}
		
		
		
		

	}

}
