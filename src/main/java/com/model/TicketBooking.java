package com.model;

public class TicketBooking {
    private String name;
    private String match;
    private int numTickets;

    public TicketBooking(String name, String match, int numTickets) {
        this.name = name;
        this.match = match;
        this.numTickets = numTickets;
    }

    public String getName() {
        return name;
    }

    public String getMatch() {
        return match;
    }

    public int getNumTickets() {
        return numTickets;
    }
}

