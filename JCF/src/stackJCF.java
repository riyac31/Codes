import java.util.*;
public class stackJCF {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        //to insert stack animals
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Giraffe");
        animals.push("Cat");
        animals.push("Horse");
        animals.push("Dog");
        System.out.println("Stack: "+animals);

        //to display the top most animals of stack
        System.out.println(animals.peek());

        //to remove the top most animals of stack
        System.out.println(animals.pop());
        System.out.println("New Stack: "+animals);

        System.out.println(animals.peek());
    }
}
