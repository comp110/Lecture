package comp110.lecture18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorExamples {

  public static void main(String[] args) {

    IteratorExamples.iterateThroughASet();
    // IteratorExamples.iterateThroughAList();
    // IteratorExamples.iterateThroughAMap();

  }

  public static void iterateThroughASet() {
    System.out.println("*** iterateThroughASet ***");
    Set<String> aSet = new HashSet<String>();
    aSet.add("UNC");
    aSet.add("Dean Dome");
    aSet.add("Basketball");
    aSet.add("Roy");
    System.out.println("The Set: " + aSet);

    // TODO: Iterate through aSet using an iterator

  }

  public static void iterateThroughAList() {
    System.out.println("*** iterateThroughASet ***");
    List<String> aList = new ArrayList<String>();
    aList.add("UNC");
    aList.add("Basketball");
    aList.add("Basketball");
    aList.add("Basketball");
    aList.add("Dean Dome");
    aList.add("Roy");
    System.out.println("The List: " + aList);

    // TODO: Iterate through aList using an iterator

  }

  public static void iterateThroughAMap() {
    System.out.println("*** iterateThroughAMap ***");
    Map<String, String> aMap = new HashMap<String, String>();
    aMap.put("Kris", "Kris Jordan");
    aMap.put("Meggie", "Meggie Cruser");
    aMap.put("Karen", "Karen Cheng");
    aMap.put("Jeffrey", "Jeffrey Young");
    System.out.println("The Map: " + aMap);

    // TODO: Iterate through aMap using an iterator

  }

}
