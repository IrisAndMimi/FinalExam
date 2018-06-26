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
			
			for (int s = 0; s < 7; s++){
				ary = br.readLine().split(",");
				for (int i = 0; i < 1; i++){
					int id = Integer.parseInt(ary[i*3]);
					String name = ary[i*3+1];
					int price = Integer.parseInt(ary[i*3+2]);
					int kcal = Integer.parseInt(ary[i*3+3]);
					ms.foods.add(new Food(id, name, price,kcal));

				}
			}
			
			ms.on();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
