public class Main {

	public static void main(String[] args) {

Student s=new Student(1232,"osman",90.2);
StudentGroup sg=new StudentGroup(100);
//sg.getStudents();	
//sg.setStudent(s,1);	
sg.addLast(s);
sg.getStudent(0);

Student s1=new Student(12324,"osman",90.2);
Student s2=new Student(12325,"osman",90.2);
sg.addLast(s1);
sg.addFirst(s2);
sg.remove(1);
sg.remove(s2);
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
