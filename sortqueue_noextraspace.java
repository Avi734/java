import java.util.*;
public class Queuesortnoextraspace{
    public static int minIndex(Queue<Integer> list,int sortIndex){
        int min_index=-1;
        int min_value=Integer.MAX_VALUE;
        int s=list.size();
        for (int i=0;i<s;i++){
            int current=list.peek();
            list.poll();
            if (current<=min_value&&i<sortIndex){
                min_index=i;
                min_value=current;
            }
            list.add(current);
            
        }
        return min_index;   
    }
    public static void insertminatrear(Queue<Integer>list,int min_index){
        int min_value=0;
        int s=list.size();
        for (int i=0;i<s;i++){
            int current=list.peek();
            list.poll();
            if (i!=min_index){
                list.add(current);
            }
            else{
                min_value=current;
            }
            
        }
        list.add(min_value);
        
    }
    public static void sortQueue(Queue<Integer> list){
        for (int i=0;i<list.size();i++){
            int min_index=minIndex(list,list.size()-i);
            insertminatrear(list,min_index);
        }
    }
    public static void main(String[] args){
        Queue<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        for (int i=0;i<a.length;i++){
            list.add(Integer.valueOf(a[i]));
        }
        sortQueue(list);
        while (!list.isEmpty()){
            System.out.print(list.peek()+" ");
            list.poll();
        }
    }
}
