package studentdatabaseApp;
import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1001;
	
	
	
	//Constructor : prompt user to enter students's name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName+" "+lastName+" "+gradeYear);
		
		setStudentID();
		
		//System.out.println(firstName+ " " +lastName+ " " +gradeYear+ " "+studentID);
		
	}
	
	
	//Generate an ID
	private void setStudentID(){
		//Grade level + ID
		id++;
		this.studentID = gradeYear+""+id;
		
	}
	
	
	//Enroll in courses
	public void enroll(){
		//user hits 0
		do{
		System.out.println("Enter course to enroll(Q to quit): ");
		Scanner in = new Scanner (System.in);
		String course = in.nextLine();
		if(!course.equals("Q"))
		{
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else{
			System.out.println("BREAK!");
			break;
		}
		}while(1!=0);
		
		//System.out.println("Enrolled In: "+courses);
		//System.out.println("Tuition Balance: "+tuitionBalance);
	}
		
		
	//View balance
	public void viewBalance(){
		System.out.println("Your balance is: $"+tuitionBalance);
	}
	
	//pay tuition fees
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $" +payment);
		viewBalance();
		
	}
	
	
	//show status
	public String showInfo(){
		return "Name: "+ firstName+" "+lastName+
				"\nGrade Level: "+gradeYear+
				"\nStudent ID: "+studentID+
				"\nCourses Enrolled: "+courses+
				"\nBalance: $"+tuitionBalance;
		
	}	

}
