package grades.modules;

import grades.Gradable;

import java.util.Arrays;

public class Module implements Gradable {

    private String name;
    private double weighting;

    private GradedWork[] gradedWork;

    @Override
    public double getGrade() {
        return Arrays.stream(gradedWork)
                .mapToDouble(GradedWork::getWeightedGrade)
                .sum();
    }

    @Override
    public double getWeighting() {
        return weighting;
    }

    @Override
    public double getWeightedGrade() {
        return getWeighting() * getGrade();
    }
}
