package com.example.application.views.iniciarsesion;

import com.example.application.clases.Jugador;
import com.example.application.clases.MongoDB;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("IniciarSesion")
@Route(value = "iniciar")
public class IniciarSesionView extends VerticalLayout {

    private PasswordField textContrasenia;
    private TextField textUsuario;
    private Button btnLogin;
    private String textUsu, textContra;
    private MongoDB mongoDB;

    public IniciarSesionView() {
        instancias();
        disenio();
        acciones();

        setSpacing(false);
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    }

    private void acciones() {
        btnLogin.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                textUsu = textUsuario.getValue();
                textContra = textContrasenia.getValue();
                if (!textUsu.equals("")) {
                    if (!textContra.equals("")) {
                        if (mongoDB.buscarUsuario(textUsu, textContra) != null) {
                            Jugador jugador1 = mongoDB.buscarUsuario(textUsu, textContra);
                            ComponentUtil.setData(UI.getCurrent(), "jugadorUno", jugador1);
                            Notification notification = Notification.show("Sesión iniciada correctamente");
                            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
                            getUI().ifPresent(ui -> ui.navigate(IniciarSesionView2.class));
                        } else {
                            Notification notification = Notification.show("Usuario o contraseña incorrectos");
                            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                        }
                    } else {
                        Notification notification = Notification.show("Introduce Contraseña");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    Notification notification = Notification.show("Introduce Nombre de usuario");
                    notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                }
            }
        });
    }

    private void disenio() {
        add(textUsuario);
        add(textContrasenia);
        add(btnLogin);
    }

    private void instancias() {
        mongoDB = new MongoDB();
        textUsuario = new TextField();
        textUsuario.setLabel("Introduce Usuario 1");
        textContrasenia = new PasswordField();
        textContrasenia.setLabel("Introduce Contraseña");
        btnLogin = new Button();
        btnLogin.setText("Login");
    }

}
