package quiz;

public class TestQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Hadi", 23 ,20732, new int[] {34,67,89,32},'A');
		 Student student2 = new Student("ARMAN", 89 ,26754, new int[] {12,65,77,65},'B');
		 Student student3 = new Student("ANAS", 33 ,20212, new int[] {98,55,61,87},'C');
		 
	        
		 Teacher teacher1 = new Teacher("Miss Mehek", 35, 456, "Oops", 50000);
		 Teacher teacher2 = new Teacher("Miss UJALA", 45, 341, "PF", 60000);
		 Teacher teacher3 = new Teacher("Miss SAJIDA", 75, 578, "DISCRETE", 90000);
		 
		 System.out.println("Student Details:");
	        student1.displayStudent();
	        student2.displayStudent();
	        student3.displayStudent();
	        
	        System.out.println("\nTeacher Details:");
	        teacher1.displayTeacher();  
	        teacher2.displayTeacher();
	        teacher3.displayTeacher();
	        
	        teacher1.increaseSalary(5);
	        System.out.println("\nUpdated Salary for " + teacher1.name + ": " + teacher1.salary);
	
	        Student bestStudent = student1;
	        double highestAvg = student1.getAverageMarks();
	        if (student2.getAverageMarks() > highestAvg) {
	            bestStudent = student2;
	            highestAvg = student2.getAverageMarks();
	        }
	        if (student3.getAverageMarks() > highestAvg) {
	            bestStudent = student3;
	            highestAvg = student3.getAverageMarks();
	        }
	        System.out.println("\nStudent with highest average marks: " + bestStudent.name);

	}

}

	


