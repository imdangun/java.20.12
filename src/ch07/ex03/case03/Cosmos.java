package ch07.ex03.case03;

public interface Cosmos {	
	public static Animal getAnimal(String animalName) { // factory method
		Animal animal = null;
		
		switch(animalName) {
		case "호랑이": animal = new Tiger(); break;
		case "매": animal = new Falcon();
		}
		
		return animal;
	}
}
