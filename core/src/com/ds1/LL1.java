package com.ds1;

public class LL1 {
    Node head;
    private int size;
    LL1(){this.size=0;}
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;

        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.print("Empty list");
            return;
        }

        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void reverseIterator()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;

        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public int findSize()
    {
        return size;
    }

    public void deleteNthNodeFromLast(int n)
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node currNode=head;
        int count=0;
        while(currNode!=null)
        {
            currNode=currNode.next;
            count++;
        }
        int indexfromLast = count-n;
        currNode=head;
        int j=1;
        while(j<indexfromLast)
        {
            currNode=currNode.next;
            j++;
        }
        currNode.next=currNode.next.next;
    }


    public static void main(String[] args) {

        LL1 list= new LL1();
        list.addFirst("aaa");
        list.addLast("bbb");
        list.addLast("ccc");
        list.addFirst("ddd");
        list.printList();
        list.reverseIterator();
        list.printList();
        System.out.println(list.findSize());
//        list.deleteFirst();
//        list.printList();
        list.deleteNthNodeFromLast(3);
        list.printList();
        System.out.println(list.findSize());
//        list.deleteLast();
//        list.printList();
    }

}
