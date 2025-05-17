package com.basera.baserabackend.service;

import com.basera.baserabackend.dtos.BookingDTO;
import org.apache.catalina.connector.Response;

public interface BookingService {

    Response getAllBookings();

    Response createBooking(BookingDTO bookingDTO);

    Response findBookingByReferenceNo(String bookingReference);

    Response updateBooking(BookingDTO bookingDTO);
}
