package LinkedList;

public class SinglyLL {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void insertBeg(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val){
        Node temp = head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next = new Node(val);
    }
    public void insertMid(int val, int pos){
       Node temp = head;
       Node newNode = new Node(val);
       Node nn;
      int count=1;
       while (count<pos-1){
           count++;
           temp=temp.next;
       }
       nn = temp.next;
       temp.next = newNode;
       newNode.next = nn;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node deleteFirst(){
        if(head==null){
            return null;
        }
        else{
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    public Node deleteLast() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
          while (temp.next.next!=null){
              temp= temp.next;
          }
          Node dl =temp.next;
          temp.next = null;
          return dl;
        }
    }
    public Node deleteMid(int pos){
        int count= 1;
        Node temp = head;
        while (count<pos-1){
            count++;
            temp = temp.next;
        }
        Node prev = temp;
        Node curr = temp.next;
        Node nn = temp.next.next;
        prev.next = nn;
        return curr;
    }
}
