/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package AbstractDataType;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class StudentCollectionTest {

    @Test
    void testAddAndFind() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(1, "Ali", 3.8));

        assertEquals(1, collection.getSize());
        assertNotNull(collection.findStudent(1));
        assertEquals("Ali", collection.findStudent(1).getName());
    }

    @Test
    void testRemove() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(1, "Ali", 3.8));
        collection.removeStudent(1);

        assertTrue(collection.isEmpty());
        assertNull(collection.findStudent(1));
    }

    @Test
    void testEmptyInitially() {
        StudentCollection collection = new StudentCollectionImpl();
        assertTrue(collection.isEmpty());
        assertEquals(0, collection.getSize());
    }
}