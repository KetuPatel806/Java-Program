package LinkedList;

import java.sql.SQLOutput;

public class DL {
    private Node Head;
    private Node tail;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.Next = Head;
        node.Prev = null;
        if(Head != null){
            Head.Prev = node;
        }
        Head = node;
    }
    public void diplay(){
        Node node = Head;
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.Next;
        }
        System.out.println("END");
    }
    public void diplayReve(){
        Node node = Head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.Next;
        }
        System.out.println("END");
        System.out.println("Diplay Reverse List");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.Prev;
        }
        System.out.println("END");
    }
    public  void insertLast(int val){
        Node node = new Node(val);
        Node last = Head;
        node.Next = null;
        if(Head == null){
            node.Prev = null;
            Head = node;
            return;
        }
        while(last.Next != null){
            last = last.Next;
        }
        node.Next = null;
        last.Next = node;
        node.Prev = last;
    }
    public void insertAfter(int after,int val){
        Node p = find(after);
        if(p == null){
            System.out.println("The Operation Does't Exist");
            return;
        }
        Node node = new Node(val);
        node.Next = p.Next;
        p.Next = node;
        node.Prev = p;
        if(node.Next != null){
            node.Next.Prev = node;
        }

    }
    public Node find(int value) {
        Node node = Head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.Next;
        }
        return null;
    }


    private class Node{
        int val;
        Node Next;
        Node Prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            Next = next;
            Prev = prev;
        }
    }

    public static void main(String[] args) {
        DL dll = new DL();
        dll.insertFirst(15);
        dll.insertFirst(12);
        dll.insertFirst(23);
        dll.insertFirst(13);
        dll.diplay();
//        dll.diplayReve();
        dll.insertLast(12);
        dll.diplay();
        dll.insertAfter(23,255);
        dll.diplay();

    }
}
