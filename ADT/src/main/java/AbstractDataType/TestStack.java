/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataType;

/**
 *
 * @author waleeja
 */
    public class TestStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int result = stack.pop();
        System.out.println("Popped: " + result); // should print 30
    }
}
