package case_study_module02.repository.booking_repo;

import case_study_module02.models.Booking;
import case_study_module02.untils.ReadAndWriteFlieBooking;

import java.util.Set;

public class BookingRepoImpl implements BookingRepository{
    static final String PATH_FILE_BOOKING="src\\case_study_module02\\data\\booking.csv";
   static Set<Booking> bookings= ReadAndWriteFlieBooking.readFileBooking(PATH_FILE_BOOKING);
    @Override
    public boolean addBooking(Booking booking) {
        ReadAndWriteFlieBooking.writeFileBooking(PATH_FILE_BOOKING,booking);
        return true;
    }

    @Override
    public Set<Booking> displayListBooking() {
        return bookings;
    }
}
