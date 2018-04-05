CREATE OR REPLACE FUNCTION seats_for_flight(id int) RETURNS TABLE(SeatNo int) AS $$
    SELECT SeatNo
        FROM Seats NATURAL JOIN Flights
        WHERE FlightId = id
    EXCEPT SELECT SeatNo 
        FROM Bookings NATURAL JOIN Flights NATURAL JOIN Seats
        WHERE Until > current_timestamp
$$ LANGUAGE SQL;

CREATE OR REPLACE FUNCTION book(Flight int, Seat int, Until timestamp)
RETURNS boolean AS $$
DECLARE booked boolean;
BEGIN
    DECLARE booking timestamp;
    SELECT Until FROM Bookings INTO booking
        WHERE FlightId = Flight
        AND SeatNo = Seat
        AND Until > current_timestamp;
    IF EXISTS(booking) THEN
        SELECT FALSE INTO booked;
    ELSE
        INSERT INTO Bookings(FlightId, SeatNo, Until) values
           (Flight, Seat, Until);
        SELECT TRUE INTO booked;
    END IF;
    RETURN booked;
END;
$$  LANGUAGE plpgsql;