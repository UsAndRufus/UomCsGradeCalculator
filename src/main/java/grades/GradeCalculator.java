package grades;

import java.util.List;

public class GradeCalculator {


    public static double getWeightedGradeFor(List<? extends Gradable> gradables) {
        double totalWeighting = getTotalWeightingFor(gradables);

        double totalGrade = getTotalGradeFor(gradables);

        return totalGrade / totalWeighting;
    }

    public static double getTotalWeightingFor(List<? extends Gradable> gradables) {
        return gradables.stream()
                .mapToDouble(Gradable::getWeighting)
                .sum();
    }

    public static double getTotalGradeFor(List<? extends Gradable> gradables) {
        return gradables.stream()
                .mapToDouble(Gradable::getWeightedGrade)
                .sum();
    }

}
