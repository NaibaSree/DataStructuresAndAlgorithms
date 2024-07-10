class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class LinkedList
{
    Node head,tail;
    public void insert(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else {
            tail.next=n;
            tail=n;
        }
    }
    public void insertbeg(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertAt(int pos,int data)
    {
        Node n=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
            n.next=temp.next;
            temp.next=n;
        }
    }
    public void deleteBeg()
    {
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void deleteEnd()
    {
        Node temp=head;
        while(temp.next!=tail)
            temp=temp.next;
        temp.next=null;
        tail=temp;
    }
    public void deletePos(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos-1;i++)
            temp=temp.next;
        temp.next=temp.next.next;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
}
public class SingleLinkedList
{
    public static void main(String[] arg)
    {
        LinkedList l=new LinkedList();

        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insertbeg(5);
        l.insertAt(2,15);
        System.out.print("Initial size: ");
        l.size();
        l.display();
        System.out.println("Deleting at Beginning");
        l.deleteBeg();
        l.display();
        System.out.println("Deleting at a specified position");
        l.deletePos(2);
        l.display();
        System.out.println("After Deletion at end");
        l.deleteEnd();
        l.display();
        System.out.print("Final size: ");
        l.size();
    }
}
