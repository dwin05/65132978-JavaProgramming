import java.util.Scanner;
public class Bai1_1_InND {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap ten cua ban: ");
		String Ten = input.nextLine();
		
		System.out.print("Nhap khoa: ");
		String Khoa = input.nextLine();
		
		System.out.print("Nhap lop: ");
		String Lop = input.nextLine();
		
		System.out.println("\nTen: " +Ten);
		System.out.println("Khoa: " +Khoa);
		System.out.println("Lop: " +Lop);
		
		input.close();
	}	
}
