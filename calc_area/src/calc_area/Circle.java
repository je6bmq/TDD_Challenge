package calc_area;

public class Circle {
	private double r;
	public Circle(double r){
		this.r = r;
	}

	public int calculateArea(){
		return Round.round(r * r * Math.PI);
	}


}
