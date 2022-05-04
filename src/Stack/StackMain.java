package Stack;

public class StackMain {
    public static void main(String[] args) {
        StackUsingArrays stackUsingArrays = new StackUsingArrays();
       // stackUsingArrays.pop();
        stackUsingArrays.push(2);
        stackUsingArrays.push(5);
        stackUsingArrays.push(4);
        stackUsingArrays.push(7);
        stackUsingArrays.push(3);
        stackUsingArrays.push(5);
        stackUsingArrays.display();
    }
}
