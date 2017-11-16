package filterPattern.implementations;

import java.util.ArrayList;
import java.util.List;

import filterPattern.bean.Person;
import filterPattern.interfaces.Criteria;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePerson = new ArrayList<Person>();
		persons.stream().forEach(person -> {
			if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
				singlePerson.add(person);
			}
		});
		
		return singlePerson;
	}

}
