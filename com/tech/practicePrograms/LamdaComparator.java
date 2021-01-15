/*

Java 7 and Java 8 conventions of sorting using Comparators, for a Entity Object


*/

import java.util.*;

public class LambdaComparator{
    public static void main(String args[]){
        
        List<Person> list = Arrays.asList(
            new Person("Mick", 36),
            new Person("Lols", 34),
            new Person("Tony", 35)
            );
            
        // print before sorting
        for(Person p: list){
            System.out.println(p);
        }
        
        System.out.println();
        
        // Sort the list based on the name
        System.out.println("Java 7 convention to Sort the list based on the Name");
         Collections.sort(list, new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return p1.getName().compareTo(p2.getName());
            }
            });
        
        // print after sorting
        for(Person p: list){
            System.out.println(p);
        }
            
        System.out.println();
            
        // Sort based on the Age
         System.out.println("Java 7 convention to Sort the list based on the Age");
         Collections.sort(list, new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return p1.getAge()-p2.getAge();
            }
            });
        
        // print after sorting
        for(Person p: list){
            System.out.println(p);
        }
        
        System.out.println();
            
        // sort by using Lamba expression, with Names
        System.out.println("Java 8 LAMBDA convention to Sort the list based on the Name");
        Collections.sort(list, (p1,p2)->  p1.getName().compareTo(p2.getName()));
        // print after sorting
        for(Person p: list){
            System.out.println(p);
        }
        
        System.out.println();
        
        // sort by using Lamba expression, with Age
        System.out.println("Java 8 LAMBDA convention to Sort the list based on the Age");

        Collections.sort(list, (p1,p2)->  p1.getAge()-p2.getAge());
       // print after sorting
        for(Person p: list){
            System.out.println(p);
        }
        
        System.out.println();
        
        
        
        
    }
}

class Person{
    String name;
    int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
        
    }
    
    @Override
    public String toString(){
        return "Person's name is " + name + " and" + " Age is "+ age;
    }
}
