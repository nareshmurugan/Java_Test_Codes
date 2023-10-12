// interface Eatable{  
//  void eat(); 
// }  
// class anonymous_class{  
//     public static void main(String args[]){  
//         Eatable e=new Eatable(){  
//                         public void eat(){System.out.println("nice fruits");}  
//                         };  
//         e.eat();  
//  }  
// }

class Person{  
    void eat(){System.out.println("jhdf");}
}  
class anonymous_class{  
 public static void main(String args[]){  
  Person p=new Person(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
  Person rr=new Person();
  rr.eat();
 }  
}  
class TestAnonymousInner$1 extends Person  {  
   TestAnonymousInner$1(){}  
   void eat()  
    {  
        System.out.println("nice fruits");  
    }  
}

