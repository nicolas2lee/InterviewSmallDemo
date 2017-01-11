import java.util.Scanner;

/**
 * Created by xinrui on 31/12/16.
 */
public class Main2602 {

    public int max(int a, int b){
        return a>b?a:b;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int cas = input.nextInt();
        Main2602 obj = new Main2602();
        while(cas>0){
            int N = input.nextInt();
            int V = input.nextInt();
            int c[] = new int[N];
            int v[] = new int[N];
            int f[] = new int[V+1];
            for(int i=0;i<N;i++){
                c[i]=input.nextInt();
            }
            for(int i=0;i<N;i++){
                v[i]=input.nextInt();
            }/*
            for(int i=0;i<V;i++){
                System.out.print(f[i]);
            }*/
            for (int i=0;i<N;i++){
                for (int j=V;j>=v[i];j--){
                   // System.out.println("i= "+i+" j= "+j+" f[]");
                    f[j] = obj.max(f[j],f[j-v[i]]+c[i]);
                }
            }
            cas--;
            System.out.println(f[V]);
        }
        //System.out.println(n);
    }
}
