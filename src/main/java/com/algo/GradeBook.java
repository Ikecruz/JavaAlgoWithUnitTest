package com.algo;

public class GradeBook {
    
    public static char getGrade(int s1, int s2, int s3) {
        
        int average = 0;
        char grade = ' ';

        average = (s1 + s2 + s3) / 3;

        if ((90 <= average) && ( average <= 100)) grade = 'A';
        else if ((80 <= average) && ( average < 90)) grade = 'B';
        else if ((70 <= average) && ( average < 80)) grade = 'C';
        else if ((60 <= average) && ( average < 70)) grade = 'D';
        else  grade = 'F';
        
        return grade;
    }

}
