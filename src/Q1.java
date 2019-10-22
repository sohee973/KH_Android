import java.util.Scanner;

/*문제. WHILE 문을 사용해서 1~100까지 숫자 중 3의 배수를 추출하시오.
        * (FOR 문 사용금지)*/
public class Q1 {
    public static void main(String[] args) {
        int i=1;
        while(i++<101)
        {
            if(i%3==0)
            {
                System.out.println("3의 배수입니다 : " + i);
            }
        }

    }
}
