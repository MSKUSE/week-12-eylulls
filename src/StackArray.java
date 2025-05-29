import java.util.ArrayList;
public class StackArray <A> implements Stack{


    private  ArrayList<A> stack =
            new ArrayList<>();

    @Override
    public void push(A item) {
        stack.add(0,item);
    }
    @Override
    public A pop() throws MyEmptyStackException{
        if(this.isEmpty()){
            throw new MyEmptyStackException(("Stack is empty,you can't pop anything"));
        }
        return stack.remove(0);
    }
    @Override
    public void peek() {
        System.out.println("The top is "
        + stack.get(0));
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "stack=" + stack +
                '}';
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;

    }
}
