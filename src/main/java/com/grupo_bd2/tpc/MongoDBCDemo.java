package com.grupo_bd2.tpc;

import com.grupo_bd2.tpc.config.*;
import com.grupo_bd2.tpc.entities.Address;
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.*;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;


public class MongoDBCDemo
{
    public static void main( String[] args )
    {
        //Java-MongoDB connection

        MongoCollection<Address> addresses = Config.getInstance().getMongoDatabase().getCollection("addresses",Address.class);

        //cars.find(eq("modelo","corolla")).forEach((Consumer<Car>) System.out::println); //ejemplosxd

        //cars.find(and(gt("año", 2000))).forEach((Consumer<Car>) System.out::println); // de filtros, gt() es greater than

        Address address = new Address(1046,"Thorne","Jose Marmol","Buenos Aires");

        addresses.insertOne(address);

        addresses.find().forEach((Consumer<Address>) System.out::println);

    }
}
