package grades.years;

import grades.Gradable;

public abstract class Year implements Gradable{

    @Override
    public double getWeightedGrade() {
        return getGrade() * getWeighting();
    }
}
