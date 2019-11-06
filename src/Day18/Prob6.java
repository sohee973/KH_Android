package Day18;

class Numbers {
int one;
int two;
float fOne;
double dOne;
public Numbers(){
    this(0,0,0,0);
}
public Numbers(int one,int two,float f,double d){
    this.one=one;
    this.two=two;
    fOne=f;
    dOne=d;
}
public void setOne(int one){
    this.one=one;
}
public void setTwo(int two){
    this.two=two;
}
public void setfOne(float fOne){
    this.fOne=fOne;
}
public void setdOne(double dOne){
    this.dOne=dOne ;
}

    public String toString() {
        return "one = " + one + ", two = " + two + ", fOne = " + fOne + ", dOne = " + dOne;
    }
}
public class Prob6 {
    public static void main(String[] args) {

        Numbers n = new Numbers(1, 2, 0.3f, 0.33);
        System.out.println(n);
    }

}
