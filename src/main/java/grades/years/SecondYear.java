package grades.years;

public class SecondYear extends Year {

    private static final double WEIGHTING = 1.0 / 3.0;

    @Override
    public double getGrade() {
        return 0;
    }

    @Override
    public double getWeighting() {
        return WEIGHTING;
    }
}
