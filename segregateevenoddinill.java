import java.util.*;
class Linkedlist{
   Node head;
   Node tail;
   class Node{
       int data;
       Node next;
       
       Node(int d){
           data=d;
           next=null;
       }
   }
   
  void push(int dt){
       Node new_node=new Node(dt);
       if (head==null){
       head=new_node;
       tail=head;
       }
       else{
          tail.next=new_node;
          tail=tail.next;
       }
   }
   
  void printll(){
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
      System.out.println();
  }
  
  void segregrateevenodd(){
      Node evenhead=null;
      Node eventail=null;
      Node oddhead=null;
      Node oddtail=null;
      Node curr=head;
      while (curr!=null){
          int ele=curr.data;
          if (ele%2==0){
              if (evenhead==null){
                  evenhead=curr;
                  eventail=evenhead;
              }
              else{
                  eventail.next=curr;
                  eventail=eventail.next;
              }
          }
          else{
              if (oddhead==null){
                  oddhead=curr;
                  oddtail=oddhead;
              }
              else{
                  oddtail.next=curr;
                  oddtail=oddtail.next;
              }
          }
          curr=curr.next;
      }
      if (oddhead==null || evenhead==null){
          return;
      }
      
      head=evenhead;
      eventail.next=oddhead;
      oddtail.next=null;
  }
}

public class Main{
    public static void main(String[] args){
        Linkedlist ll=new Linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            ll.push(sc.nextInt());
        }
        
        ll.printll();
        ll.segregrateevenodd();
        ll.printll(); 
    }
}
