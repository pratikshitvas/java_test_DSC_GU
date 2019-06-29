import java.util.Scanner;
class Sol1 {
     int[] Parlor(int m,int[] cost)
    {
        int n=cost.length;
        int[] arr={0,0};
        for(int k=0;k<n;k++){
            int x=cost[k];
            for(int y=k+1;y<n;y++){
                if((x+cost[y])==m){
                    arr[0]=k+1;
                    arr[1]=y+1;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner s=new Scanner((System.in));
        int t=s.nextInt();
        int[][] arr =new int[t][2];
        Sol1 obj=new Sol1();
        for(int i=0;i<t;i++) {
            int m=s.nextInt();
            int n=s.nextInt();
            int[] cost = new int[n];
            for(int j=0;j<n;j++){
                cost[j]=s.nextInt();
            }
            arr[i]=obj.Parlor(m,cost);
        }
        for(int k=0;k<t;k++){
            for(int l=0;l<2;l++) {
                System.out.print(arr[k][l]);
            }
            System.out.println();
        }

    }
 }


