package ch11;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asfjdh", "1331");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password룰 입력해주세요.");
			System.out.println("id :");
			String id = s.nextLine().trim();
			
			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다." + "다시 입력해주세요.");
				
				continue;
			}else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 틀렸습니다.");
				}else {
					System.out.println("로그인 되었습니다.");
					break;
				}
			}
		}
	}

}
