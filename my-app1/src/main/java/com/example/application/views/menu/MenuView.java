package com.example.application.views.menu;

import com.example.application.views.Informacion.InformacionView;
import com.example.application.views.escenarios.EscenariosView;
import com.example.application.views.inicio.InicioView;
import com.example.application.views.ranking.RankingView;
import com.example.application.views.reglas.ReglasView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@PageTitle("Menu")
@Route(value = "menu")
public class MenuView extends VerticalLayout {

    private RouterLink op_nueva_partida, op_ranking, op_reglas, op_informacion, op_salir;

    public MenuView() {

        setClassName("backgroundMenu");
        instancias();
        add(op_nueva_partida);
        add(op_ranking);
        add(op_reglas);
        add(op_informacion);
        add(op_salir);
        setSpacing(true);


        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

    private void instancias() {
        op_informacion = new RouterLink("Informacion", InformacionView.class);
        op_informacion.setClassName("boton");
        op_nueva_partida = new RouterLink("Nueva Partida", EscenariosView.class);
        op_nueva_partida.setClassName("boton");
        op_ranking = new RouterLink("Ranking", RankingView.class);
        op_ranking.setClassName("boton");
        op_reglas = new RouterLink("Reglas", ReglasView.class);
        op_reglas.setClassName("boton");
        op_salir = new RouterLink("Salir", InicioView.class);
        op_salir.setClassName("boton");
    }

}
