import java.util.*;


public class arrayeg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(67);  
        list.add(39);  
        list.add(76);  
        list.add(50);
        Collections.sort(list);
        for(int num: list)  
        {  
        System.out.println(num);  
        }  
    }
}
