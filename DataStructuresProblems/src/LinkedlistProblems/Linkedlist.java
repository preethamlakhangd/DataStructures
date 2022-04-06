package LinkedlistProblems;

import java.util.LinkedList;

public class Linkedlist {
    Node head;

    class Node{
        int data;
        Node next;

        Node (int d){
           this.data = d;
           this.next = null;

        }

    }

    public void push(int new_data){
        Node newnode = new Node(new_data);

        newnode.next = head;

        head = newnode;



    }

    void printlist(){
        Node temp = head;
        while( temp.next!= null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void removeDuplicates(){
        Node curr = head;
        while(curr != null) {
            Node temp = curr;
            while(temp !=null && temp.data == curr.data ){
              temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;




        }

    }


    public static void main(String[] args) {

        Linkedlist ls = new Linkedlist();
        ls.push(1);
        ls.push(2);
        ls.push(2);
        ls.push(2);
        ls.push(3);
        ls.push(5);
        ls.push(5);
      ls.printlist();
      ls.removeDuplicates();
        ls.printlist();




    }



}
