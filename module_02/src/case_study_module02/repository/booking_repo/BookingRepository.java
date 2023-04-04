package case_study_module02.repository.booking_repo;

import case_study_module02.models.Booking;

import java.util.Set;

public interface BookingRepository {
    boolean addBooking(Booking booking);
    Set<Booking> displayListBooking();
}
