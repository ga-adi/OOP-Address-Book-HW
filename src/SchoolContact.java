/**
 * Created by Todo on 3/24/2016.
 */
public class SchoolContact extends Contact {

    private int grade;

    @Override
    public void setType() {
        setContactType("School Contact");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
