package ru.vladimirminka.ticketservicebilet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vladimirminka.ticketservicebilet.entity.Ticket;
import ru.vladimirminka.ticketservicebilet.repository.TicketRepository;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket findTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }
}
