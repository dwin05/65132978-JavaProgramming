import java.util.Scanner;

import java.util.Random;
public class Bai5_1_GameDoanSo {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);		
		Random rd = new Random(); 
		boolean next = true;
		
		while(next) {
			int point;
			int time = 10;
			int soMayChon = rd.nextInt(100) + 1;
			int soLanDoan = 0;
			
			while(time > 0) {
				System.out.println("Ban co " +time+ " lan thu!");
				time --;
				
				System.out.print("Chon mot con so tu 1-100: ");
				int pick = input.nextInt();
				soLanDoan++;
				
				if(pick == soMayChon) {
					point = 10 - soLanDoan;
					System.out.println("Chuc mung ban da tra loi dung!");
					System.out.println("Ban co " +point +" diem!");
					break;
				}
				else if(pick > soMayChon)
					System.out.println("So can tim NHO hon!");
				else System.out.println("So can tim LON hon!");
			}
			if(time == 0)
				System.out.println("Ban da choi het luot!");
			
			System.out.println("Ban co muon choi tiep khong? (co/ko)");
			String choice = input.next();
			next = choice.equalsIgnoreCase("co");
		}
		System.out.println("Cam on ban da tham gia!");
		input.close();
	}
}
