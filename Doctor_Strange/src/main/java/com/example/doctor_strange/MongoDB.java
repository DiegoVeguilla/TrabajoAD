package com.example.doctor_strange;

import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoClientImpl;
import org.bson.Document;

public class MongoDB {

    MongoClient client;

    public MongoCollection connect(String nombreDatabase, String nombreColeccion) {
        //conexion con la base de datos y la colección que metamos por parametros
        client = MongoClients.create("mongodb+srv://Ana:ana@cluster0.pyfbj.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = client.getDatabase(nombreDatabase);
        MongoCollection collection = database.getCollection(nombreColeccion);
        return (collection);
    }

    public void disconnect(){
        //cierra la conexión con el mongodb
        client.close();
    }

    //usuarios [nombre, apellidos, genero, fecha de nacimiento, organización, pais, provincia]

    //crear usuarios
    //leer escenarios, personajes y usuarios
}
