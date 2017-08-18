package calc_area;

import java.util.ArrayList;
import java.util.Scanner;

public class calc_area {
	public static void main(String[] args){
		System.out.println("test");
		RadiusReader reader = new RadiusReader(new Scanner(System.in));
		System.out.println("test");
		ArrayList<Double> list = reader.getRadiusList();
		System.out.println("test");
		Circle c;

		System.out.println("test");

		for(int i=0;i<list.size();i++){
			 c = new Circle(list.get(i));

			System.out.println(c.calculateArea());
		}
	}
}
