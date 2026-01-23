
import java.util.Scanner;
public class Bai1_DTB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String hoTen = input.nextLine();
		
		System.out.print("Type your AVG point: ");
		Double diemTB = input.nextDouble();
		
		System.out.println("");
		System.out.println("STUDENT'S INFOR: ");
		System.out.println("Name: " + hoTen);
		System.out.println("AVG point: " + diemTB);
		
		input.close();
	}
}
