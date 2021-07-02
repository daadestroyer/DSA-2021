package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer,String>();
		hMap.put(101,"shubham");
		hMap.put(102,"shubhanshu");
		hMap.put(103,"ansh");
		hMap.put(104,"vatsal");
		hMap.put(105,"anshul");
		hMap.put(106,"pulkit");
		
		System.out.println(hMap.get(101));
		System.out.println(hMap.get(102));
		System.out.println(hMap.get(103));
		
		System.out.println(hMap.remove(104));
		System.out.println(hMap);
		
		System.out.println(hMap.containsKey(105));
		System.out.println(hMap.containsValue("pulkit"));
		
		Set<Integer> keySet = hMap.keySet();
		System.out.println(keySet);
		
		Collection<String> values = hMap.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = hMap.entrySet();
		System.out.println(entrySet);
		
		for(Map.Entry<Integer,String> entry :entrySet) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
}
