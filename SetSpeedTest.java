import java.util.*;

public class SetSpeedTest {
    public static void adding(HashSet hashSet, LinkedHashSet linkedSet, TreeSet treeSet){

        long timeMLBefore = System.currentTimeMillis();

        for (int index = 0; index < 100000; index++) {
            hashSet.add(index);}

        long timeMLAfter = System.currentTimeMillis();

        System.out.println("Adding 100.000 el. (time in Milliseconds)");
        System.out.println("HashSet : " + (timeMLAfter-timeMLBefore));

        timeMLBefore = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            linkedSet.add(index);}
        timeMLAfter = System.currentTimeMillis();
        System.out.println("LinkedHashSet : " + (timeMLAfter-timeMLBefore));

        timeMLBefore = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            treeSet.add(index);}
        timeMLAfter = System.currentTimeMillis();
        System.out.println("TreeSet : " + (timeMLAfter-timeMLBefore));
    }
    public static void finding(HashSet hashSet, LinkedHashSet linkedSet, TreeSet treeSet){
        long timeMLBefore = System.currentTimeMillis();

        for (Object i : hashSet) {
            hashSet.contains(99999);}

        long timeMLAfter = System.currentTimeMillis();

        System.out.println("Finding 99.999 el. (time in Milliseconds)");
        System.out.println("HashSet : " + (timeMLAfter-timeMLBefore));

        timeMLBefore = System.currentTimeMillis();
        for (Object i : linkedSet) {
            linkedSet.contains(99999);}
        timeMLAfter = System.currentTimeMillis();
        System.out.println("LinkedHashSet : " + (timeMLAfter-timeMLBefore));

        timeMLBefore = System.currentTimeMillis();
        for (Object i : treeSet) {
            treeSet.contains(99999);}
        timeMLAfter = System.currentTimeMillis();
        System.out.println("TreeSet : " + (timeMLAfter-timeMLBefore));
    }
    public static void deleating(HashSet hashSet, LinkedHashSet linkedSet, TreeSet treeSet){
        long timeMLBefore = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            hashSet.remove(i);}

        long timeMLAfter = System.currentTimeMillis();

        System.out.println("Deleating 100.000 el. (time in Milliseconds)");
        System.out.println("HashSet : " + (timeMLAfter-timeMLBefore));

        timeMLBefore = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedSet.remove(i);}
        timeMLAfter = System.currentTimeMillis();
        System.out.println("LinkedHashSet : " + (timeMLAfter-timeMLBefore));

        timeMLBefore = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            treeSet.remove(i);}
        timeMLAfter = System.currentTimeMillis();
        System.out.println("TreeSet : " + (timeMLAfter-timeMLBefore));
    }
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        TreeSet treeSet = new TreeSet<>();
        adding(hashSet, linkedSet, treeSet);
        finding(hashSet, linkedSet, treeSet);
        deleating(hashSet, linkedSet, treeSet);
    }
}
