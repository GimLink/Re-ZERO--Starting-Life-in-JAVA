package ch11;

import java.util.*;

public class HashMapEx3 {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("asd", "aaa", "010-1111-0000");
		addPhoneNo("asd", "aab", "010-1111-0001");
		addPhoneNo("ase", "aac", "010-1111-0002");
		addPhoneNo("ase", "aad", "010-1111-0003");
		addPhoneNo("asc", "aae", "010-1111-0004");
		
		printList();
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subset = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subset.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subset.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE =  (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " "+ telNo);
			}
			System.out.println();
		}
	}

}
