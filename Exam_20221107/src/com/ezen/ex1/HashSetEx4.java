package com.ezen.ex1;
/*
 * p634 예제 11-23
 */
import java.util.HashSet;
import java.util.Objects;

public class HashSetEx4 {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		
		System.out.println(set);
		
	}
}

class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		System.out.println("hashCode");
//		return (name+age).hashCode();
		return Objects.hash(name,age);
	}
	
	public String toString() {
		return name + ":" + age;
	}
}