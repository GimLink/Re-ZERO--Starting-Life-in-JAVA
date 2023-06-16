package ch08;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch (SpaceException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간 확보 후 다시 시도해주세요.");
		}catch(MemoryException e) {
			System.out.println("에러 메시지 : "+e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("메모리 확부 후 다시 시도해주세요.");
		}finally {deleteTempfiles();}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {}
	static void deleteTempfiles() {}
	
	static boolean enoughSpace() {return false;}
	
	static boolean enoughMemory() {return true;}

}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
