package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Entry {
	
	HashMap< String, String> hashMap =  null;

 			public static void main(String[] args) {
 				HashMap< String, String> hashMap  =  new HashMap<>();
 				hashMap.put("1", "红兵1");
 				hashMap.put("2", "红兵2");
 				hashMap.put("3", "红兵3");
 				//Entry是个静态内部类，存储的是键和值，也就是说HashMap中所有的键和值都在Entry中存储这，get方法的话
 				//先是从这个key的hashcode（）中找到所在的数组的索引，然后遍历整个数组所在的Entry中的key的Hashcode
 				Set<Map.Entry<String, String>>  set = (Set<Map.Entry<String,String>>) hashMap.entrySet();
 				Iterator  iterator = set.iterator();
 				while(iterator.hasNext()) {
 					Map.Entry<String, String>  entry = (Map.Entry<String, String>) iterator.next(); 
 					System.out.println(entry.getKey()+"   "+entry.getValue());
 				}
 				
			}
}
