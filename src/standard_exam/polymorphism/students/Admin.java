package standard_exam.polymorphism.students;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Student[] studentArray) {
		/* implement */
		List<Student> list = new ArrayList<Student>();
		for (Student stu : studentArray) {
			list.add(stu);
		}
		return list;
	}

	public static double computeAverageGpa(List<Student> studentList) {
		/* implement */
		double sum = 0;
		for (Student stud : studentList) {
			sum += stud.computeGpa();
		}
		return sum / studentList.size();
	}
}
