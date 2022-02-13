package com.example.application.views.resumen;

import com.example.application.clases.*;
import com.example.application.views.partida.PartidaView;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@PageTitle("Resumen")
@Route(value = "resumen")
public class ResumenView extends VerticalLayout {


    private RouterLink empezar;


    private Image escenarioElegido;

    private Image img1E1, img2E1, img3E1;

    private Image img1E2, img2E2, img3E2;

    private HorizontalLayout horizontalEscesnarios, meQuieroMorir;

    private VerticalLayout verticalJugadoresElegidosE1, verticalJugadoresElegidosE2, verticalEmpezar, verticalMeQuieroMorir;

    private Personaje elegidoUnoE1, elegidoDosE1, elegidoTresE1, elegidoUnoE2, elegidoDosE2, elegidoTresE2;

    private Escenario escenario;

    public ResumenView() {
        setClassName("backgroundEscenarios");

        instancias();
        disenio();

        setSpacing(false);

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        getStyle().set("text-align", "center");
    }

    private void disenio() {
        verticalJugadoresElegidosE2.add(img1E2, img2E2, img3E2);
        verticalJugadoresElegidosE1.add(img1E1, img2E1, img3E1);

        verticalMeQuieroMorir.add(escenarioElegido, empezar);
        meQuieroMorir.add(verticalJugadoresElegidosE1, verticalMeQuieroMorir, verticalJugadoresElegidosE2);
        verticalMeQuieroMorir.getStyle().set("margin-left", "400px");
        verticalMeQuieroMorir.getStyle().set("margin-right", "400px");

        verticalEmpezar.add(meQuieroMorir);

        add(horizontalEscesnarios);
        add(verticalEmpezar);
    }

    private void instancias() {

        elegidoUnoE1 = (Personaje) ComponentUtil.getData(UI.getCurrent(), "Personaje1E1");
        elegidoDosE1 = (Personaje) ComponentUtil.getData(UI.getCurrent(), "Personaje2E1");
        elegidoTresE1 = (Personaje) ComponentUtil.getData(UI.getCurrent(), "Personaje3E1");

        elegidoUnoE2 = (Personaje) ComponentUtil.getData(UI.getCurrent(), "Personaje1E2");
        elegidoDosE2 = (Personaje) ComponentUtil.getData(UI.getCurrent(), "Personaje2E2");
        elegidoTresE2 = (Personaje) ComponentUtil.getData(UI.getCurrent(), "Personaje3E2");

        Jugador jugador1 = (Jugador) ComponentUtil.getData(UI.getCurrent(), "jugadorUno");
        Jugador jugador2 = (Jugador) ComponentUtil.getData(UI.getCurrent(), "jugadorDos");

        escenario = (Escenario) ComponentUtil.getData(UI.getCurrent(), "escenario");

        Equipo equipo1 = jugador1.getEquipo();
        Equipo equipo2 = jugador2.getEquipo();

        equipo1.addPersonaje(elegidoUnoE1);
        equipo2.addPersonaje(elegidoUnoE2);
        equipo1.addPersonaje(elegidoDosE1);
        equipo2.addPersonaje(elegidoDosE2);
        equipo1.addPersonaje(elegidoTresE1);
        equipo2.addPersonaje(elegidoTresE2);

        equipo1.setDatos(escenario);
        equipo2.setDatos(escenario);

        jugador1.setEquipo(equipo1);
        jugador2.setEquipo(equipo2);

        Partida partida = new Partida(jugador1,jugador2,escenario);

        partida.iniciarPersonajes(equipo1,escenario);
        partida.iniciarPersonajes(equipo2,escenario);

        ComponentUtil.setData(UI.getCurrent(), "Partida", partida);

        img1E1 = new Image();
        img1E1.setSrc(elegidoUnoE1.getUrl());
        img2E1 = new Image();
        img2E1.setSrc(elegidoDosE1.getUrl());
        img3E1 = new Image();
        img3E1.setSrc(elegidoTresE1.getUrl());

        img1E1.setClassName("image2");
        img2E1.setClassName("image2");
        img3E1.setClassName("image2");

        img1E2 = new Image();
        img1E2.setSrc(elegidoUnoE2.getUrl());
        img2E2 = new Image();
        img2E2.setSrc(elegidoDosE2.getUrl());
        img3E2 = new Image();
        img3E2.setSrc(elegidoTresE2.getUrl());

        img1E2.setClassName("image2");
        img2E2.setClassName("image2");
        img3E2.setClassName("image2");

        escenarioElegido = new Image();
        escenarioElegido.setSrc(escenario.getUrl());
        escenarioElegido.setClassName("escenarios5");

        empezar = new RouterLink("Empezar partida", PartidaView.class);
        empezar.setClassName("boton");

        verticalEmpezar = new VerticalLayout();
        verticalJugadoresElegidosE1 = new VerticalLayout();
        verticalJugadoresElegidosE2 = new VerticalLayout();

        horizontalEscesnarios = new HorizontalLayout();
        meQuieroMorir = new HorizontalLayout();
        verticalMeQuieroMorir = new VerticalLayout();

    }

}