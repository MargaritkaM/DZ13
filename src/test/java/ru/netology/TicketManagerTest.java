package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(13, 1_010, "SVO", "VVO", 480);
    Ticket ticket2 = new Ticket(14, 1_000, "SVO", "AER", 180);
    Ticket ticket3 = new Ticket(15, 1_100, "SVO", "VVO", 300);
    Ticket ticket4 = new Ticket(16, 1_200, "SVO", "VVO", 120);
    Ticket ticket5 = new Ticket(17, 1_300, "SVO", "AER", 60);


    @BeforeEach
    public void setup() {
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.save(ticket4);
        repo.save(ticket5);
    }

    @Test
    public void saveTicket() {


        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Ticket[] actual = manager.getAllTickets();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findTicket() {


        Ticket[] expected = {ticket2, ticket5};
        Ticket[] actual = manager.searchBy("SVO", "AER");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findTicket2() {


        Ticket[] expected = {ticket1, ticket3, ticket4};
        Ticket[] actual = manager.searchBy("SVO", "VVO");

        Assertions.assertArrayEquals(expected, actual);
    }
}
