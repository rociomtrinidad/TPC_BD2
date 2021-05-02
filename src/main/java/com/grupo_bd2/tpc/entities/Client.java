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

public ObjetId getId (){
    return this.id;
}
public void setId (final ObjetId id) {
    this.id = id;
}

public Direccion getDireccion (){
    return this.direccion;
}
public void setDireccion (Direccion direccion){
    this.direccion = direccion;
}

public int getDni (){
    return this.dni;
}
public void setDni (int dni){
    this.dni = dni;
}

public String getNombre (){
    return this.nombre;
}
public void setNombre (String nombre){
    this.nombre = nombre;
}

public String getApellido (){
    return this.apellido;
}
public void setApellido (String apellido){
    this.apellido = apellido;
}

public String getObraSocial (){
    return this.obraSocial;
}
public void setObraSocial (String obraSocial){
    this.obraSocial = obraSocial;
}

public int getNumeroAfiliado(){
    return this.numeroAfiliado;
}
public void setNumeroAfiliado (int numeroAfiliado){
    this.numeroAfiliado = numeroAfiliado;
}
