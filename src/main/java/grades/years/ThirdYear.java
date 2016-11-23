package grades.years;

public class ThirdYear extends Year{

    private static final double WEIGHTING = 2.0 / 3.0;

    @Override
    public double getGrade() {
        return 0;
    }

    @Override
    public double getWeighting() {
        return WEIGHTING;
    }
}
