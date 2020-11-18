package com.test;

import java.util.Scanner;

/*
Напишите программу, которая получает с клавиатуры
имя, фамилию и возраст людей.
После того, как ввод завершён, программа выводит список всех людей в формате
Фамилия Имя Возраст и считает (и выводит последней строкой):
самый малый возраст, самый большой возраст, средний возраст (с точностью до сотых года).
*/

public class Test {
	
	public static String inputName() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		return name;
	}
	
	public static String inputSuname() {
		Scanner sc = new Scanner(System.in);
		String surname = sc.nextLine();
		return surname;
	}
	
	public static int inputAge() {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		return age;
	}

	public static void main(String[] args) {
		System.out.println("введите имя, фамилию, возраст: ");
		//Scanner sc = new Scanner(System.in);
		String names;
		
//		String[] suname;
//		int[] ages = 0;
		int i = 0;
		while (true) {
			//i++;
			
			names = inputName();
//			suname = inputSuname();
//			ages= inputAge();
		} 
		
//		System.out.println("имена: " + names);
//		System.out.println("Фамилия, имя, возраст: " + suname + " " + names + " " + ages);
	}
}