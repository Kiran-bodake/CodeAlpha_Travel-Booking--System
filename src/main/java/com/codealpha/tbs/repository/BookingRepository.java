package com.codealpha.tbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codealpha.tbs.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
