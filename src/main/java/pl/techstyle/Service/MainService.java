package pl.techstyle.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pl.techstyle.Model.Person;

@Service
public class MainService {

	List<Person> person= new ArrayList<>(); 
	
	public MainService() {
		person.add(new Person(1,"Jan", "Kowalski", 23, 76, 167));
		person.add(new Person(2,"Jan", "Nowak", 33, 73, 177));
		person.add(new Person(3,"Marek", "Juer", 55, 76, 175));
		person.add(new Person(4,"Andrzej", "Kowalski", 33, 74, 169));
		person.add(new Person(5,"Mariusz", "Mariuszyn", 23, 76, 164));
		person.add(new Person(6,"Jakub", "Kowalski", 53, 86, 177));
	}
	
	public void deletePerson(int id) {
		person.remove(id);
	}
	
	public List<Person> getAll(){
		return person;
	}
}
