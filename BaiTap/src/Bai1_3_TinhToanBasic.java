import java.util.Scanner;
public class Bai1_3_TinhToanBasic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so thu nhat: ");
		int a = input.nextInt();
		
		System.out.print("Nhap so thu hai: ");
		int b = input.nextInt();
		
		System.out.println("\nTong cua " + a +" va " + b + " : " +(a+ b));
		System.out.println("Hieu cua " + a +" va " + b + " : " +(a- b));
		System.out.println("Tich cua " + a +" va " + b + " : " +(a* b));
		System.out.println("Thuong cua " + a +" va " + b + " : " +(a/ b));
		input.close();
	}
}
