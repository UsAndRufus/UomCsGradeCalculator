package grades.years;

public class FirstYear extends Year {

    private static final double WEIGHTING = 0.0;

    @Override
    public double getGrade() {
        return 0;
    }

    @Override
    public double getWeighting() {
        return WEIGHTING;
    }
}
