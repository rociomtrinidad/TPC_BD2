package com.grupo_bd2.tpc.entities;

import org.bson.types.ObjectId;

public class Car {

    private ObjectId id;
    private String patente;
    private int año;
    private String modelo;

    public Car(String patente, int año, String modelo) {

        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
    }

    public Car() {}

    public ObjectId getId() {
        return this.id;
    }

    public void setId(final ObjectId id) {
        this.id = id;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
