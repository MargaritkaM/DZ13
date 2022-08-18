package ru.netology;

public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int cost;
    protected String departure;
    protected String arrival;
    protected int time;

    public Ticket(int id, int cost, String departure, String arrival, int time) {
        this.id = id;
        this.cost = cost;
        this.departure = departure;
        this.arrival = arrival;
        this.time = time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getTime() {
        return time;
    }


    @Override
    public int compareTo(Ticket ticket2) {
        return this.cost - ticket2.getCost();
    }
}
