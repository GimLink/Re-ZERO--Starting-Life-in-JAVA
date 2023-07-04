package ch11;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0;i<10;i++)
			original.add(i+"");
		Iterator it = original.iterator();
		while(it.hasNext())
			copy1.add(it.next());
		
		System.out.println("= Original에서 copy1으로 복사(copy)");
		System.out.println("original :"+original);
		System.out.println("copy1:"+copy1);
		
		it = original.iterator(); //iterator는 재사용이 안돼서 한번 쓰면 다시 채워서 가져와야 한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("=Original에서 copy2로 이동(move) =");
		System.out.println("original ="+original);
		System.out.println("copy2 ="+copy2);
	}

}
