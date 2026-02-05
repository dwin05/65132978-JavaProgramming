
public class Bai2_2_QuyDoiTienTe {

	public static void main(String[] args) {
		double VND = 50000;
		
		double USD = VND / 23500;
		double EUR = VND / 27000;
		
		System.out.println(+VND+"VND -> USD = "+ String.format("%.3f",USD));
		System.out.println(+VND+"VND -> EUR = "+ String.format("%.3f",EUR));
	}
}

