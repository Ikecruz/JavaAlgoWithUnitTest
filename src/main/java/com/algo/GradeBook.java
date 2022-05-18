package com.algo;

public class GradeBook {
    
    public static char getGrade(int s1, int s2, int s3) {
        
        int average = 0;
        char grade = ' ';
        char[] gradeChar = new char[]{'A','B','C','D','F'};

        average = (s1 + s2 + s3) / 3;

        if ((90 <= average) && ( average <= 100)) grade = gradeChar[0];
        else if ((80 <= average) && ( average < 90)) grade = gradeChar[1];
        else if ((70 <= average) && ( average < 80)) grade = gradeChar[2];
        else if ((60 <= average) && ( average < 70)) grade = gradeChar[3];
        else  grade = gradeChar[4];
        
        return grade;
    }

}
