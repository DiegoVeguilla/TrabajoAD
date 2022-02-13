package com.example.application.views.inicio;

import com.example.application.views.iniciarsesion.IniciarSesionView;
import com.example.application.views.registrarusuario.RegistrarUsuarioView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

@PWA(name = "My App", shortName = "My App", enableInstallPrompt = false)
@Theme(themeFolder = "myapp")
@PageTitle("Inicio")
@Route(value = "inicio")
@RouteAlias(value = "")
public class InicioView extends VerticalLayout {

    private RouterLink btnIniciarSesion, btnRegistrarse;

    public InicioView() {
        instancias();
        addClassName("backgroundInicio");
        setSpacing(true);
        setSizeFull();
    }

    private void instancias() {
        btnIniciarSesion = new RouterLink("Iniciar Sesion", IniciarSesionView.class);
        btnRegistrarse = new RouterLink("Registrarse", RegistrarUsuarioView.class);
        btnRegistrarse.setClassName("boton");
        btnIniciarSesion.setClassName("boton");
        add(btnRegistrarse);
        add(btnIniciarSesion);
    }

    public RouterLink getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(RouterLink btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public RouterLink getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(RouterLink btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }
}
