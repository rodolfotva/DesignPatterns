package filterPattern.implementations;

import java.util.List;

import filterPattern.bean.Person;
import filterPattern.interfaces.Criteria;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		List<Person> secondCriteriaPersons = otherCriteria.meetCriteria(persons);
		
		secondCriteriaPersons.stream().forEach(person -> {
			if(firstCriteriaPersons.contains(person)){
				firstCriteriaPersons.add(person);
			}
		});
		
		return firstCriteriaPersons;
	}

}
