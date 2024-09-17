package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Mapping.StudentDoa;
import Model.Student;

public class Controller {
	StudentDoa studentDoa = new StudentDoa();
	public void Insert() {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Student Name: ");
			String name = br.readLine();
			System.out.println("Enter the Student Grade: ");
			String grade = br.readLine();
			System.out.println("Enter the Student Gender: ");
			String gender = br.readLine();
			System.out.println("Enter the Student Address: ");
			String address = br.readLine();
			System.out.println("=================================");
			Student student = new Student(name, grade, gender, address);
			studentDoa.saveStudent(student);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void Delete() {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the RollNumber: ");
			String sId = br.readLine();
			System.out.println("=================================");
			studentDoa.deleteStudent(Integer.parseInt(sId));
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void Update() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the Student roll number which data need to be updated: ");
			String sid = br.readLine();
			System.out.println("Enter the Student Name: ");
			String name = br.readLine();
			System.out.println("Enter the Student Grade: ");
			String grade = br.readLine();
			System.out.println("Enter the Student Gender: ");
			String gender = br.readLine();
			System.out.println("Enter the Student Address: ");
			String address = br.readLine();
			System.out.println("=================================");
			Student student = new Student(Integer.parseInt(sid),name,grade,gender,address);
			studentDoa.updateStudent(student);
			
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	public void Show() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the RollNumber: ");
			String sId = br.readLine();
			System.out.println("=================================");
			Student student = studentDoa.showStudent(Integer.parseInt(sId));
			System.out.println("Student Informatio =" + student.toString());
		} catch (Exception e) {
			e.getMessage();

		}

	}
}
