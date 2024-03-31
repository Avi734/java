import java.util.*;
class priorityqueueDLL{
    static Node front,rear;
    
    static class Node{
        char info;
        int priority;
        Node prev,next;
    }
    static void display(){
        Node curr=front;
        if (isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        else{
            while (curr!=null){
                System.out.println("In - "+curr.info+" pr - "+curr.priority);
                curr=curr.next;
            }
        }
    }
    static void push(char n, int p){
        Node new_node= new Node();
        new_node.info=n;
        new_node.priority=p;
        
        if (isEmpty()){
            front=new_node;
            rear=new_node;
            new_node.next=null;
        }
        
        else{
            if (p<=front.priority){
                new_node.next=front;
                front.prev=new_node;
                front=new_node;
            }
            else if (p>rear.priority){
                rear.next=new_node;
                new_node.prev=rear;
                new_node.next=null;
                rear=new_node;
            }
            else{
                Node st=front.next;
                while (st.priority<p){
                    st=st.next;
                }
                st.prev.next=new_node;
                new_node.prev=st.prev;
                st.prev=new_node;
                new_node.next=st;
                
            }
        }
    }
    static char peek(){
        return front.info;
    }
    static boolean isEmpty(){
        return (front==null);
    }
    static char pop(){
        Node temp=front;
        char res = temp.info;
        front=front.next;
        if (isEmpty()){
            rear=null;
        }
        return res;
            
    }
    public static void main(String args[])
    {


        push('b', 3);
        push( 'c', 4);
        push( 'e', 6);
        push( 'f', 7);
        push( 'a', 2);
        push( 'd', 5);


        display();


        System.out.println("peek1 "+peek());
        System.out.println("poped elt "+pop());
        System.out.println("peek2 "+peek());
    }
}

    
