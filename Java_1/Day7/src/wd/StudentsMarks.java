package wd;
import java.util.HashMap;
import java.util.Map;

public class StudentsMarks {

	public static void main(String[] args) {
		HashMap<String,Integer> student= new HashMap();
		student.put("Maruthi",25);
		student.put("Vasu",50);
		student.put("Sunny",100);
		int maruthimarks=student.get("Maruthi");
		System.out.println("Marks of Maruthi"+maruthimarks);
		
		System.out.println("------Marks of All Students-----");
		for (Map.Entry<String,Integer> entry: student.entrySet()) {
			String name=entry.getKey();
			int marks=entry.getValue();
			System.out.println(name+"="+marks);
		}

	}

}
