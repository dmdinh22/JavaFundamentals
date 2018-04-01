package accessmodifiers;

public class School {
	private Student[] students;
	public void printStudentNames() {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName());
		}
	}
}
