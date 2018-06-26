package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menusystem {
	List<Food> foods = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	Food food;
	
	public void menu(){
		for (int i=0; i< foods.size(); i++){
			food = foods.get(i);
			System.out.println(food.getId() + ") " + food.getName());
		}
		System.out.println("0) 結算");
		System.out.println("q) 離開(結束程式)");
	}

	public void on() {
		int idlsr = -1;
		System.out.print("請輸入餐點:");
		idlsr = scanner.nextInt();
		int atlsr = -1;
		System.out.print("請輸入數量:");
		atlsr = scanner.nextInt();
//		foods.contains(idlsr);
		System.out.println("目前餐點:");
		food = foods.get(idlsr-1);
		System.out.println(food.getName()+" "+atlsr+"份");
	
	}

	public void writer() {
		System.out.println("目前餐點:");
		
	}
	
}
