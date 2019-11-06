package Day18;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.Scanner;

/*정수형 변수 2개,
* 4 byte형 소수점 변수 1개, 8 byte형 소수점 변수 1개를 만들고 출력하시오.
* 0.클래스 상속법
* 1.Scanner 사용법
* 2.상속(extends) 사용법*/
class Scan extends Numbers{
    private Scanner in;

    public Scan(){
        super();
        in = new Scanner(System.in);
    }

    public void KeyboardIn(){
        System.out.println("첫 번째 정수를 입력하시오. : ");
        setOne(in.nextInt());
        System.out.println("두 번째 정수를 입력하시오. : ");
        setTwo(in.nextInt());
        System.out.println("float형 값을 입력하시오. : ");
        setfOne(in.nextFloat());
        System.out.println("double형 값을 입력하시오. : ");
        setdOne(in.nextDouble());

    }
}
public class Prob9 {
    public static void main(String[] args) {

        Scan s = new Scan();
        s.KeyboardIn();
        System.out.println(s);
    }

}
