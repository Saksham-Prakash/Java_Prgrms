package LinkedListExamples;


class Node{
    int data;
    Node next;
    Node prev;
    public Node(){

    }
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class DoublyLinkedListExamples {
    public static void main(String[] args) {

        Node a = new Node(1, null, null);
        a.next=new Node(2);
        a.next.prev=a;
        a.next.next=new Node(3);
        a.next.next.prev=a.next;
        Node d=insertFirst(a,4);
        Node e=insertLast(d,5);
        Node f=insertAtIndex(d,6,1);


        display(f);

    }
    static void display(Node head){
        Node temp=head;
        if(temp==null){
            System.out.println("Empty");
        }
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    static Node insertFirst(Node head,int data){
        Node newHead=new Node(data);
        if(head==null){
            return newHead;
        }
        head.prev=newHead;
        newHead.next=head;
        newHead.prev=null;
        return newHead;
    }
    static Node insertLast(Node head,int data){
        Node newHead=new Node(data);
        if(head==null){
            return newHead;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newHead;
        newHead.prev=cur;
        newHead.next=null;
        return head;
    }
    static Node insertAtIndex(Node head,int data,int pos){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        if(pos==1){
            return insertFirst(head,data);
        }
        Node cur=head;
        for(int i=1;i<pos-1     && cur!=null;i++){
            cur=cur.next;
        }
        if(cur==null){
            System.out.println("Index out of bound");
            return head;
        }
        temp.next=cur.next;
        if(cur.next!=null){
            cur.next.prev=temp;
        }
        cur.next=temp;
        temp.prev=cur;
        return head;
    }
}
