package quiz;

public class Student {
	String name;
	int age; 
	int	id ;
	char grade; 
	int[] marks;
	
	Student (String n, int a, int i, int[] m, char g)
	{
		name = n;
		age = a;
		id = i;
		marks = m;
		grade = g;
				
	}
 void displayStudent()
 {
	 System.out.println("Name of a student is: "+name);
	 System.out.println("Age: " + age);
     System.out.println("ID: " + id);
     System.out.println("Grade: " + grade);
     System.out.print("Marks: ");
     for (int mark : marks) {
         System.out.print(mark + " ");
     }
     System.out.println();
     System.out.println();
     System.out.println();
 }
 
  double getAverageMarks() {
     int total = 0;
     for (int mark : marks) {
         total += mark;
     }
     return total / (double) marks.length;
 }

}

class Teacher
{
		String name; 
		int age ;
		int id;
		String subject ;
		double salary; 
		 Teacher (String n, int a, int i, String sub, double sal) {
		       name =n;
		       age= a;
		       id= i;
		       subject = sub;
		       salary=sal;
	
		 }
		 void displayTeacher() {
			    
			 	System.out.println("Teacher Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("ID: " + id);
		        System.out.println("Subject: " + subject);
		        System.out.println("Salary: " + salary);
		        System.out.println("=========================");
		        
		    }
 void increaseSalary(double percentage) {
		        salary = salary  + salary * (percentage / 100);
		    }
}

