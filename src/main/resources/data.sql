-- Sample Data for Travel Booking System

-- Insert Users
INSERT INTO user (name, email, password, role) VALUES
('John Doe', 'john@example.com', 'password123', 'USER'),
('Alice Smith', 'alice@example.com', 'password456', 'USER'),
('Admin', 'admin@example.com', 'adminpass', 'ADMIN');

-- Insert Flights
INSERT INTO flight (flight_number, origin, destination, departure_time, arrival_time, price, available_seats) VALUES
('FL123', 'New York', 'Los Angeles', '2025-02-15 10:00:00', '2025-02-15 13:00:00', 250.00, 100),
('FL456', 'Chicago', 'Miami', '2025-02-16 14:00:00', '2025-02-16 18:00:00', 180.00, 80);

-- Insert Hotels
INSERT INTO hotel (name, location, price_per_night, available_rooms) VALUES
('Grand Hotel', 'New York', 150.00, 20),
('Beach Resort', 'Miami', 200.00, 15);

-- Insert Transportation
INSERT INTO transportation (type, origin, destination, price, available_seats) VALUES
('CAR', 'Los Angeles', 'San Francisco', 100.00, 4),
('BUS', 'Chicago', 'Detroit', 50.00, 40);

-- Insert Bookings
INSERT INTO booking (user_id, service_type, service_id, booking_date, total_amount, status) VALUES
(1, 'FLIGHT', 1, '2025-02-10', 250.00, 'CONFIRMED'),
(2, 'HOTEL', 2, '2025-02-11', 400.00, 'CONFIRMED'),
(1, 'TRANSPORTATION', 1, '2025-02-12', 100.00, 'CANCELLED');
