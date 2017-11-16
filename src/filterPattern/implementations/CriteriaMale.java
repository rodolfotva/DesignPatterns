package filterPattern.implementations;

import java.util.ArrayList;
import java.util.List;

import filterPattern.bean.Person;
import filterPattern.interfaces.Criteria;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		persons.stream().forEach(person -> {
			if("MALE".equalsIgnoreCase(person.getGender())){
				malePerson.add(person);
			}
		});
		
		return malePerson;
	}

}
