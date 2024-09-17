package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentInfo")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment for MySQL
	private int rollNumber;

	private String studentName;
	private String grade;
	private String gender;
	private String address;

	public Student(int rollNumber, String studentName, String grade, String gender, String address) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.grade = grade;
		this.gender = gender;
		this.address = address;
	}

	public Student(String studentName, String grade, String gender, String address) {
		this.studentName = studentName;
		this.grade = grade;
		this.gender = gender;
		this.address = address;
	}

	public Student() {
		super();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", grade=" + grade + ", gender="
				+ gender + ", address=" + address + "]";
	}

}
