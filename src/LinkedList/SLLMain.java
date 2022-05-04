package LinkedList;

public class SLLMain {
    public static void main(String[] args) {
        SinglyLL singlyLL = new SinglyLL();
        singlyLL.insertBeg(6);
        singlyLL.insertBeg(5);
        singlyLL.insertLast(7);
        singlyLL.insertMid(4,2);
        singlyLL.display();
//        System.out.println(singlyLL.deleteFirst().data);
//        singlyLL.display();
//        singlyLL.deleteFirst();
//        singlyLL.display();
//        singlyLL.deleteFirst();
//        singlyLL.display();
//        singlyLL.deleteFirst();
//        singlyLL.display();
        System.out.println(singlyLL.deleteLast().data);
        singlyLL.display();
        System.out.println(singlyLL.deleteMid(2).data);
        singlyLL.display();

    }
}
