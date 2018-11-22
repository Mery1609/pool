
public class TestStudent {

	public static void main(String[] args) {
		
		
		Student student1=new Student("Mike",17,'M',2016,"Java");
		
		student1.attendLab();
		student1.attendLecture();
		student1.submitAssignment();
		
		Student student2=new Student("Smith",18,'M',2016,"JavaScript");
		
		student2.attendLab();
		student2.attendLecture();
		student2.submitAssignment();
		
		Student student3=new Student("John", 18, 'M', 2016, "Typescript");
		
		student3.attendLab();
		student3.attendLecture();
		student3.submitAssignment();
		
	}

}
