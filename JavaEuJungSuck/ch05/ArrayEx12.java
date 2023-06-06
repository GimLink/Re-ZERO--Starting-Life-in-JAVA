package ch05배열;

public class ArrayEx12 {

	public static void main(String[] args) {

		String[] name = {"Kim", "Lee", "Park"};
		
		for(int i=0; i<name.length;i++)
			System.out.println("name["+i+"] = "+name[i]);
		
		String tmp = name[2];
		
		System.out.println("tmp = "+tmp);
		
		name[0] = "Yu";
		
		for(String str : name)
			System.out.println(str);
//		향상된 for문 for(변수타입 : 배열 )
	}
	
		
	

}
