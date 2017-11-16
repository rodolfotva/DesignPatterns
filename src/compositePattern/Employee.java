package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String dept;
	private Integer salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, Integer salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

   public void addSubrdinate(Employee e) {
      subordinates.add(e);
   }

   public void removeSubrdinate(Employee e) {
	   subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
	   return subordinates;
   }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates + "]";
	}
	
	
	
}
