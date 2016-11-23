package grades;

import grades.years.FirstYear;
import grades.years.SecondYear;
import grades.years.ThirdYear;

public class FinalGrade implements Gradable {

    private FirstYear firstYear;
    private SecondYear secondYear;
    private ThirdYear thirdYear;

    public FinalGrade() {
        this.firstYear = new FirstYear();
        this.secondYear = new SecondYear();
        this.thirdYear = new ThirdYear();
    }

    @Override
    public double getGrade() {
        return  firstYear.getWeightedGrade() +
                secondYear.getWeightedGrade() +
                thirdYear.getWeightedGrade();
    }

    @Override
    public double getWeighting() {
        return 1.0;
    }

    @Override
    public double getWeightedGrade() {
        return getWeighting() * getGrade();
    }

    @Override
    public String toString() {
        return "Your final grade is " + getWeightedGrade();
    }
}
