import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws MyEmptyStackException {
/*
        Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();
        ArrayList<> stringArrayList = new ArrayList();
        stringArrayList.add("String");
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("string");
        HashMap<String, Double > grades = new HashMap<>();
        grades.put("eylül",100.0);
        System.out.println(grades);
        grades.put("öykü",100.0);
        System.out.println(grades);
        System.out.println(grades.keySet());
        System.out.println(grades.values());
        System.out.println(grades.keySet() instanceof List);
        System.out.println(grades.keySet().getClass());
        System.out.println(grades.keySet() instanceof Set);*/
        StackLinkedList<Number>stack = new StackLinkedList<>();
        stack.pop();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        //stack.push("this is a test");
        System.out.println(stack);
        stack.displayStack();


    }
}