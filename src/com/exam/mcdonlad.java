package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class mcdonlad {

	public static void main(String[] args) {
		menusystem ms = new menusystem();
		FileReader fr;
		BufferedReader br;
		String[] ary;
		
		try {
			fr = new FileReader("menu.txt");
			br = new BufferedReader(fr);
			ary = br.readLine().split(",");
			
			int count = Integer.parseInt(ary[0]);
			for (int i = 0; i < count; i++){
				int id = i+1;
				String name = ary[i*3+1];
				int price = Integer.parseInt(ary[i*3+2]);
				int kcal = Integer.parseInt(ary[i*3+3]);
				ms.foods.add(new Food(id, name, price,kcal));
			}
			ms.on();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
