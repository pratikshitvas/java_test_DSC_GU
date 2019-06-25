package Code;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        Scanner s=new Scanner((System.in));
        int t=s.nextInt();
        int[][] solution =new int[t][2];
        Hello e=new Hello();
        for(int i=0;i<t;i++) {
            int m=s.nextInt();
            int n=s.nextInt();
            int[] cost = new int[n];
            for(int j=0;j<n;j++){
                cost[j]=s.nextInt();
            }
            solution[i]=e.icecreamParlor(m,cost);
        }
        for(int o=0;o<t;o++){
            for(int p=0;p<2;p++) {
                System.out.println(solution[o][p]);
            }
        }

    }
    public int[] icecreamParlor(int m,int[] cost){
        int n=cost.length;
        int[] solution={0,0};
        for(int k=0;k<n;k++){
            int x=cost[k];
            for(int y=k+1;y<n;y++){
                if((x+cost[y])==m){
                    solution[0]=k+1;
                    solution[1]=y+1;
                    return solution;
                }
            }
        }
        return solution;
    }
}
