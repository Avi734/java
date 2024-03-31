import java.util.*;
public class stockspan{
    static void calculatespan(int price[],int n,int S[]){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        S[0]=1;
        for (int i=1;i<n;i++){
            while (!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            S[i]=st.isEmpty() ? (i+1) : (i-st.peek());
            st.push(i);
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a1[] = s.split(" ");
        int n=a1.length;
        int price[]=new int[n];
        for (int i=0;i<n;i++){
            price[i]=Integer.parseInt(a1[i]);
        }
        int S[] = new int[n];
        calculatespan(price,n,S);
        
        System.out.print(Arrays.toString(S));

        
    }
}
