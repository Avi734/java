import java.util.*;
public class towerofhanoi{
    public static void main(String[] args){
        Stack <Integer> src=new Stack<>();
        Stack <Integer> aux=new Stack<>();
        Stack <Integer> des=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
            src.push(i);
        }
        
        int moves=(int)Math.pow(2,n);
        Towerofhanoi(moves-1,src,aux,des);
        if (n%2==0){
            while (!aux.isEmpty()){
                System.out.print(aux.pop()+" ");
            }
        }
        else{
            while (!des.isEmpty()){
                System.out.print(des.pop()+" ");
            }
        }
    }
    public static void Towerofhanoi(int moves, Stack<Integer>src,Stack<Integer>aux, Stack<Integer> des){
        for (int i=1;i<=moves;i++){
            if (i%3==1){
                if (!src.isEmpty()&&(des.isEmpty()||des.peek()>src.peek())){
                    des.push(src.pop());
                    System.out.println("Move "+ i + " from Source to Destinantion");
                }
                else{
                    src.push(des.pop());
                    System.out.println("Move "+ i + " from destination to source");
                }
                
            }
            else if (i%3==2){
                if (!src.isEmpty()&&(aux.isEmpty() || aux.peek()>src.peek())){
                    aux.push(src.pop());
                    System.out.println("Move "+i+" from source to auxilary");
                }
                else{
                    src.push(aux.pop());
                    System.out.println("Move "+i+" from aux to src");
                }
            }
            else{
                if (!aux.isEmpty()&&(des.isEmpty()||des.peek()>aux.peek())){
                    des.push(aux.pop());
                    System.out.println("Move "+i+" from aux to des");
                }
                else{
                    aux.push(des.pop());
                    System.out.println("Move "+ i +" from des to aux");
                }
            }
        }
    }
}
