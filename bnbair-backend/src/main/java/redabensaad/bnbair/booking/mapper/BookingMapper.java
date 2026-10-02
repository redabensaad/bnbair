package redabenssad.bnbair.booking.mapper;

import redabenssad.bnbair.booking.application.dto.BookedDateDTO;
import redabenssad.bnbair.booking.application.dto.NewBookingDTO;
import redabenssad.bnbair.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
