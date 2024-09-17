package EcommercialSite.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Controller.Controller;
import Mapping.Connection;
import Model.Student;


public class Information {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Controller controller = new Controller();
		try{
			while(true) {
				System.out.println("=================================");
				System.out.println("Enter 1 to Insert data: ");
				System.out.println("Enter 2 to Delete data: ");
				System.out.println("Enter 3 to Show data: ");
				System.out.println("Enter 4 to Update data: ");
				System.out.println("Enter 5 to Exit: ");
				System.out.println("=================================");
				String selectNumber = br.readLine();
				System.out.println("=================================");
				switch(selectNumber) {
				case "1":
					controller.Insert();
					break;
				case "2":
					controller.Delete();
					break;
				case "3":
					controller.Show();
					break;
				case "4":
					controller.Update();
					break;
				case "5":
					System.out.println("Exit!!");
					return;
				default:
					break;
				
			}
		}
			
		}catch(Exception e) {
			e.getMessage();
		}}
	
		
}
		

