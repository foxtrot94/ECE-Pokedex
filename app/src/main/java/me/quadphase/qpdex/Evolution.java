package me.quadphase.qpdex;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : QPdex (C) 2015
//  @ File Name : Evolution.java
//  @ Date : 21-Jul-15
//  @ Author : Nicole
//
//


/** */
public class Evolution {
    /**
     * Condition needed to evolve into the next pokemon
     */
    private String condition;

    /**
     * pokemon that the current pokemon evolves into
     */
    private Pokemon evolvesInto;

    /**
     * Constructor
     */
    public Evolution(String condition, Pokemon evolvesInto) {
        this.condition = condition;
        this.evolvesInto = evolvesInto;
    }

    /**
     * Getters
     */
    public String getCondition() {
        return condition;
    }

    public Pokemon getEvolvesInto() {
        return evolvesInto;
    }
}