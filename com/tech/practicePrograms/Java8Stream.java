import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         List<Employee> list = new ArrayList<>();
             list.add(new Employee("abc",30));
             list.add(new Employee("sdf", 35));
        System.out.println("Hello World");
        
        list.stream().filter(e1->e1.getAge()>30).forEach(e1->System.out.print(e1.getName()));
        
     }
}

class Employee{
    
    String name;
    int age;
    
    public Employee(String name , int age){
        
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
