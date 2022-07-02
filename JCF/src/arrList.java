import java.util.*;
public class arrList {
    public static void main(String args[]){
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Riya");
        studentName.add("Gaurav");
        System.out.println(studentName);
        // functions in arrayList
        //1: Adding element to the list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(31);
        System.out.println(list);

        //adding element to particular index
        list.add(1,2002);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(8);

        //adding new list element to previous list
        list.addAll(newList);
        System.out.println(list);

        // get list element
        System.out.println(list.get(2));

        // removing list element at given index
        list.remove(3);
        System.out.println(list);

        // remove list element
        list.remove(Integer.valueOf(5));
        System.out.println(list);

        // remove all list element
        //list.clear();
       // System.out.println(list);

        // iterate element using for loop
        for(int i=0; i<list.size(); i++){
            System.out.println("the element is: " + list.get(i));
        }
        // iterate element using for each loop
        for(Integer element: list){
            System.out.println("foreach element is: "+element);
        }

        //using iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator: " + it.next());
        }
    }
}