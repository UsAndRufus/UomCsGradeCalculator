package grades.modules;

import grades.Gradable;

public class GradedWork implements Gradable{

    private String name;
    private double grade;
    private double weighting;

    @Override
    public double getGrade() {
        return grade;
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
