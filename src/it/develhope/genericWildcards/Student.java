package it.develhope.genericWildcards;

import java.util.List;

public class Student {
    private final String studentName;
    private final String studentSurname;
    private final double marksAverage;

    public Student(String studentName, String studentSurname, double marksAverage){
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }

    public static double getAverageMark(List<? extends Number> listOfMarks){
        double firstValue = listOfMarks.get(0).doubleValue();
        double secondValue = listOfMarks.get(1).doubleValue();
        return (secondValue + firstValue)/2;
    }


}
