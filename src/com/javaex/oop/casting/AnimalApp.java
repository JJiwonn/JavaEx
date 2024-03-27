package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoop");
        // Upcasting : 부모 타입으로 자손 객체를 참조하는 것
		// 참조 타입에 설계된 것만 사용할 수 있다.
		
		dog1.eat();
		dog1.walk();
//		dog1.bark(); 설계도에 있는 것만 사용가능하다.
		
		Dog dog2 = new Dog("Doogy");
		
		dog2.eat();
		dog2.walk();
		dog2.bark(); // dog2는 dog1의 자식객체로 보기때문에 가능하다.
		
		// Downcasting : 명시적으로 타입을 지정
		// dog1을 bark() 짖도록 해보자
		
		((Dog)(dog1)).bark(); // Animal -> Dog로 캐스팅 후 dog1을 Dog로 바꿔주는 과정
		
		{
			Dog pet = new Dog("Azi");
			pet.eat();
			pet.walk();
			pet.bark();
			
			pet = null;
			
//			pet = new Cat("아즈라엘"); // 참조할 수 없다 형제관계이기때문에
			
		}
		{
			Animal pet = new Dog("Azi");
			pet.eat();
			pet.walk();
//			pet.bark();
			// 현재 pet이 어떤 클래스의 인스턴스인지 확인해야한다.
			if(pet instanceof Dog) {
				((Dog)pet).bark();
			}else if (pet instanceof Cat){
				((Cat)pet).meow();
			}
			
			pet = null;
			
			pet = new Cat("아즈라엘");
			pet.eat();
			pet.walk();
//			pet.meow();
		}
	}

}
