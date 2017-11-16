package filterPattern.implementations;

import java.util.ArrayList;
import java.util.List;

import filterPattern.bean.Person;
import filterPattern.interfaces.Criteria;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePerson = new ArrayList<Person>();
		persons.stream().forEach(person -> {
			if("FEMALE".equalsIgnoreCase(person.getGender())){
				femalePerson.add(person);
			}
		});
		
		return femalePerson;
	}

}
