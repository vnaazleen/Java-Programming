public class College {
	static int numOfStudents;
	static int numOfFaculity;
	
	static class Student {
		
		private String name;
		private String rollNo;
		private String course;
		
		public Student () { numOfStudents++;}
		
		public Student (String name, String rollNo, String course) {
			this.name = name;
			this.rollNo = rollNo;
			this.course = course;
			numOfStudents++;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getRollNo() {
			return rollNo;
		}
		
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		
		public String getCorse() {
			return course;
		}
		
		public void setCourse(String course) {
			this.course = course;
		}
		
		public String getInformation() {
			return rollNo + " who's name is " + name + " studies " + course;
		}
	}
	
	static class Faculity {
		
		private String name;
		private String subject;
		private int salary;
		
		public Faculity () { numOfFaculity++; }
		
		public Faculity (String name, String subject, int salary) {
			this.name = name;
			this.subject = subject;
			this.salary = salary;
			numOfFaculity++;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getSubject() {
			return subject;
		}
		
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public String getInformation () {
			return name + " teaches " + subject + " and earns " + String.valueOf(salary);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		College.Student student1 = new College.Student("Vaseem Naazleen", "19BQ1A05L1", "CSE");
		College.Student student2 = new College.Student("Sharon", "19BQ1A05L2", "CSE");
		
		College.Faculity faculity1 = new College.Faculity("Krishna Prasad", "Data Structures", 40000);
		College.Faculity faculity2 = new College.Faculity("Naga Sriharsha", "Java", 40000);
		
		System.out.println(student1.getInformation());
		System.out.println(faculity2.getInformation());
	}
}
