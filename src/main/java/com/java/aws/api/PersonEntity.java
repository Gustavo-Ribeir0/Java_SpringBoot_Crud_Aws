package com.java.aws.api;

import javax.persistence.*;

@Entity
@Table(name = "Pessoas")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDPES", nullable = false)
    private long id;

    @Column(name = "PRINOMEPES", nullable = false)
    private String firstName;

    @Column(name = "ULTNOMEPES", nullable = false)
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
