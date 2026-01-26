import java.util.Scanner;
public class Lab3_Bai1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = input.nextInt();
		boolean ok  = true;
		
		if (n < 2 ) ok = false;
		else {
			for(int i = 2; i< n-1; i++) {
				if(n % i == 0) {
					ok = false;
					break;
				}	
			}
		}
		if (ok) 
			System.out.println(n + " la so nguyen to");
		else 
			System.out.println(n + " khong la so nguyen to");
	}
}
