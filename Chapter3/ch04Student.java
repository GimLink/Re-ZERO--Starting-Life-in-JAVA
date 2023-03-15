package ch04;

public class ch04Student {


		int studentId;
		String studentName;
		String studentAdress;
		
		public ch04Student() {}
		
		public ch04Student(int id, String name) {
			
			studentId = id;
			studentName = name;
		}

		public ch04Student(int id, String name, String address) {
			
			studentId = id;
			studentName = name;
			studentAdress = address;
		}
		
		public void showStudentInfo() {
			System.out.println(studentId + "," + studentName + "," + studentAdress);
			
			//System.out.println();
		}
		
		public String getStudentName() {
			return studentName;
		}
		
		
	

}
