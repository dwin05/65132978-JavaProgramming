import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai5_CacKieuLuuMang {

	public static void main(String[] args) {
		//co the add duoc
				List<String> Fruits = new ArrayList<>();
				Fruits.add("Tao");
				Fruits.add("Chuoi");
				Fruits.add("Cam");
				System.out.println("DS trai cay: ");
				for(String fruit : Fruits) {
					System.out.println( "- "+ fruit);
				}
				// co dinh
				List<Integer> Numbers = List.of(10, 9, 8, 7);
				int Sum = 0;
				for(int num : Numbers) {
					Sum += num;
				}
				double TBC = (double) Sum/Numbers.size();
				System.out.println("TBC: " +TBC);
				
				// co dinh
				var colors = new String[] {"Đỏ", "Xanh", "Vàng"};
		        for (var color : colors) {
		            System.out.println("Màu: " + color);
		        }
		        Map<String, Integer> studentScores = new HashMap<>();
		        studentScores.put("An", 85);
		        studentScores.put("Bình", 92);
		        studentScores.put("Châu", 78);
		        
		        for (var entry : studentScores.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		        
		        List<String> names = List.of("An", "Bình", "Châu", "Dũng");

		        System.out.println("\n3. Stream API với forEach:");
		        //names.stream().forEach(name -> System.out.println("- " + name));
		        names.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println("- " + name));
		        // chi dung de tao list 
		        System.out.println("\n4. Method reference:");
		        names.forEach(System.out::println);
	}

}
