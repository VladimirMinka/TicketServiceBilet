package ru.vladimirminka.ticketservicebilet.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Entity
@Table(name = "tickets")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dateBuyTicket;
    private String cityTo;
    private String cityFrom;
    private int price;

    @Column(name = "name")
    private String username;




}
