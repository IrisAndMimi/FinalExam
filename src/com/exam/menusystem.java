package com.exam;

import java.util.ArrayList;
import java.util.List;

public class menusystem {
	List<Food> foods = new ArrayList<>();
	
	public void on(){
		for (int i=0; i< foods.size(); i++){
			Food food = foods.get(i);
			System.out.println(food.getId() + ") " + food.getName());
		}
		System.out.println("0) 結算");
		System.out.println("q) 離開(結束程式)");
	}
	
}
