package grades.modules;

import grades.Gradable;
import grades.GradeCalculator;

import java.util.Arrays;

public class Module implements Gradable {

    private String name;
    private double weighting;

    private GradedWork[] gradedWork;

    @Override
    public double getGrade() {

        return GradeCalculator.getWeightedGradeFor(Arrays.asList(gradedWork));
    }

    @Override
    public double getWeighting() {
        return weighting;
    }
}
