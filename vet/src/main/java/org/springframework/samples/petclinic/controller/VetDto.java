package org.springframework.samples.petclinic.controller;

import java.util.List;

/**
 * Eine möglichst einfache Projektion der Daten aus dem Vets.
 */
public class VetDto {

    // id dropped because we think we do not need it
    public String firstName;
    public String lastName;
    public List<String> specialties;

    public VetDto(String firstName, String lastName, List<String> specialties) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialties = specialties;
    }

    public int getNrOfSpecialties() {
        return specialties.size();
    }
}