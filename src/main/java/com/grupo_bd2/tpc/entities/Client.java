package com.grupo_bd2.tpc.entities;
import org.bson.types.ObjectId;

public class Client {
    
    private ObjectId id;
    private Address address;
    private int dni;
    private String name;
    private String surname;
    private String medicalInsurer;
    private int affiliateNumber;

    public Client() {}

    public Client(Address address, int dni, String name, String surname, String medicalInsurer, int affiliateNumber) {

        this.address = address;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.medicalInsurer = medicalInsurer;
        this.affiliateNumber = affiliateNumber;
    }
}
