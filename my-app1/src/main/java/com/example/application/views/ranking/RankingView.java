package com.example.application.views.ranking;

import com.example.application.clases.Jugador;
import com.example.application.clases.MongoDB;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Ranking")
@Route(value = "ranking")
public class RankingView extends VerticalLayout {

    MongoDB mongoDB;
    Jugador jugador1,jugador2,jugador3;
    Div primero,segundo, tercero;

    public RankingView() {
        setSpacing(true);
        instancias();
        disenio();

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

    private void disenio() {
        primero.setText("1º "+ jugador1.getUsuario()+" con "+jugador1.getVictorias()+" victorias");
        segundo.setText("2º "+jugador2.getUsuario()+" con "+jugador2.getVictorias()+" victorias");
        tercero.setText("3º "+jugador3.getUsuario()+" con "+jugador3.getVictorias()+" victorias");

        add(primero);
        add(segundo);
        add(tercero);

    }

    private void instancias() {
        mongoDB = new MongoDB();
        jugador1=mongoDB.ordenarPorVictorias().get(0);
        jugador2=mongoDB.ordenarPorVictorias().get(1);
        jugador3=mongoDB.ordenarPorVictorias().get(2);

        primero = new Div();
        segundo = new Div();
        tercero = new Div();


    }

}


