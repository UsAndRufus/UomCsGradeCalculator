package grades.years;

import grades.GradeCalculator;
import grades.modules.Module;

import java.util.Arrays;

public class UncompletedYear extends Year{

    private Module[] modules;

    @Override
    public double getGrade() {
        return GradeCalculator.getWeightedGradeFor(Arrays.asList(modules));
    }

}
