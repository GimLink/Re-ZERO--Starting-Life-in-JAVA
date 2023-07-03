package ch11;

import java.util.*;

public class QueueEx {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if (input.equalsIgnoreCase("help")) {
					System.out.println("help 도움말 ");
					System.out.println("q 종료 ");
					System.out.println("history 최근 입력");
				}else if(input.equalsIgnoreCase("history")) {
					int i=0;
					save(input);
					
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
			}else {
				save(input);
				System.out.println(input);
			}
		}catch(Exception e) {
			System.out.println("ERROR");
		}
	}

}
	
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);
		
		if(q.size() > MAX_SIZE)
			q.remove();
	}
}
