package edu.cen4802c.midterm_project;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {
        assertEquals(5, App.add(2,3));
    }
}