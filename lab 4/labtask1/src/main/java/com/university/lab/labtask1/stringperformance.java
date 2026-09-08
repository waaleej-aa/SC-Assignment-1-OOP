/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.labtask1;

/**
 *
 * @author waleeja
 */
public class stringperformance {
    
    public static String buildString(int n)
    {
        String s = "";
    for (int i = 0; i < n; i++) {
        s = s + i;
    }
    return s;
    }
     public static String buildStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i); 
        }
        return sb.toString();
    }
 public static void main(String[] args) {
        int n = 10000;
        long startTimeString = System.currentTimeMillis();
        buildString(n);
        long durationString = System.currentTimeMillis() - startTimeString;
        long startTimeBuilder = System.currentTimeMillis();
        buildStringBuilder(n);
        long durationBuilder = System.currentTimeMillis() - startTimeBuilder;

       
        System.out.println("Execution time for n = " + n + ":");
        System.out.println("Using String: " + durationString + " ms");
        System.out.println("Using StringBuilder: " + durationBuilder + " ms");
    }
}

