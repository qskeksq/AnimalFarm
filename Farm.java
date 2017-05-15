package com.nadan.java.animal;

public class Farm {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		dog.sound();
		
		//상속을 통한 다형성 구현-필드 다형성 구현
		Animal cat2 = new Cat();
		Animal dog2 = new Dog();
		
		cat2.sound();
		dog2.sound();
		
		//상속을 통한 다형성 구현-필드 다형성 구현
		sound2(new Dog());
		sound2(new Cat());

	}
	
	public static void sound2(Animal animal){
		animal.sound();
	}

}
