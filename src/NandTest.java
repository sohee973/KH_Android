import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class NandTest {
    public static void main(String[] args) {
        /*16진수 표기법 :
        1. 맨 앞에 0x를 붙인다.
        2. 0~9 까지는 동일하다.
        3. a-10 , b-11 , c-12, d-13, e-14, f-15
        4. 10 진수는 0~9 까지, 16 진수는 0~f(15)까지
        5. 16 진수는 1자리는 2진수 4자리로 대체된다.
        (2^4=16 이라서 그렇다)

        * */
        int positive=0xffffffff;
        int positive2=0xa; // 1111(2),15
        /*16진수 -> 2진수와 2진수 -> 16진수를 잘 해야함
        * 0xf -> 10 진수 15
        * 15-8 -> 2^3
        * 7-3 -> 2^2
        * 3-2 -> 2^1
        * 1   -> 2^0
        *
        * 0xf == 1111(2)
        * 0xc == 12 ==1100(2)
        * 12 - 8 --> 2^3
        * 4      --> 2^2
        *
        * 16 진수 변환의 장점 (빠르게 비트 수를 볼 수 있다)
        * 0xcf38ad ----> 2진수 변환
        * 1100 1111 0011 1000 1010 1101
        *
        * 0xca --> 2 진수 변환
        * 1100 1010
        * 12(c) x 16^1 + 10(a) x 16^0 = 202
        *
        * 2^7 + 2^6 + 2^3 + 2^1 =
        * */

        int notPos1 = ~positive;
        System.out.println(notPos1);
        int notPos2 = ~positive2;
        System.out.println(notPos2);

        /*음수를 해석하는 방법
        * 1. 첫 번째 1을 찾는다.
        * 2. 첫 번째 1을 포함하여 이전 정보를 유지한다.
        * 3. 나머지는 전부 반전한다.
        * 4. 그 결과를 재해석하면 음수가 된다. */

        /*실제 이 bit가 어떤 음수인가 ?
        * 1. 우리가 찾을려는 임의의 음수를 x로 저장한다.
        * 2. 여기에 위의 음수를 bit로 해석하는 기법을 적용한다.
        * 3. 그럼 결과만 양수로 나올 것이다. */

        int[] arr;
        arr = new int[16];
        Random rand = new Random();

        for(int i=0;i<16;i++)
        {
            arr[i] = rand.nextInt(128) +1;
            System.out.println("arr[" +i + "] = " + arr[i] + ", arr[" + i + "] &~ " +(arr[i] &~ 15));
            // nand를 쓰는 경우 반드시 2^n-1 의 숫자를 배치하도록 한다.

        }
            }


}