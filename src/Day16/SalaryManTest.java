package Day16;


class SalaryMan extends Person{

    String major;
    int salary;

    public SalaryMan(String n,String m,int a,int s){

        super(n,a);
        major=m;
        salary=s;
    }
    public String toString(){
        return "이름 = "+name+", 전공 = "+major+", 나이 = "+ age+", 월급 = "+salary;
    }
}
public class SalaryManTest {
    public static void main(String[] args) {
        SalaryMan s=new SalaryMan("백종원","요리",30,200000);
        System.out.println(s);
    }
}
