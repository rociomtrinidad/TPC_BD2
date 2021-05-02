package com.grupo_bd2.tpc.entities;
import org.bson.types.ObjectId;

public class Employee {
    
    private ObjetId id;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private String cuil;
    private String dni;
    private String nombre;
    private String apellido;
    private String obraSocial;
    private String numeroAfiliado;
    
    public Empleado(){}
    
    public Empleado (Domicilio domicilio, Sucursal sucursal, String cuil, String dni, String nombre, String apellido, String obraSocial, int numeroAfiliado){
        this.domicilio = domicilio;
        this.sucursal = sucursal;
        this.cuil = cuil;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.obraSocial = obraSocial;
        this.numeroAfiliado = numeroAfiliado;
    }
}

public ObjectId getId (){
    return this.id;
}
public void setId (final ObjectId id){
    this.id = id;
}

public Domicilio getDomicilio (){
    return this.domicilio;
}
public void setDomicilio(Domicilio domicilio){
    this.domicilio = domicilio;
}

public Sucursal getSucursal(){
    return this.sucursal;
}
public void setSucursal(Sucursal sucursal){
    this.sucursal = sucursal;
}

public String getCuil (){
    return this.cuil;
}
public void setCuil(String cuil){
    this.cuil = cuil;
}

public String getDni (){
    return this.dni;
}
public void setDni(String dni){
    this.dni = dni;
} 

public String getNombre (){
    return this.nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getApellido (){
    return this.apellido;
}
public void setApellido(String apellido){
    this.apellido = apellido;
}

public String getObraSocial (){
    return this.obraSocial;
}
public void setObraSocial(String obraSocial){
    this.obraSocial = obraSocial;
}

public int getNumeroAfiliado (){
    return this.numeroAfiliado;
}
public void setNumeroAfiliado(int numeroAfiliado){
    this.numeroAfiliado = numeroAfiliado;
}
