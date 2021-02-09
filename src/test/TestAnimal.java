package test;

import domain.Pig;

public class TestAnimal {
	
	public static void main(String[] args) {
		Pig pig = new Pig("Piggy", 30, 350);
		
		pig.eat();
		pig.run();
		pig.hunt();
		pig.sleep();
		pig.speak();
		
		System.out.println("\n" + pig);
	}
}
