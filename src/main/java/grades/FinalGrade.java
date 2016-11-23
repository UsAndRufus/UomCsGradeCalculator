package grades;

import grades.years.UncompletedYear;
import grades.years.Year;

import java.util.Arrays;

public class FinalGrade implements Gradable {

    private Year[] completedYears;
    private UncompletedYear[] uncompletedYears;

    @Override
    public double getGrade() {
        double totalWeighting = GradeCalculator.getTotalWeightingFor(Arrays.asList(completedYears)) +
                                GradeCalculator.getTotalWeightingFor(Arrays.asList(uncompletedYears));

        double totalGrade = GradeCalculator.getTotalGradeFor(Arrays.asList(completedYears)) +
                            GradeCalculator.getTotalGradeFor(Arrays.asList(uncompletedYears));;

        return totalGrade / totalWeighting;
    }

    @Override
    public double getWeighting() {
        return 1.0;
    }

    public void print() {
        Arrays.stream(completedYears)
                .forEach(System.out::println);
        Arrays.stream(uncompletedYears)
                .forEach(System.out::println);

        System.out.println("Final grade: " + getWeightedGrade());
    }
}
