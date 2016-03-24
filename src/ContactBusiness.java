import java.util.Date;

/**
 * Created by charlie on 3/24/16.
 */
public class ContactBusiness extends Contact {
    private long dateTimeLastSpokenTo; // date/time in millis

    public long getDateTimeLastSpokenTo() {
        return dateTimeLastSpokenTo;
    }

    public void setDateTimeLastSpokenTo(long dateTimeLastSpokenTo) {
        this.dateTimeLastSpokenTo = dateTimeLastSpokenTo;
    }

    /**
     * Use date/time last spoken to for sorting (so you can get the business contact
     * you spoke to least recently, so you know who to network with... ugh, networking, I know)
     */
    @Override
    public long getDateTimeForSorting() {
        return dateTimeLastSpokenTo;
    }
}
