package com.jrtp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

    private String empName;
    private String empId;
    private String emailId;
    private double salary;
    private String department;


    public Employee(String empId, String empName, String emailId, double salary,String department) {
        this.empName = empName;
        this.empId = empId;
        this.emailId = emailId;
        this.salary = salary;
        this.department =department;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "empId='" + empId + '\'' +
            ", empName='" + empName + '\'' +
            ", emailId='" + emailId + '\'' +
            ", salary=" + salary +
            '}';
    }
}

//

public class StreamApiExample {

    public static void main(String []args){


        //
        ArrayList<Employee> empList =new ArrayList<>();
        empList.add(new Employee("101","Ravi","ravi@gmail.com",25000,"IT"));
        empList.add(new Employee("102","Rama","rama@gmail.com",34000,"Admin"));
        empList.add(new Employee("103","Kishore","kishore@gmail.com",57000,"DBA"));
        empList.add(new Employee("104","Harika","harika@gmail.com",78000,"IT"));
        empList.add(new Employee("105","Mani","mani@gmail.com",92000,"IT"));
        empList.add(new Employee("106","Naveen","naveen@gmail.com",51500,"IT"));
        empList.add(new Employee("107","Laxmi","laxmi@gmail.com",27000,"ADMIN"));
//more than 50000
        for(Employee emp1:empList)
            System.out.println(emp1);


        ArrayList<Employee> empList2=new ArrayList<>();

        for(Employee emp2:empList){

            if(emp2.getSalary()>50000){
                emp2.setSalary(emp2.getSalary()*1.10);
                empList2.add(emp2);
            }
          //100000*1.10-->  110000
        }
        //same operations with streams find out employees who is making >50000 salary
        //30000 and 50000 //IT & 25,50k incremenet 10 %
        // Admin
         empList2=(ArrayList<Employee>)empList.stream().filter(emp ->emp.getSalary()>50000).collect(Collectors.toList());



        System.out.println("List of Employees who is making more than 50000 salary");
        for(Employee emp1:empList2)
            System.out.println(emp1);



        //102, Hari, 35000,hari@gamil.com
        //103 "kiran, 67000, kiran@Gmail.com
        //104 Mani , 78000, mani@gmail.com
        //105, Nani, 65000,nani@gamil.com
        //106 "kishore, 62000, kiran@Gmail.com
        //107 Priya , 52500, priya@gmail.com

        //I want a list of people who is earning more than 50k ;



    }



}
