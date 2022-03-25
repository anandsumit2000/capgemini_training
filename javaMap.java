import java.util.*;
 
public class javaMap {
 
  public static void main(String[] args) {
     
    System.out.println("Sorting using TreeMap\n");
     
    sortByKeyUsingTreeMap();
  }
 
  private static void sortByKeyUsingTreeMap() 
  {
    Map<String, Integer> unSortedMap = getUnSortedMap();
     
    System.out.println("Unsorted Map : " + unSortedMap);
 
    Map<String, Integer> sortedMap = new TreeMap<String, Integer>(unSortedMap);
     
    System.out.println("Sorted Map   : " + sortedMap);
  }
  private static Map<String, Integer> getUnSortedMap() 
  {
    Map<String, Integer> unsortMap = new HashMap<>();
    unsortMap.put("alex", 1);
    unsortMap.put("david", 2);
    unsortMap.put("elle", 3);
    unsortMap.put("charles", 4);
    unsortMap.put("brian", 5);
    return unsortMap;
  }
}