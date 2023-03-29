package LinkedList;

public class ReverseLL {
    private Node Head;
    public void reve(){
        Node node = Head;
        while(node != null){
            node = node.next;
            reve();
        }
        System.out.println(node.value);
    }
    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
