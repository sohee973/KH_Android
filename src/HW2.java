public class HW2 {
    public static void main(String[] args) {
        /* 숙제 5.
        * 1 2 4 8 16 32 64 128 256 512 1024 2048 4096 ...
        * 위 수열의 데이터를 각각 배열에 저장한다.
        * 인덱스는 0부터 시작한다.
        * 8번째, 10번째, 12번째, 16번째
        * 인덱스의 값들을 추출하여 출력하고 추출한 값들을 모두 더한 값을 출력하시오.*/
        int[] series;
        series = new int[100];
        series[0]=1;
        for(int i=1;i<100;i++)
        {
            series[i]=series[i-1]*2;
        }
        System.out.println("8번째 : " + series[7]);
        System.out.println("10번째 : " +series[9]);
        System.out.println("12번째 : " +series[11]);
        System.out.println("16번째 : " +series[15]);
    }
}
