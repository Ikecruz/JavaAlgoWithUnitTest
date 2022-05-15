package com.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeBookTest {
    
    @Test
    public void test1 () {
        assertEquals('A', GradeBook.getGrade(95,90,93));
        assertEquals('A', GradeBook.getGrade(100,85,96));
        assertEquals('A', GradeBook.getGrade(92,93,94));
        assertEquals('A', GradeBook.getGrade(100,100,100));
    }

    @Test
    public void test2() {
        assertEquals('B', GradeBook.getGrade(70,70,100));
        assertEquals('B', GradeBook.getGrade(82,85,87));
        assertEquals('B', GradeBook.getGrade(84,79,85));
    }
}
