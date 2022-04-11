package com.bobguinn.ecal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobguinn.ecal.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
