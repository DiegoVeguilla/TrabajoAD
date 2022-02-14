package com.example.application.clases;

import com.mongodb.client.*;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import org.bson.Document;

import java.util.ArrayList;

public class MongoDB {

    MongoClient client;
    MongoDatabase db;

    public MongoDatabase conectar(String nombreDatabase) {
        //conexion con la base de datos y la colección que metamos por parametros
        client = MongoClients.create("mongodb+srv://Ana:ana@cluster0.pyfbj.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        db = client.getDatabase(nombreDatabase);
        return db;
    }

    public void desconectar() {
        //cierra la conexión con el mongodb
        client.close();
    }

    public Personaje buscarPersonaje(String id) {
        MongoCollection<Document> col = conectar("personajes").getCollection("personajes");
        Document findDocument = new Document("Identificador", id);
        String identificador = "", url = "", alias = "", identidadSecreta = "", origen = "", tipo = "", organizacion = "";
        int inteligencia = 0, fuerza = 0, velocidad = 0, resistencia = 0, proyecEnergia = 0, habLucha = 0;

        for (Document resultDocument : col.find(findDocument)) {
            identificador = resultDocument.getString("Identificador");
            url = resultDocument.getString("Url");
            alias = resultDocument.getString("Alias");
            identidadSecreta = resultDocument.getString("IdentidadSecreta");
            origen = resultDocument.getString("Origen");
            tipo = resultDocument.getString("Tipo");
            organizacion = resultDocument.getString("Organizacion");
            inteligencia = resultDocument.getInteger("Inteligencia");
            fuerza = resultDocument.getInteger("Fuerza");
            velocidad = resultDocument.getInteger("Velocidad");
            resistencia = resultDocument.getInteger("Resistencia");
            proyecEnergia = resultDocument.getInteger("ProyecEnergia");
            habLucha = resultDocument.getInteger("HabLucha");
        }

        desconectar();
        return new Personaje(identificador, alias, identidadSecreta, organizacion, tipo, origen, url, inteligencia, fuerza, velocidad, resistencia, proyecEnergia, habLucha);

    }
    public Escenario buscarEscenario(String id) {
        MongoCollection<Document> col = conectar("escenarios").getCollection("escenarios");
        Document findDocument = new Document("Identificador", id);
        String identificador = "", nombre = "", url = "";
        int monedas = 0, numIntegrantes = 0, numMovimientos = 0, energiaVital = 0;

        for (Document resultDocument : col.find(findDocument)) {
            identificador = resultDocument.getString("Identificador");
            nombre = resultDocument.getString("Nombre");
            monedas = resultDocument.getInteger("Monedas");
            numIntegrantes = resultDocument.getInteger("NumIntegrantes");
            numMovimientos = resultDocument.getInteger("NumMovimientos");
            energiaVital = resultDocument.getInteger("EnergiaVital");
            url = resultDocument.getString("Url");
        }
        desconectar();
        return new Escenario(identificador, nombre, numIntegrantes, numMovimientos, energiaVital, url, monedas);

    }
    public Jugador crearUsuario(String usuario, String correo, String contrasenia, String genero, String pais, String edad, String telefono) {
        int victorias = 0;
        MongoCollection<Document> col = conectar("usuarios").getCollection("usuarios");
        Document document = new Document("Nombreusuario", usuario).
                append("Correo", correo).
                append("Contrasenia", contrasenia).
                append("Telefono", telefono).
                append("Genero", genero).
                append("Pais", pais).
                append("Edad", edad).
                append("Victorias", 0);
        col.insertOne(document);
        desconectar();
        Notification notification = Notification.show("Usuario creado correctamente");
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        return new Jugador(usuario, correo, contrasenia, genero, pais, edad, telefono, victorias);
    }
    public boolean existeUsuario(String usuario) {
        MongoCollection<Document> col = conectar("usuarios").getCollection("usuarios");
        Document findDocument = new Document("Nombreusuario", usuario);
        MongoCursor<Document> resultDocument = col.find(findDocument).iterator();

        if (col.find(findDocument) == null) {
            desconectar();
            return true;
        } else {
            Notification notification = Notification.show("Ya exsiste un usuario con ese nombre");
            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
            desconectar();
            return false;
        }
    }
    public Jugador buscarUsuario(String usuario, String contrasenia) {
        inicializarVictorias();
        MongoCollection<Document> col = conectar("usuarios").getCollection("usuarios");
        Document findDocument = new Document("Nombreusuario", usuario);
        String password = "", correo = "", genero = "", pais = "", edad = "", telefono = "";
        int victorias = -1;
        boolean correcto = false;
        for (Document resultDocument : col.find(findDocument)) {
            password = resultDocument.getString("Contrasenia");
            if (password.equals(contrasenia)) {
                correo = resultDocument.getString("Correo");
                genero = resultDocument.getString("Genero");
                pais = resultDocument.getString("Pais");
                edad = resultDocument.getString("Edad");
                telefono = resultDocument.getString("Telefono");
                victorias = resultDocument.getInteger("Victorias");
                desconectar();
                correcto = true;
            }else{correcto = false;}
        }
        if (correcto) {
            return new Jugador(usuario, correo, contrasenia, genero, pais, edad, telefono, victorias);
        } else {
            return null;
        }
    }
    public void guardarPartida(Jugador ganador, Jugador perdedor, Equipo equipoGanador, Equipo equipoPerdedor, Escenario escenario, Boolean empate) {
        MongoCollection<Document> col = conectar("partida").getCollection("partida");
        Document document = new Document("Ganador", ganador.getUsuario()).
                append("Perdedor", perdedor.getUsuario()).
                append("EquipoGanador", equipoGanador.comprimirEquipo()).
                append("EquipoPerdedor", equipoPerdedor.comprimirEquipo()).
                append("Escenario", escenario.getId()).
                append("Empate", empate);
        col.insertOne(document);
        desconectar();
    }
    public ArrayList<Jugador> ordenarPorVictorias() {
        inicializarVictorias();
        ArrayList<Jugador> ranking = new ArrayList<>();
        MongoCollection<Document> col = conectar("usuarios").getCollection("usuarios");
        Document sortingDocument = new Document("Victorias", -1);
        MongoCursor<Document> resultDocument = col.find().sort(sortingDocument).limit(3).iterator();
        while (resultDocument.hasNext()) {
            String usuario = "", contrasenia = "", correo = "", genero = "", pais = "", edad = "", telefono = "";
            int victorias = 0;
            Document document = resultDocument.next();
            victorias = document.getInteger("Victorias");
            usuario = document.getString("Nombreusuario");
            contrasenia = document.getString("Contrasenia");
            correo = document.getString("Correo");
            genero = document.getString("Genero");
            pais = document.getString("Pais");
            edad = document.getString("Edad");
            telefono = document.getString("Telefono");
            victorias = document.getInteger("Victorias");
            ranking.add(new Jugador(usuario, correo, contrasenia, genero, pais, edad, telefono, victorias));
        }
        desconectar();
        return ranking;
    }
    public void inicializarVictorias() {
        MongoCollection<Document> col = conectar("usuarios").getCollection("usuarios");
        Document sortingDocument = new Document("Nombreusuario", 1);
        MongoCursor<Document> resultDocument = col.find().sort(sortingDocument).iterator();
        while (resultDocument.hasNext()) {
            int victorias = 0;
            Document document = resultDocument.next();
            try {
                victorias = document.getInteger("Victorias");
            } catch (Exception e) {
                e.getMessage();
                victorias = 0;
                Document updateDocument = new Document("$set",
                        new Document("Victorias", victorias));
                col.findOneAndUpdate(document, updateDocument);
            }
        }
        desconectar();
    }
}
