package com.example.doctor_strange.resources;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB {
    public static void main(String[] args) {
        conexionMongo();
    }

    public static void conexionMongo() {
        MongoClient client = MongoClients.create("mongodb+srv://Ana:ana@cluster0.pyfbj.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = client.getDatabase("registro");
        MongoCollection collection = database.getCollection("registro");

        Document sampleDoc = new Document("id", "4").append("name", "Patata");

        collection.insertOne(sampleDoc);
    }
}
