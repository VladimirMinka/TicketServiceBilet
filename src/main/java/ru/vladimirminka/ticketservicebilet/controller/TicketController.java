package ru.vladimirminka.ticketservicebilet.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vladimirminka.ticketservicebilet.entity.Ticket;
import ru.vladimirminka.ticketservicebilet.service.TicketService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tickets")
public class TicketController {
    private final TicketService ticketService;


    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }


    @GetMapping("/{id}")
    public Ticket findTicketById(@PathVariable Long id) {
         return ticketService.findTicketById(id);

    }



}
