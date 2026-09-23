/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataType;

/**
 *
 * @author waleeja
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(1, "Ali", 3.8);

        // s.id = 5;  // ❌ compile error — id is private
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getCgpa());
    }
}
