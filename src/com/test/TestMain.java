package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;





import org.junit.Test;

import com.beans.Employee;
import com.beans.Person;
import com.data.BeanData;


public class TestMain {
	

	@Test
	public void testEmployeeCountry(){
		
		List<Employee> employeeNameFromUkExpected = new ArrayList<Employee>();
		Person em0 = new Employee("Smith", "Adam", (short) (29), "United Kindom");
	    ((Employee) em0).setSalary(12574.51);
	    ((Employee) em0).setJobTitle("liberal economist");
		Employee em1 = new Employee("Riccardo", "David", (short)(35), "United Kindom");
		  ((Employee) em1).setSalary(12574.51);
		    ((Employee) em1).setJobTitle("liberal economist");
		employeeNameFromUkExpected.add((Employee) em0);
		employeeNameFromUkExpected.add(em1);
		List<Employee> employeeNameFromUkActual = new ArrayList<Employee>();
		BeanData b = new BeanData();
		employeeNameFromUkActual = b.testPredicate(com.data.BeanData.getEmployeeList(), a -> a.getCountry().equals("United Kindom") );
		assertTrue(employeeNameFromUkExpected.get(0).getName().equals(employeeNameFromUkActual.get(0).getName()));
		assertTrue(employeeNameFromUkExpected.get(1).getName().equals(employeeNameFromUkActual.get(1).getName()));
		assertEquals(employeeNameFromUkExpected.size(),employeeNameFromUkActual.size());
		
		
		
	}
	
	@Test
	public void testEmployeeSalary(){
		
		
		List<Employee> employeeNameFromUkActual = new ArrayList<Employee>();
		
		BeanData b = new BeanData();
		employeeNameFromUkActual = b.testPredicate(com.data.BeanData.getEmployeeList(), a -> a.getSalary()>10000 );

		assertEquals(2,employeeNameFromUkActual.size());
		
		
		
	}
	
	
	@Test
	public void testEmployeeSurnames(){
		
		
	
		List<Person> lists = BeanData.getEmployeeList();
		
		assertEquals("Adam",lists.get(0).getSurname());
		assertEquals("Milton",lists.get(4).getSurname());
		
		
	}


}
