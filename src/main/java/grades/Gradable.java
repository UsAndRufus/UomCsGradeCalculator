package grades;

public interface Gradable {

    double getGrade();
    double getWeighting();
    default double getWeightedGrade() {
        return getWeighting() * getGrade();
    }
}
