package calc_area;

import java.util.ArrayList;
import java.util.Scanner;

public class calc_area {
	public static void main(String args[]){
		RadiusReader reader = new RadiusReader(new Scanner(System.in));
		ArrayList<Double> list = reader.getRadiusList();
		Circle c;

		for(int i=0;i<list.size();i++){
			 c = new Circle(list.get(i));

			System.out.println(c.calculateArea());
		}
	}
}
