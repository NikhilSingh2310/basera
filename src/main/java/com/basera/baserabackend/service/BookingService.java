package com.basera.baserabackend.service;

import com.basera.baserabackend.dtos.BookingDTO;
import com.basera.baserabackend.dtos.Response;

public interface BookingService {

    Response getAllBookings();

    Response createBooking(BookingDTO bookingDTO);

    Response findBookingByReferenceNo(String bookingReference);

    Response updateBooking(BookingDTO bookingDTO);
}
