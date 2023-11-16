package collectionTest.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONObject;
import org.json.JSONWriter;

public class CollectionTestHash {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		userMap.put("id", "cnh12345");
		userMap.put("password", "1234");
		userMap.put("name", "Á¶³²È£");
		userMap.put("age", "23");
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json.toString());
		
		System.out.println(userMap.size());
		
		System.out.println(userMap.get("id"));
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			if(entry.getKey().equals("name")){
				System.out.println(entry.getValue());
			}
		}
	}
}
