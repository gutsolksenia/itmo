CREATE DATABASE Airline;
\c Airline
CREATE TABLE Flights (
    FlightId int,
    FligtTime timestamp,
    PlaneId int,
    primary key(FlightId)
);

CREATE TABLE Seats (
	PlaneId int,
	SeatNo int,
	primary key(PlaneId, SeatNo)
);

CREATE OR REPLACE FUNCTION show_flights() RETURNS refcursor AS $$
    DECLARE
      ref refcursor;                                                     -- Declare a cursor variable
    BEGIN
      OPEN ref FOR SELECT * FROM Flights;   -- Open a cursor
      RETURN ref;                                                       -- Return the cursor to the caller
    END;
    $$ LANGUAGE plpgsql;