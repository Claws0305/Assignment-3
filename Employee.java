package java;

import java.text.DecimalFormat;
import java.;

public class Employee {
    public String firstname;
    public String Lastname;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer age;
    public Double salary;

    public Employee(String firstname, String lastname, Integer age, Double salary) {
        this.firstname = firstname;
        this.Lastname = lastname;
        this.age = age;
        this.salary = salary;
    }


    public String toString() {
        DecimalFormat dformat = new DecimalFormat(".##");
        return "Employee firstName:" + this.firstname + "Employee lastName:" + this.Lastname
                + "  Age:" + this.age
                + "  Salary:" + dformat.format(this.salary);

    }

    public static <Employee extends Comparable<? super java.Employee>, T, EmployeeMain> Employee avgAge(T t)
    {


         EmployeeMain AverageAge = new EmployeeMain();
          return (Employee) AverageAge;

    }

    public static <U extends Comparable<? super U>, T> U getcount(T t) {
        return (Employee) count;
    }
}
