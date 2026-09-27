/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Ali", 50000, 8000));
        employees.add(new SalesManager("Zara", 40000, 200000, 0.05));
        employees.add(new Developer("Hamza", 55000, 7000));

        for (Employee e : employees) {
            System.out.println(e.getName() + " -> Pay: " + e.calculatePay());
        }
    }
}
