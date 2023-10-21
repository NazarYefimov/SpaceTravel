package com.example.spacetravel;

import javax.persistence.*;

@Entity
@Table(name = "planet")
public class Planet {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
