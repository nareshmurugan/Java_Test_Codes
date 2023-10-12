class Employee {
    String n;
    int id;
    public Employee(String a, int b) {
        n=a;
        id=b;
    }
    public void Calc(){};
}

class FullTime extends Employee{
    int h;
    FullTime(String a,int b,int c){
        super(a,b);
        h=c;
    }
    public void Calc() {
        System.out.println(n+"\n"+id+"\n"+(12*h));
    }
}
class PartTime extends Employee{
    int h1,h2;
    PartTime(String a,int b,int c,int d){
        super(a,b);
        h1=c;h2=d;
    }
    public void Calc() {
        System.out.println(n+"\n"+id+"\n"+h1*h2);
    }
}

class MainMain {
    public static void main(String[] args) {
        Employee e1=new FullTime("hf",1,6);
        e1.Calc();
        Employee e2=new PartTime("rw",2,6,5);
        e2.Calc();
        FullTime e11=new FullTime("hf",1,6);
        e11.Calc();
        PartTime e22=new PartTime("rw",2,6,5);
        e22.Calc();
    }
}
