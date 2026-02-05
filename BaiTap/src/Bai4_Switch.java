import java.util.Scanner;
public class Bai4_Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ngay: ");
		int day = input.nextInt();
		
		String type = switch(day) {
			case 2,3,4,5 -> "Ngay lam viec!";
			case 7,8 -> "Ngay nghi";
			default -> "Ngay khong hop le";
		};
		System.out.print("Thu " + day + " la " +type);
		input.close();
	}
}
