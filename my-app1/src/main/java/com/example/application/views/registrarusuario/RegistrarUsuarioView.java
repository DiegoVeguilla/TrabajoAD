package com.example.application.views.registrarusuario;

import com.example.application.clases.MongoDB;
import com.example.application.views.inicio.InicioView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.*;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("RegistrarUsuario")
@Route(value = "registrar")
public class RegistrarUsuarioView extends VerticalLayout {

    String textEdad, textUsu, textCorreo, textoPais, textContra, textContraconfir, textNumero, genero;
    private PasswordField textContrasenia;
    private PasswordField textContraseniaConfirmar;
    private TextField textUsuario, textPais, textGenero;
    private EmailField email;
    private NumberField number;
    private IntegerField edad;
    private Button btnLogin;
    private MongoDB mongoDB;

    public RegistrarUsuarioView() {

        instancias();
        diseño();
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
                textEdad = String.valueOf(edad.getValue());
                textUsu = textUsuario.getValue();
                textContra = textContrasenia.getValue();
                textContraconfir = textContraseniaConfirmar.getValue();
                textCorreo = email.getValue();
                textNumero = String.valueOf(number.getValue());
                textoPais = textPais.getValue();
                genero = textGenero.getValue();
                if (!textUsu.equals("")) {
                    if (!textEdad.equals("null")) {
                        if (!textContra.equals("") && textContra.equals(textContraconfir)) {
                            if (!textCorreo.equals("")) {
                                if (!textoPais.equals("")) {
                                    if (!textNumero.equals("null")) {

                                        ComponentUtil.setData(UI.getCurrent(), "usuario", textUsu);
                                        ComponentUtil.setData(UI.getCurrent(), "genero", genero);

                                        ComponentUtil.setData(UI.getCurrent(), "edad", textEdad);
                                        ComponentUtil.setData(UI.getCurrent(), "contrasenia", textContra);

                                        ComponentUtil.setData(UI.getCurrent(), "email", textCorreo);
                                        ComponentUtil.setData(UI.getCurrent(), "pais", textoPais);
                                        ComponentUtil.setData(UI.getCurrent(), "numero", textNumero);

                                        if (!mongoDB.existeUsuario(textUsu)) {

                                            mongoDB.crearUsuario(textUsu, textCorreo, textContra, genero, textoPais, textEdad, textNumero);

                                            Notification notification = Notification.show("Usuario Creado Correctamente!");
                                            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
                                            getUI().ifPresent(ui -> ui.navigate(InicioView.class));

                                        } else {
                                            Notification notification = Notification.show("Ya existe un usuario con ese nombre");
                                            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                                        }
                                    } else {
                                        Notification notification = Notification.show("Introduce Numero de telelefono");
                                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                                    }
                                } else {
                                    Notification notification = Notification.show("Introduce Pais");
                                    notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                                }
                            } else {
                                Notification notification = Notification.show("Introduce E-mail");
                                notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                            }
                        } else {
                            Notification notification = Notification.show("Introduce Contraseña");
                            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                        }
                    } else {
                        Notification notification = Notification.show("Introduce Edad");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    Notification notification = Notification.show("Introduce Nombre de usuario");
                    notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                }
            }
        });
    }

    private void diseño() {
        add(textUsuario);
        add(edad);
        add(textGenero);
        add(textContrasenia);
        add(textContraseniaConfirmar);
        add(email);
        add(textPais);
        add(number);
        add(btnLogin);
    }

    private void instancias() {
        edad = new IntegerField();
        edad.setLabel("Edad");
        edad.setHelperText("entre 0 y 99 años");
        edad.setMin(0);
        edad.setMax(99);
        edad.setHasControls(true);
        edad.setWidth("190px");

        email = new EmailField();
        email.setLabel("Direccion E-mail");
        email.getElement().setAttribute("name", "email");
        email.setErrorMessage("Por favor introduce un email válido");
        email.setClearButtonVisible(true);
        textUsuario = new TextField();
        textUsuario.setLabel("Usuario");
        textContrasenia = new PasswordField();
        textContrasenia.setLabel("Contraseña");
        textContraseniaConfirmar = new PasswordField();
        textContraseniaConfirmar.setLabel("Confirmar contraseña");
        btnLogin = new Button("Registrarse");

        number = new NumberField();
        number.setLabel("Numero telefono");
        number.setWidth("190px");

        textPais = new TextField();
        textPais.setLabel("Pais");

        textGenero = new TextField();
        textGenero.setLabel("Genero");

        mongoDB = new MongoDB();
    }

}
