package studio7;

public class rectangle {

	private double length; 
	private double width;

	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return this.length * this.width;
	}

	public double perimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public double getLength() {
		return this.length;
	}

	public static void main(String[] args)  {
		rectangle carrie = new rectangle(25.0, 25.0);
		rectangle maddie = new rectangle(12.0, 13.0);

		if (carrie.area() > maddie.area()) {
			System.out.println("carrie wins");		
		} else {
			System.out.println("maddie wins");
		}

		if (carrie.area() == Math.pow(carrie.getLength(), 2)) {
			System.out.println("carrie is square");
		}

		if (maddie.area() == Math.pow(maddie.getLength(), 2)) {
			System.out.println("maddie is square");
		}

	}


}
