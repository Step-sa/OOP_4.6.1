import java.util.*;
public class Main {
    public static void fibanachi_not_recursion(int n){
        ArrayList<Long> list = new ArrayList<>();
        list.add((long)1);
        list.add((long)1);
        while (list.size() <= n){
            long item = list.get(list.size() - 2) + list.getLast();
            list.add(item);
        }
        System.out.println(list.get(n));
    }
    public static void main(String[] args) {
        fibanachi_not_recursion(0);
    }

}