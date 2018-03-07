package streams;

public class Course {
	private String subject;
	private int studentsQuantity;

	public Course(String subject, int studentsQuantity) {
		super();
		this.subject = subject;
		this.studentsQuantity = studentsQuantity;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentsQuantity() {
		return studentsQuantity;
	}

	public void setStudentsQuantity(int studentsQuantity) {
		this.studentsQuantity = studentsQuantity;
	}

}
