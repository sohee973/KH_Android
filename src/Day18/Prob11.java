package Day18;

import java.util.Random;

public class Prob11 {
    public static void main(String[] args) {
        RandNum rn1=new RandNum();
        rn1.initNumber();

        RandNum rn2=new RandNum();
        rn2.initNumber();

        System.out.println("and = "+rn1.calcAnd(rn2));
        System.out.println("or = "+rn1.calcOr(rn2));
        System.out.println("xor = "+rn1.calcXor(rn2));

        System.out.println("not rn1 = "+rn1.calcNot(rn1));

    }
}
