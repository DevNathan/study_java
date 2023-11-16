package equalsTest;

class Student {
	int studentID;
	String studentName;
	int age;
	
	public Student() {;}

	public Student(int studentID, String studentName, int age) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.age = age;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + studentID;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj instanceof Student) {
			Student anotherStudent = (Student) obj;
			if(this.studentID==anotherStudent.getStudentID()) {
				return true;
			}
		}
		return false;
	}
	
	
}
public class EqualsTest {
	public static void main(String[] args) {
		Student student1 = new Student(152, "조남호", 23);
		
		if(student1.equals(new Student(152, "조남호", 23))) {
			System.out.println("대여완료");
		}else {
			System.out.println("도난 신고중");
		}
	}
}
