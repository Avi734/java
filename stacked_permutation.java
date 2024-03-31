import java.util.*;
class permutations{
    public static boolean checkpermutation(Queue<Integer>ip,Queue<Integer>op){
        Stack<Integer>st=new Stack<>();
        while (!ip.isEmpty()){
            st.push(ip.poll());
            while (!st.isEmpty() && st.peek()==op.peek()){
                st.pop();
                op.poll();
            }
        }
        
        return st.isEmpty() && op.isEmpty();
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer>ip=new LinkedList<>();
        Queue<Integer>op=new LinkedList<>();
        String s=sc.nextLine();
        String s1=sc.nextLine();
        String a1[]=s.split(" ");
        String a2[]=s1.split(" ");
        for (int i=0;i<a1.length;i++){
            ip.add(Integer.valueOf(a1[i]));
        }
        for (int i=0;i<a2.length;i++){
            op.add(Integer.valueOf(a2[i]));
        }
        
        System.out.println(checkpermutation(ip,op)? "Yes": "No");
    }
}
