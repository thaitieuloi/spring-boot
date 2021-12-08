package com.ttl.oop.b5;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ManagerHotel {
	private List<Person> persons;

	public ManagerHotel() {
		persons = new ArrayList<>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	public boolean delete(String passport) {
		Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
		if (person == null) {
			return false;
		} else {
			this.persons.remove(person);
			return true;
		}
	}

	public int calculator(String passport) {
		Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
		if (person == null) {
			return 0;
		}
		return person.getRoom().getPrice() * person.getNumberRent();
	}

	public void show() {
		this.persons.forEach(p -> System.out.println(p.toString()));
	}
}
