import java.util.*;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Bai5_3_XuLyVB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap mot doan van ban: ");
		String vb = input.nextLine();
		
		if(vb == null) {
			System.out.print("Van ban trong!");
			return;
		}
		// dem so tu
		long soTu = Stream.of(vb.trim().split("\\s+"))// tim khoang trang
				.parallel()
				.count();
		// so cau
		long soCau = Stream.of(vb.trim().split("[.!?]+"))
				.parallel()
				.filter(s -> !s.trim().isEmpty())// khoang trang trong tung phan tu
				.count();
		// tu xuat hien nhieu
		String tuNhieuNhat = Stream.of(vb.toLowerCase().split("\\W+"))
                .parallel()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Khong co");
		// dao nguoc 
		String daoNguoc = new StringBuilder(vb).reverse().toString();
		
		System.out.println("\n--- KQ ---");
        System.out.println("So luong tu: " + soTu);
        System.out.println("So luong cau: " + soCau);
        System.out.println("Tu xuat hien nhieu nhat: '" + tuNhieuNhat + "'");
        System.out.println("Dao nguoc vb: " + daoNguoc);
	
        input.close();
	}

}
