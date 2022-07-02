import java.util.*;
public class arrList2 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Riya");
        str.add("Choudhary");
        str.add("Gaurav");
        str.add("Verma");
        System.out.println(str);

        str.add(2, "Hii");
        System.out.println(str);

        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Bholu");
        str2.add("Lolo");

        str.addAll(str2);
        System.out.println(str);

        str.remove(2);
        System.out.println(str);

      //  System.out.println(str.get(2));

//        str.remove(String.valueOf("Lolo"));
//        System.out.println(str);

        str.set(3,"Helloo");
        System.out.println(str);

        System.out.println(str.contains("Hii"));


        // iterate element using for loop
        for(int i=0; i<str.size(); i++){
            System.out.println("the element is: " + str.get(i));
        }
        // iterate element using for each loop
        for(String element: str){
            System.out.println("foreach element is: "+element);
        }

        //using iterator
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            System.out.println("iterator: " + it.next());
        }


    }
}
