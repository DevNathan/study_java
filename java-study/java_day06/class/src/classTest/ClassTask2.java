package classTest;

import java.util.Scanner;

class Student {
	int Student_number;
	int Korean;
	int English;
	int Math;
	int total;
	double avg;
	

	public Student(int student_number, int korean, int english, int math) {
		super();
		Student_number = student_number;
		Korean = korean;
		English = english;
		Math = math;

		total = Korean + English + Math;
		avg = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
	
	
}
public class ClassTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student A_student = new Student(5123, 98, 96, 95);
		
		System.out.println("ÃÑ Á¡ : " + A_student.total);
		System.out.println("Æò ±Õ : " + A_student.avg);
	}
}
