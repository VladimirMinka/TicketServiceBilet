package ru.vladimirminka.ticketservicebilet.service;

import ru.vladimirminka.ticketservicebilet.entity.Ticket;

public interface TicketService {


    Ticket createTicket(Ticket ticket);
    Ticket findTicketById(Long id);
}
