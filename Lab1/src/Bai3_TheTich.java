import java.util.Scanner;
public class Bai3_TheTich {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap canh: "); 
		double canh = input.nextDouble();
		
		double V = Math.pow(canh, 3);
		
		System.out.print("The tich khoi lap phuong: " +V);
		
		input.close();
	}

}
