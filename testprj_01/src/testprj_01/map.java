package testprj_01;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args){
		Map<String, String>map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value5");
		map.put("key6", "value7");

		String value = map.get("key1");
		System.out.println(value);

		String valueNull = map.get("key6");
		System.out.println(valueNull);

		if(map.containsKey("key1")){
			System.out.println("key1は存在します");
		}else{
			System.out.println("key1は存在しません");
		}

		for(Map.Entry<String, String>e:map.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
