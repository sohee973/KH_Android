import java.util.Scanner;

public class HWArrayVer {
    public static void main(String[] args) {
        int[] series;
        Scanner in=new Scanner(System.in);
        System.out.println("몇 항까지 합칠까요?");
        int num=in.nextInt();

        series=new int[num];

        series[0]=1;
        series[1]=1;
        series[2]=3;

        for(int i=3;i<num;i++)
        {
            series[i]=series[i-3]+series[i-1];
        }
        for(int i=0;i<num;i++){
            System.out.println("series[" + i + "] ="+series[i]);
        }
        int res=0;
        for(int i=0;i<num;i++)
        {
            res +=series[i];
        }
        System.out.println("final res = " + res);
    }
}