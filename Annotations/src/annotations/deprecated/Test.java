package annotations.deprecated;


class A{  
void m(){System.out.println("hello m");}  
  
@Deprecated  
void n(){System.out.println("hello n");}  
}  
  
class Test{  
public static void main(String args[]){  
  
A a=new A();  
a.n();  
}}

