// Sets — in that program that are HashSet, LinkedHashSet and TreeSet 

// For different Sets
import java.util.*;

public class SetsSpeedTest {
    
    // ———— Function for checking speed in millisecond of adding 100.000 element in 3 types of Sets ————
    public static void adding(HashSet hashSet, LinkedHashSet linkedSet, TreeSet treeSet){
        // ——————————————— HashSet ———————————————
        long timeMLBefore = System.currentTimeMillis(); //Start time checking
        
        // 100.000 times add new data in HashSet<> by using bigger in 1 digit
        for (int index = 0; index < 100000; index++) {
            hashSet.add(index);}

        long timeMLAfter = System.currentTimeMillis(); // End time checking

        System.out.println("Adding 100.000 el. (time in Milliseconds)");
        System.out.println("HashSet : " + (timeMLAfter-timeMLBefore));  //Time of adding in HashSet<>

        // ——————————————— LinkedHashSet ———————————————
        timeMLBefore = System.currentTimeMillis(); // Start time checking
        
        // (Line 10 com.) add new data in LinkedHashSet<>
        for (int index = 0; index < 100000; index++) {
            linkedSet.add(index);}
        
        timeMLAfter = System.currentTimeMillis(); // End time checking
        
        System.out.println("LinkedHashSet : " + (timeMLAfter-timeMLBefore));    //Time of adding in LenkedHashSet<>

        // ——————————————— TreeSet ———————————————
        timeMLBefore = System.currentTimeMillis(); // Start time checking
        
        // (Line 10 com.) add new data in TreeSet<>
        for (int index = 0; index < 100000; index++) {
            treeSet.add(index);}
        
        timeMLAfter = System.currentTimeMillis(); // End time checking
      
        System.out.println("TreeSet : " + (timeMLAfter-timeMLBefore));  //Time of adding for TreeSet<>
    }
    
    // ———— Function for checking speed in millisecond of finding last element from  in 3 types of Sets ————
    public static void finding(HashSet hashSet, LinkedHashSet linkedSet, TreeSet treeSet){
        
        // ——————————————— HashSet ———————————————
        
        long timeMLBefore = System.currentTimeMillis(); // Start time checking
        
        // Finding last element in hashSet
        for (Object i : hashSet) {
            hashSet.contains(100000);}

        long timeMLAfter = System.currentTimeMillis();  // End time checking

        System.out.println("Finding 100.000 el. (time in Milliseconds)");
        System.out.println("HashSet : " + (timeMLAfter-timeMLBefore));  //Time of searching in HashSet<>
        
        // ——————————————— LinkedHashSet ———————————————

        timeMLBefore = System.currentTimeMillis(); // Start time checking
        
         // Finding last element in linkedHashSet
        for (Object i : linkedSet) {
            linkedSet.contains(99999);}
        
        timeMLAfter = System.currentTimeMillis();   // End time checking
        
        System.out.println("LinkedHashSet : " + (timeMLAfter-timeMLBefore));    //Time of searching in LinkedHashSet<>
        
        // ——————————————— TreeSet ———————————————

        timeMLBefore = System.currentTimeMillis();  // Start time checking
        
         // Finding last element in treeSet
        for (Object i : treeSet) {
            treeSet.contains(99999);}
        
        timeMLAfter = System.currentTimeMillis();   // End time checking
        
        System.out.println("TreeSet : " + (timeMLAfter-timeMLBefore));  //Time of searching in TreeSet<>
    }
    
    // ———— Function for checking speed in millisecond of adding 100.000 element in 3 types of Sets ————
    public static void deleating(HashSet hashSet, LinkedHashSet linkedSet, TreeSet treeSet){
        
        // ——————————————— HashSet ———————————————
        
        long timeMLBefore = System.currentTimeMillis(); // Start time checking
        
        // Removes all objects from HashSet in cycle
        for (int i = 0; i < 100000; i++) {
            hashSet.remove(i);}

        long timeMLAfter = System.currentTimeMillis();  // End time checking

        System.out.println("Deleating 100.000 el. (time in Milliseconds)");
        System.out.println("HashSet : " + (timeMLAfter-timeMLBefore));  // Time of deleating in HashSet<>
        
        // ——————————————— LinkedHashSet ———————————————

        timeMLBefore = System.currentTimeMillis();  // Start time checking
        
        // Removes all objects from LinkedHashSet in cycle
        for (int i = 0; i < 100000; i++) {
            linkedSet.remove(i);}
        timeMLAfter = System.currentTimeMillis();   // End time checking
        System.out.println("LinkedHashSet : " + (timeMLAfter-timeMLBefore));  // Time of deleating in LinkedHashSet<>
        
        // ——————————————— TreeSet ———————————————

        timeMLBefore = System.currentTimeMillis();  // Start time checking
        
        // Removes all objects from TreeSet in cycle
        for (int i = 0; i < 100000; i++) {
            treeSet.remove(i);}
        timeMLAfter = System.currentTimeMillis();   // End time checking
        System.out.println("TreeSet : " + (timeMLAfter-timeMLBefore));  // Time of deleating in TreeSet<>
    }
    
    // Main function. Call speed tests and makes Sets.
    public static void main(String[] args) {
        
        // Creating Sets
        HashSet<Integer> hashSet = new HashSet<>(); // Creating HashSet with Integers
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();   // Creating LinkedHashSet with Integers
        TreeSet treeSet = new TreeSet<>();  // Creating TreeSet with Integers
        
        // Calling speed tests
        adding(hashSet, linkedSet, treeSet); // Call function that add 100k elements in Sets 
        finding(hashSet, linkedSet, treeSet);   // Call function that find last elements in cycle
        deleating(hashSet, linkedSet, treeSet); // Call function that delete all elements in cycle
    }
}
