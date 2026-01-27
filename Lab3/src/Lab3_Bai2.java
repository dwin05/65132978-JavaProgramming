import java.util.Scanner;
public class Lab3_Bai2 {
	static Scanner input = new Scanner(System.in);
	
	static void BangCuuChuong() {
		for(int i = 2; i<=9; i++) {
			System.out.println("Bang cuu chuong " +i);
			for(int j = 2; j <= 9; j++) {
				System.out.println(i +"x" +j+ "=" +(i*j));
			}
			System.out.println();
		}
	}
	
	static void NhapBCC() {
		System.out.print("Nhap bang cuu chuong can in: ");
		int n = input.nextInt();
		System.out.println(" ");
		System.out.println("Bang cuu chuong " +n+": ");
		for(int i = 2; i<10; i++) {
			System.out.println( n+ " x " +i+ " = " +n*i);
		}
	}
	
	static int menu() {
		System.out.println(" ");
		System.out.println("1. In ra tat ca bang cuu chuong");
		System.out.println("2. lua chon BCC");
		System.out.println("3. Ket thuc");
		System.out.print("Chon chuc nang: ");
		return input.nextInt();
	}
	public static void main(String[] args) {
		int chon;
		do {
			chon = menu();
			switch(chon) {
			case 1: BangCuuChuong(); break;
			case 2: NhapBCC(); break;
			case 3: System.out.println("Dung chuong trinh");
			default: System.out.println("Chuc nang khong hop le!");
			}
		}while(chon <4);
		
	}
}
