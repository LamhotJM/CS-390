package standard_exam.ds.hashmap.ds.student;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key,Student>  hmap=new HashMap<>();
		Key k;
		for(Student stud: students) {
			k=new Key(stud.getFirstName(), stud.getLastName());
			
			hmap.put(k, stud);
		}
		System.out.println();
		
		return hmap;
	}
}
