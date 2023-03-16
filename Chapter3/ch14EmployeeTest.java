package ch14;

public class ch14EmployeeTest {

	public static void main(String[] args) {

		ch14Employee employeeRoh = new ch14Employee();
		employeeRoh.setEmployeeName("로날드");
		employeeRoh.setDepartment("청와대");
		
		System.out.println(employeeRoh.getDepartment());
		
		ch14Employee employeeLee = new ch14Employee();
		employeeLee.setEmployeeName("이태리");
		//employeeLee.serialNum++;
		
		//System.out.println(employeeLee.serialNum);
		//System.out.println(employeeRoh.serialNum);
		
		System.out.println(employeeRoh.getEmployeeId());
		System.out.println(employeeLee.getEmployeeId());
		System.out.println(ch14Employee.getSerialNum());
	}

}
