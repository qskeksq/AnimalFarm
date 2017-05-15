package com.nadan.java.animal;

//추상 클래스로 선언한다. 객체로 사용할 수 없고 오직 상속을 통해서 사용한다. 동물의 공통적인 속성을 정의한다.
public abstract class Animal {
	
	public String kind;
	
	//모든 동물은 숨을 쉬는 속성을 가진다
	public void breathe(){
		System.out.println("숨을 쉽니다");
	}
	
	//소리는 다양하기 때문에 추상 메소드로 정의한다.
	public abstract void sound();
	
	

}
