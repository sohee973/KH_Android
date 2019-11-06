package Day16;

/*
* 문제 7-1.
* 상속 없이 교수 클래스를 작성해보시오.
*
* 문제 7-2.
* 상속을 활용하여 교수 클래스를 작성해보시오.
*
* 문제 7-3.
* 상속을 활용하여 회사원 클래스를 작성해보시오.
* */
/*
class Professor{
    String name;
    int age;
    String major;

    public Professor(String n,int a,String m)
    {
        name=n;
        age=a;
        major=m;
    }
    public String toString(){
        return "이름 = "+name+", 전공 = "+major+", 나이 = "+age;
    }
}
*/
/*class Person{
    String name;
    int age;

    public Person(String n,int a)
    {
        name=n;
        age=a;
    }
    public String toString(){
        return "이름 = "+name+", 나이 = "+age;
    }
}*/

class Professor extends Person{

    String major;

    public Professor(String n,int a,String m)
    {
        super(n,a);
        major=m;
    }
    public String toString(){
        return "이름 = "+name+", 전공 = "+major+", 나이 = "+age;
    }
}

class Officer extends Person{

    String grade;

    public Officer(String n,int a,String g)
    {
        super(n,a);
        this.grade=g;
    }
    public String toString(){
        return "이름 = "+name+", 직급 = "+grade+", 나이 = "+age;
    }
}



public class Question7 {
    public static void main(String[] args) {
        Professor p=new Professor("펭수",10,"댄스");
        System.out.println(p);
        Officer o=new Officer("뚝딱이",40,"사장");
        System.out.println(o);
    }
}
