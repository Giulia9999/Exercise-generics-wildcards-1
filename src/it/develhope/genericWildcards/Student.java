package it.develhope.genericWildcards;

import java.util.List;

public class Student {
    private String studentName;
    private String studentSurname;
    private double marksAverage;

    public Student(String studentName, String studentSurname, double marksAverage){
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }


    public static double getAverageMark(List<? extends Number> listOfMarks){
        double firstValue = listOfMarks.get(0).doubleValue();
        double secondValue = listOfMarks.get(1).doubleValue();
        double average = (secondValue + firstValue)/2;
        return average;
    }
}
