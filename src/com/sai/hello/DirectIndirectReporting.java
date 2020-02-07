package com.sai.hello;

import java.io.IOException;
import java.util.*;

public class DirectIndirectReporting {
    public static void main(String[] args) {
        Employee a = new Employee("A", "");
        Employee b = new Employee("B", "A");
        Employee c = new Employee("C", "B");
        Employee d = new Employee("D", "C");
        Employee e = new Employee("E", "D");
        Employee h = new Employee("H", "E");
        Employee g = new Employee("G", "H");
        List<Employee> employeeList = Arrays.asList(a, b, c, d, e, g, h);
        employeeList.forEach(System.out::println);

        HashMap<String, String> directReportess = new HashMap<>();
        for(Employee emp:employeeList) {
            if (emp.getManagerName() != "") {
                if (directReportess.containsKey(emp.getManagerName()))
                    directReportess.put(emp.getManagerName(), directReportess.get(emp.getManagerName()) + findIfThisEmpIsManagerOfAnyEmp(employeeList,emp.getEmpName()));
                else
                    directReportess.put(emp.getManagerName(), findIfThisEmpIsManagerOfAnyEmp(employeeList,emp.getEmpName()));
            }
        }
        System.out.println(directReportess);

    }

    private static String findIfThisEmpIsManagerOfAnyEmp(List<Employee> employeeList, String empName) {
        String indirectReportees=empName;
        int flag=0;
        for(Employee emp:employeeList){
            if(emp.getManagerName().equals(empName)){
                flag=1;
                indirectReportees=indirectReportees+findIfThisEmpIsManagerOfAnyEmp(employeeList,emp.getEmpName());
            }
        }
        if(flag==0)
            indirectReportees=empName;
        return indirectReportees;
    }


}
