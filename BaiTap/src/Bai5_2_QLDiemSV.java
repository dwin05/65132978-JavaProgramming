import java.util.*;
import java.util.stream.Collectors;
public class Bai5_2_QLDiemSV {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap so luong diem can nhap: ");
		int n = input.nextInt();
		List<Double> Diems = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			System.out.println("Nhap diem: ");
			Diems.add(input.nextDouble());
		}
		
		System.out.println("");
		System.out.println("DS diem vua nhap: ");
		Diems.stream().forEach(diem -> System.out.println("- " +diem));
		System.out.println(" ");
		
		if(!Diems.isEmpty()) {		
			// diem tb
			Double DTB = Diems.stream()
					.mapToDouble(Double::doubleValue)
					.average()
					.orElse(0.0);
			// diem max
			double diemMax = Diems.stream()
					.max(Double::compare)
					.get();
			// diem min
			double diemMin = Diems.stream()
					.min(Double::compare)
					.get();
			//sx
			List<Double> sxDiem = Diems.stream()
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Diem trung binh: " + DTB);
			System.out.println("Diem cao nhat: " + diemMax);
			System.out.println("Diem thap nhat: " + diemMin);
			System.out.println("Danh sach diem sau khi sx: " + sxDiem);
			} else System.out.println("DS trong!");		
		input.close();
	}
}
