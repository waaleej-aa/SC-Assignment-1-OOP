/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataType;

/**
 *
 * @author waleeja
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestAbstraction {
    public static void main(String[] args) {
        List<String> students;

        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("ArrayList: " + students);

        students = new LinkedList<>();
        students.add("Sara");
        System.out.println("LinkedList: " + students);
    }
}
