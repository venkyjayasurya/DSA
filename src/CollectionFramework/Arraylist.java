package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;
}

public class Arraylist {
      public static void main(String[] args){
//        List can only store string values
        ArrayList<String> list1 = new ArrayList<String>();
//        List can store any values
        ArrayList list2 = new ArrayList();

        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Venkatesh";

//        Add items in list 1
        list1.add("Joe");
        list1.add("HOD");
        list1.add("Nikhil");
        list1.add("Jack");

        list2.add(10);
        list2.add(2.2);
        list2.add('A');
        list2.add("Jack");
        list2.add(s1);

        System.out.println("List 1 is: "+list1);
        System.out.println("List 2 is: "+list2);

//        Get the element from the list
        String name = list1.get(2);
        System.out.println(name);

//        Object is the super class of all the datatypes as the list 2 contains different types of datatypes
        Object o = list2.get(4);
        System.out.println(o);

//        Update element in the list
        list1.set(1, "Tharun");
        System.out.println("Updated List 1 is: "+list1);

//        Remove element from the list
        list1.remove(3);
        System.out.println("Updated List 1 is: "+list1);

//        To remove all elements
//        list1.clear();
//        System.out.println("List 1 is: "+list1);

//        functions helpful for searching and sorting
        if(list1.contains("Tharun")){
          System.out.println("Tharun is present");
        }else{
          System.out.println("Tharun is not present");
        }

//        Iterate in CollectionFramework.Arraylist
        System.out.println("===Iterating with normal for loop===");
        for(int i=0; i<list1.size(); i++){
          System.out.println(list1.get(i));
        }
        System.out.println("=== === ===");

        System.out.println("===Iterating with enhanced for loop===");
        for(String str: list1){
          System.out.println(str);
        }
        System.out.println("=== === ===");

//        Using Iterator API
        System.out.println("===Iterating with iterator===");
        Iterator<String> itr = list1.iterator();
//        Iterator prints only one element at a time
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        Instead of using println these many times, we can use while loop
        while(itr.hasNext()){
          String str = itr.next();
          System.out.println(str);

          if(str.equals("Joe")){
            itr.remove();
          }
        }

        System.out.println("List1 after iteration is" + list1);
    }
}
