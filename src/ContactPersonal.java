import java.util.Calendar;
import java.util.Date;

/**
 * Created by charlie on 3/24/16.
 */
public class ContactPersonal extends Contact {
    private long dateOfBirth; // date/time in millis

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Use DOB for sorting so you know which personal contact has the next birthday
     */
    @Override
    public long getDateTimeForSorting() {
        Calendar calendar = Calendar.getInstance();
        int currYear = calendar.get(Calendar.YEAR);

        // set to contact's DOB, but change year to this year
        calendar.setTimeInMillis(dateOfBirth);
        calendar.set(Calendar.YEAR, currYear);

        return calendar.getTimeInMillis();
    }
}
