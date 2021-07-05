package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args){
//        HashSet<String> set = new HashSet<String>();
        TreeSet<String> set = new TreeSet<String>();    //Data is unordered but it is alphabetically sorted

//        Here data is not added as in indexing approach
//        We got hashcodes for elements which are being added

        set.add("Venkatesh");
        set.add("Tharun");
        set.add("Tharun");
        set.add("Nikhil");
        set.add("Pranav");
        set.add("Tharun");
        set.add("Pranav");
        set.add("Venkatesh");
        set.add("Nikhil");
//        Data is unique, no redundancy
//        Data is unordered in output due to hashing
        System.out.println("The set is"+set);

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Pranav");
        System.out.println("Set after removing pranav is" + set);
        if(set.contains("Tharun")){
            System.out.println("Tharun is in the set");
        }
        System.out.println("Set size is "+ set.size());
    }
}
