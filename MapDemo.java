package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

      public static void main(String[] args) {
//  hashMap();
//  linkedHashMap();
//  hashTable();
treeMap();
 }

 private static void treeMap() {
// TreeMap
// maintains sorted order with key
// we can provide specific comparator in the constructor to sort keys
  TreeMap<String,Integer> tm = new TreeMap<>();
  tm.put("Naveen", 15);
  tm.put("Haja", 45);
  tm.put("Haja", 47);
  tm.put("Mani", 55);
  tm.put("Ganesh", 45);
  System.out.println(tm);
 }

 private static void hashTable() {
//  Hash table
 // doesn't allow null key
// it calls hash code() method for each key in the HashTable
 Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
 ht.put("Naveen", 45);
 ht.put("Haja", 45);
 ht.put("Haja", 47);
 System.out.println(ht);
 }

 private static void linkedHashMap() {
 // LinkedHashMap 
 // maintains insertion order
 LinkedHashMap<String,Integer> lHashMap = new LinkedHashMap<String,Integer>();
 lHashMap.put("Hari",44);
 lHashMap.put("Raghul",44);
 lHashMap.put("k7",44);
 lHashMap.put("Raghul",45);
  System.out.println(lHashMap);
}

private static void hashMap() {
//      key    value
// i) key must be unique if contains duplicate key the value of duplicated
//    key value will override the previous value
// ii) we can have duplicate values
// iii) can contain null as key
HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(23, "Ramya");
map.put(23, "ravi");
map.put(null, "hari");
System.out.println("map data "+map);

Set<Integer> keys = map.keySet();
System.out.println("keys "+keys);

Collection<String> list = map.values();
System.out.println("values "+list);

System.out.println("contains key "+map.containsKey(23));
System.out.println("contains value "+map.containsValue("hari"));

map.remove(23);
System.out.println(map);
}


}
