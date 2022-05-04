package Stack;

public class StackUsingArrays {
    int top;
    int stack [];
    int size;
    public StackUsingArrays(){
        this.size =0;
        this.stack = new int[5];
        this.top = 0;

    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }

        return false;
    }
    public boolean isUnderflow(){
        if (size==-1){
            return true;
        }
        return false;
    }
    public boolean isOverflow(){
        if (size==stack.length){
            return true;
        }
        return false;
    }
    public void push(int val){
        if(!isOverflow()){
            stack[top]=val;
            top++;
            size++;
        }
        else {
            System.out.println("stack is full");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int rem=stack[top--];
            size--;
            return rem;
        }
        else {
            System.out.println("stack is Empty");
            return 0;
        }
    }
    public int topStack(){
        if (!isEmpty()){
            return stack[top];
        }
        else {
            System.out.println("Stack is Empty");
            return 0;
        }
    }
    public void display(){
        for(int i : stack){
            System.out.print(i+" ");
        }
    }
}
