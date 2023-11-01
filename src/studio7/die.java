package studio7;

public class die {
	private int n;
	
	public die(int n) {
		this.n = n;
	}
	
	public int random() {
		return (int)(Math.random() * (this.n - 1)) + 1;
	}
	
	public static void main(String[] args) {
		die nathanael = new die(100);
		System.out.println(nathanael.random());
	}
}