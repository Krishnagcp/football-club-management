package com.model;

public class MatchRegistration {
    private String name;
    private String match;

    public MatchRegistration(String name, String match) {
        this.name = name;
        this.match = match;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }
}

