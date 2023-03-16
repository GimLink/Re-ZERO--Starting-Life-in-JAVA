package ch16;

public class ch16School {

	private static ch16School instance = new ch16School();
	
	private ch16School() {} //이지랄 해놓으면 다른 클래스에서 스쿨 인스턴스 생성 불가 
	
	public static ch16School getInstance() {
		if(instance == null) {
			instance = new ch16School();
		}
		return instance;
	}
}