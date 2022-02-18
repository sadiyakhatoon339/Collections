import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Employee {
     String name;
    int age;
    String designation;
    double salary;


    Employee(String n,int a,String d){
        name=n;
        age=a;
        designation =d;
    }
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the salary of employee 1");
        double salary=Double.parseDouble(br.readLine());

        System.out.println("Enter the salary of employee 2");
        double salary1=Double.parseDouble(br.readLine());

        System.out.println("Enter the salary of employee 3");
        double salary2=Double.parseDouble(br.readLine());




        HashMap<Employee,Double> h=new HashMap<>();

        Employee emp=new Employee("John Luik",32,"Analyst");
        Employee emp1=new Employee("Jason Woosh ",23,"Web Developer");
        Employee emp2=new Employee("Jenny Johnson ",26,"Data Scientist");


        h.put(emp,salary);
        h.put(emp1,salary1);
        h.put(emp2,salary2);


        for(Map.Entry<Employee,Double> e:h.entrySet()){
            System.out.println(e.getKey() +" "+e.getValue());

        }






    }
}


