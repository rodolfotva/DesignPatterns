package filterPattern.interfaces;

import java.util.List;

import filterPattern.bean.Person;

public interface Criteria {

	List<Person> meetCriteria(List<Person> persons);
}
