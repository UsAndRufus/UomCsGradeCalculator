package grades;

import grades.years.UncompletedYear;
import grades.years.Year;

import java.util.Arrays;

public class FinalGrade implements Gradable {

    private Year[] completedYears;
    private UncompletedYear[] uncompletedYears;

    @Override
    public double getGrade() {
        return Arrays.stream(completedYears)
                .mapToDouble(Year::getWeightedGrade)
                .sum() +
                Arrays.stream(uncompletedYears)
                        .mapToDouble(Year::getWeightedGrade)
                        .sum();
    }

    @Override
    public double getWeighting() {
        return 1.0;
    }

    @Override
    public double getWeightedGrade() {
        return getWeighting() * getGrade();
    }

    public void print() {
        Arrays.stream(completedYears)
                .forEach(System.out::println);
        Arrays.stream(uncompletedYears)
                .forEach(System.out::println);

        System.out.println("Final grade: " + getWeightedGrade());
    }
}
