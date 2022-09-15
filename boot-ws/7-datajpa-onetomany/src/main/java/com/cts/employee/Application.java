package com.cts.employee;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.DepartmentDao;
import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(Application.class, args);
	
	EmployeeDao empDao = ac.getBean(EmployeeDao.class);
	DepartmentDao deptDao = ac.getBean(DepartmentDao.class);
	
	Department d1=new Department("HR", "Chennai");
	Department d2=new Department("Accounts", "Bangalore");
	Department d3=new Department("Training", "Delhi");
	Department d4=new Department("Payroll", "Hyderabad");
	
	Employee e1=new Employee("Praveen",150000);
	Employee e2=new Employee("James",46834);
	Employee e3=new Employee("Bucky",9337374);
	Employee e4=new Employee("Ozvitha",6342634);
	Employee e5=new Employee("Sravan",468886);
	
	d1.getEmps().add(e1);
	d1.getEmps().add(e2);
	d1.getEmps().add(e3);
	d1.getEmps().add(e4);
	d1.getEmps().add(e5);
	
	
	
	//deptDao.saveAll(Arrays.asList(d1,d2,d3,d4));
	//empDao.saveAll(Arrays.asList(e1,e2,e3,e4,e5));
	
	Department dept = deptDao.findById(1).orElse(null);
	
	System.out.println("Dept Id: "+dept.getDeptId());
	System.out.println("Dept Name: "+dept.getDeptName());
	
	for(Employee emp:dept.getEmps()) {
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println("------------------------------");
	}
	
	
	
	
	
	
	
	
	
	}

}
