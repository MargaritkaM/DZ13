package ru.netology;

public class TicketRepository {

    private Ticket[] tickets = new Ticket[0];

    public void save(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public void removeById(int removeId) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != removeId) {
                tmp[index] = ticket;
                index++;
            }
        }
        tickets = tmp;
    }

    public Ticket findById(int id) {
        Ticket result = null;
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                result = ticket;
                break;
            }
        }
        return result;
    }


    public Ticket[] getTickets() {
        return tickets;
    }

}
