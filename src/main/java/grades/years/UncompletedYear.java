package grades.years;

import grades.modules.Module;

import java.util.Arrays;

public class UncompletedYear extends Year{

    private Module[] modules;

    @Override
    public double getGrade() {
        return Arrays.stream(modules)
                .mapToDouble(Module::getWeightedGrade)
                .sum();
    }

}
