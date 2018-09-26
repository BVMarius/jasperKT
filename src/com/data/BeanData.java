package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.beans.*;

public class BeanData {
	
	public static List<Person> getEmployeeList(){
		
		List<Person> employees = new ArrayList<>();
			
			Person em0 = new Employee("Smith", "Adam", (short) (29), "United Kindom");
		    ((Employee) em0).setSalary(1574.51);
		    ((Employee) em0).setJobTitle("liberal economist");
			Person em1 = new Employee("Riccardo", "David", (short)(35), "United Kindom");
			  ((Employee) em1).setSalary(22574.51);
			    ((Employee) em1).setJobTitle("liberal economist");
			Person em2 = new Employee("Madgearu", "Virgil", (short)(47), "Romania");
			((Employee) em2).setSalary(12574.51);
		    ((Employee) em2).setJobTitle("conservative economist");
			Person em3 = new Employee("Marx", "Karl", (short)(41), "Germany");
			((Employee) em3).setSalary(105.51);
		    ((Employee) em3).setJobTitle("communist economist");
			Person em4 = new Employee("Friedmann", "Milton", (short)(30), "United States");
			((Employee) em4).setSalary(2105.51);
		    ((Employee) em4).setJobTitle("liberal economist");
		
		employees.add(em0);
		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		
	
		
		
			
		
		
		return employees;
		
		
		
	}
	
	
    public List testPredicate(List<Person> pers, Predicate<Employee> pred ){
    	
    	java.util.List<Person> result = new java.util.ArrayList<>();
    	
    	for(Person p : pers){
    		if(pred.test((Employee) p))
    			result.add(p);
    		//System.out.println(p);
    	}
		return result;
    }
	
	

}
