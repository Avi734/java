import java.util.*;
public class celeb{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
        
    int s=findcelebrity(arr,n);
    System.out.println(s==-1 ? "No celebrity": s);
    }
    public static int findcelebrity(int arr[][], int n){
        Stack <Integer>st=new Stack<>();
        for (int i=0;i<n;i++){
            st.push(i);
        }
        while (st.size()>1){
            int top=st.pop();
            int nexttop=st.pop();
            if (arr[top][nexttop]==1){
                st.push(nexttop);
            }
            else{
                st.push(top);
            }
        }
        int res=st.pop();
        for (int i=0;i<n;i++){
            if (i!=res){
                if (arr[i][res]!=1){
                    return -1;
                }
                
            }
            
        }
        return res;
        
    }
}
