package kodlama.io.entities;

public class Instructors {
     private int InstructorId;
     private String InstructorName;
     private int InstructorAge;
     private String InstructorDescription;
     
     public Instructors() {
    	 
     }

	public Instructors(int instructorId, String instructorname, int instructorAge, String instructorDescription) {
		super();
		this.InstructorId = instructorId;
		this.InstructorName = instructorname;
		this.InstructorAge = instructorAge;
		this.InstructorDescription = instructorDescription;
	}

	public int getInstructorId() {
		return InstructorId;
	}

	

	public String getInstructorname() {
		return InstructorName;
	}

	public void setInstructorname(String instructorName) {
		this.InstructorName = instructorName;
	}
	public int getInstructorAge() {
		return InstructorAge;
	}

	public void setInstructorAge(int instructorAge) {
		this.InstructorAge = instructorAge;
	}

	public String getInstructorDescription() {
		return InstructorDescription;
	}

	public void setInstructorDescription(String instructorDescription) {
		this.InstructorDescription = instructorDescription;
	}
     
     
}
