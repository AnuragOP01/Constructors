/*  1. Constructors are Special Type of function of java
    2. They can only be called for one time for one object
    3. By this we can assign some pre-requisites of an object 
    Like : NAME Year and everything 
    4. There are 3 types of constructors 
    a. Default Constructors: These are created by java compiler if we dont define anyhsthing
    b. Paramateerized Constructors: cunstructor name(----arguments-----){initialize}
    c. No-arguments Constructors: when we create our own constructor in place of default */


class Car{
    public String name;
    Car(){
        System.out.println("HELLO I AM NO ARGUMENTS CONSTRUCTOR");
    }
    void display(){
        System.out.println(name);
    }
}


class HI{
    public int a,b,c;
    void set(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void print(){
        System.out.println("a:"+a+"\nb:"+b+"\nc:"+c);
    }
}
public class construct{
    String name1,name2;
    private construct(String name1,String name2){
        this.name1=name1+" RATHORE";
        this.name2=name2+" PRATAP";
        System.out.println(this.name1+":"+this.name2);
    }
    public static void main(String[] args){

        Car c1 =new Car();
        c1.name="MARUTI";
        c1.display();


        construct c2=new construct("ANURAG","ADITYA");
            System.out.println(c2.name1+":"+c2.name2);


        HI a1 =new HI();
        a1.set(12,24,36);
        a1.print();

    }

}