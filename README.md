# AnimalFarm

### 추상메소드를 이용하여 만든 동물농장

- 상속을 통한 다형성 구현의 이해
- 매개변수를 통한 다형성의 구현
- 추상 클래스 사용

> 동물들의 공통 속성을 가진 추상 클래스

```java
public abstract class Animal {

	public String kind;

	//동물들의 공통 속성
	public void breathe(){
		System.out.println("숨을 쉽니다");
	}

	//소리는 다양하기 때문에 추상 메소드로 정의
	public abstract void sound();

}
```

> 상속과 오버라이딩

```java
// 고양이
public class Cat extends Animal{
	//추상 메소드 오버라이드
	public void sound(){
		System.out.println("야옹");
	}
}

// 강아지
public class Dog extends Animal{
	//추상 메소드 오버라이드
	public void sound(){
		System.out.println("멍멍");
	}
}
```

> 다형성을 이용한 동물농장 구현

```java
public class Farm {

	public static void main(String[] args) {
		//상속을 통한 다형성 구현
		Animal cat2 = new Cat();
		Animal dog2 = new Dog();
		cat2.sound();
		dog2.sound();

		//매개변수 다형성
		sound2(new Dog());
		sound2(new Cat());
	}

  // 매개변수 다형성
	public static void sound2(Animal animal){
		animal.sound();
	}
}
```
