public class ArrayQuiz {
    public static void main(String[] args) {
        /*위와 같은 데이터가 배열에 들어있다고 가정한다.
        * 여기서 가장 빈도수가 높은 주파수 대역을 2개 추출하고
        * 몇 번 검출되었는지 확인하는 프로그램을 작성하시오.
        *
        * 1. 목적 : 가장 빈번한 숫자 2개와 출현 횟수
        * 2. 배열을 활용하도록 한다.
        * 3. 각각이 몇 번 출현했는지(빈도수)를 표현해주는 배열이 필요하다.
        * 4. 이것에 대응되는 숫자 배열이 필요하다.
        * 중복되는 숫자가 몇 개 있는지 모르기 때문에 정확한 원소의 개수를 산출 할 수 없다.
        * 그러므로 먼저 중복되지 않은 원소 개수를 판별할 필요가 있다.
        * */
        int[] wirelessFreq = { 1,5,10,10,15,150,1500,2300
        ,2350,2350,2350,2350,2350,2350,2350,2350
        ,23423,1231,52352,2352332,13123,34531,2342,
        1231,2342,2342,368,4675,47905,45604,4500,
        5000,5000,5000,5000,5000,5000,5000,5000,5000};

       int i,j,key;

       int len=wirelessFreq.length;

       for(i=1;i<len;i++)
       {
           key=wirelessFreq[i];

           for(j=i-1;wirelessFreq[j]>key;j--){
               wirelessFreq[j+1]=wirelessFreq[j];
           }
           wirelessFreq[j+1]=key;
       }
       for(i=0;i<len;i++)
       {
           System.out.println("arr[" + i + "] = " + wirelessFreq[i]);
       }
       int[] number;
       int[] freqCheck;

        int nonRecursNum=0;

       for(i=0;i<len;i++)
       {
           int a=0;
            if(i==0)    {
                nonRecursNum++;
                //continue는 무조건 다시 for 문으로 돌아가게 한다. 단 증감부를 거치게 됨
                continue;
            }
            //중복이 없으면
            for(j=0;j<i;j++) {
                if (wirelessFreq[i] != wirelessFreq[j]) {
                        a++;
                }

            }
            //그때가서 올려
           if(j==a) {
               nonRecursNum++;
           }
       }
       System.out.println(nonRecursNum);
    }
}
