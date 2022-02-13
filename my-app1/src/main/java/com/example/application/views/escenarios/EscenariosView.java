package com.example.application.views.escenarios;

import com.example.application.clases.Escenario;
import com.example.application.clases.MongoDB;
import com.example.application.views.nuevapartida.NuevaPartidaView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Escenarios")
@Route(value = "escenarios")
public class EscenariosView extends VerticalLayout {
    private Button escenario1, escenario2, escenario3, escenario4;
    private Button empezar;
    private Image escenarioElegido;
    private HorizontalLayout horizontalEscesnarios, meQuieroMorir;
    private VerticalLayout verticalJugadoresElegidosE1, verticalJugadoresElegidosE2, verticalEmpezar, verticalMeQuieroMorir;
    private Escenario escenario, sanctum, torre, cascada, school;
    private MongoDB mongoDB;


    public EscenariosView() {

        setClassName("backgroundEscenarios");
        conexionMongo();
        vincularEscenario();
        instancias();
        disenio();
        acciones();

        setSpacing(false);

        setSizeFull();
        setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);

        getStyle().set("text-align", "center");
    }

    private void conexionMongo() {
        mongoDB = new MongoDB();
    }

    private void vincularEscenario() {
        sanctum = mongoDB.buscarEscenario("01");
        torre = mongoDB.buscarEscenario("02");
        school = mongoDB.buscarEscenario("03");
        cascada = mongoDB.buscarEscenario("04");
    }

    private void disenio() {
        horizontalEscesnarios.add(escenario1, escenario2, escenario3, escenario4);
        verticalJugadoresElegidosE2.add();
        verticalJugadoresElegidosE1.add();

        verticalMeQuieroMorir.add(escenarioElegido, empezar);
        meQuieroMorir.add(verticalJugadoresElegidosE1, verticalMeQuieroMorir, verticalJugadoresElegidosE2);
        verticalMeQuieroMorir.getStyle().set("margin-left", "650px");
        verticalMeQuieroMorir.getStyle().set("margin-bottom", "300px");

        verticalEmpezar.add(meQuieroMorir);

        add(horizontalEscesnarios);
        add(verticalEmpezar);
    }

    private void acciones() {
        escenario1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                escenarioElegido.setSrc(torre.getUrl());
                escenario = torre;
            }
        });
        escenario2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                escenarioElegido.setSrc(sanctum.getUrl());
                escenario = sanctum;
            }
        });
        escenario3.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                escenarioElegido.setSrc(school.getUrl());
                escenario = school;
            }
        });
        escenario4.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                escenarioElegido.setSrc(cascada.getUrl());
                escenario = cascada;
            }
        });
        empezar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                ComponentUtil.setData(UI.getCurrent(), "escenario", escenario);
                getUI().ifPresent(ui -> ui.navigate(NuevaPartidaView.class));
            }
        });
    }

    private void instancias() {

        escenarioElegido = new Image();
        escenarioElegido.setClassName("escenarios5");

        escenario1 = new Button();
        escenario1.setClassName("escenarios1");
        escenario2 = new Button();
        escenario2.setClassName("escenarios2");
        escenario3 = new Button();
        escenario3.setClassName("escenarios3");
        escenario4 = new Button();
        escenario4.setClassName("escenarios4");

        empezar = new Button("SELECCIONAR PERSONAJES");
        empezar.setClassName("boton");

        verticalEmpezar = new VerticalLayout();
        verticalJugadoresElegidosE1 = new VerticalLayout();
        verticalJugadoresElegidosE2 = new VerticalLayout();

        escenarioElegido.setSrc(sanctum.getUrl());
        escenario = sanctum;


        horizontalEscesnarios = new HorizontalLayout();
        meQuieroMorir = new HorizontalLayout();
        verticalMeQuieroMorir = new VerticalLayout();

    }
}
