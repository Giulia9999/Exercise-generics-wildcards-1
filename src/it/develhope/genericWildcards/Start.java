package it.develhope.genericWildcards;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(8.9);
        individualMarksListLisa.add(7.5);

        List<Integer> projectMarksListJeremy  = new ArrayList<>();
        projectMarksListJeremy.add(9);
        projectMarksListJeremy.add(7);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        System.out.println(lisaAvg);

        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);
        System.out.println(jeremyAvg);

    }
}
