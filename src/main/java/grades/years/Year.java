package grades.years;

import grades.Gradable;

public class Year implements Gradable{

    private String name;
    private double grade;
    private double weighting;

    public String getName() {
        return name;
    }

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
        return getGrade() * getWeighting();
    }

    @Override
    public String toString() {
        return name + ": " + getWeightedGrade();
    }
}
