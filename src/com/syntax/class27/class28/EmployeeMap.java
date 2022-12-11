package com.syntax.class27.class28;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {
        /*Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employee who gets the highest salary.
        Output should be in the below format
                            John Smith=$100000*/

      Map<String, Integer> employee = new HashMap<>();
        employee.put("James", 100000);
        employee.put("Anna", 78000);
        employee.put("Brian", 120000);
        employee.put("Tanya", 150000);



            var iterator = employee.entrySet().iterator();
            int highest = 0;
            String name=" ";
            while (iterator.hasNext()) {
                var num = iterator.next();
                var salary = num.getValue();
                if (salary > highest) {
                    highest = salary;
                    name = num.getKey();
                }
            }
                        System.out.println(name+"="+highest);
                    }
                }







