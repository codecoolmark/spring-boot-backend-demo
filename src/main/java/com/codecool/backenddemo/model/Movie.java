package com.codecool.backenddemo.model;

import java.time.Instant;
import java.util.Collection;
import java.util.LinkedList;

public class Movie {

    private int id;
    private String title;

    private Instant productionDate;

    private Collection<Actor> actors;

    public Movie() {
        this.id = 0;
        this.actors = new LinkedList<>();
    }

    public Movie(int id, String title, Instant productionDate, Collection<Actor> actors) {
        this.id = id;
        this.title = title;
        this.productionDate = productionDate;
        this.actors = actors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProductionDate(Instant productionDate) {
        this.productionDate = productionDate;
    }

    public void setActors(Collection<Actor> actors) {
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Instant getProductionDate() {
        return productionDate;
    }

    public Collection<Actor> getActors() {
        return actors;
    }
}
