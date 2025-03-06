package ru.vladimirminka.ticketservicebilet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladimirminka.ticketservicebilet.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {


}
