package ch14;

public class ch14Employee {
	
	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public ch14Employee() {
		employeeId = serialNum++;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public static int getSerialNum() {
		//int i = 0;이런 로컬 변수는 사용 가능
		//employeeName = "Lee"; // 인스턴스 변수는 못쓴다 
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		ch14Employee.serialNum = serialNum;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
