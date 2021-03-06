import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	public int len;
public int c=0;	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		len=length;
	
	}

	@Override
	public Student[] getStudents() throws IllegalArgumentException{
		//StudentArrayOperation s=new StudentArrayOperation();
		for(int i=0;i<len;i++)
		{

		getStudent(i);
		


		}

		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{

	}

	@Override
	public Student getStudent(int index) {
		System.out.println(students[index].getId());
		System.out.println(students[index].getFullName());
System.out.println(students[index].getBirthDate());
System.out.println(students[index].getAvgMark());
return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		//add(student,index)
// Add your implementation here
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
for(int i=0;i<c;i++)
{
students[i+1]=students[i];
}
students[0]=student;		// Add your implementation here
c++;		// Add your implementation here
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{
students[c++]=student;	
	// Add your implementation here
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		//add(student,index);	
for(int i=index;i<c;i++)
{
students[i+1]=students[i];


}
students[index]=student;	// Add your implementation here
c++;	}

	@Override
	public void remove(int index) throws IllegalArgumentException{
c--;
			for(int i=index;i<c;i++)
{
students[i]=students[i+1];


}	// Add your implementation here
		// Add your implementation here
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException{
	//	removeFromElement(student);
for(int i=0;i<c;i++)
{
if(students[i].getId()==student.getId())
{
remove(i);

}
}
// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
//removeFromElement(student);
// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
	// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
