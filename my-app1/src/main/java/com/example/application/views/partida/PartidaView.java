package com.example.application.views.partida;

import com.example.application.clases.*;
import com.example.application.views.inicio.InicioView;
import com.example.application.views.menu.MenuView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.progressbar.ProgressBarVariant;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Partida")
@Route(value = "partida")
public class PartidaView extends VerticalLayout {

    private Button btnAtaqueE1, btnDefensaE1, btnAtaqueE2, btnDefensaE2, btnLuchar;

    private Personaje elegidoUnoE1, elegidoDosE1, elegidoTresE1, elegidoUnoE2, elegidoDosE2, elegidoTresE2, seleccionadoE1, seleccionadoE2;

    private Escenario escenario;

    private IntegerField incrementarE1, incrementarE2;

    private Jugador jugador1, jugador2;

    private ProgressBar vida, energia, vida2, energia2;

    private Image img1E1, img2E1, img3E1, seleccionado1, imgEscenario;

    private Image img1E2, img2E2, img3E2, seleccionado2;

    private HorizontalLayout meQuieroMorir, ataqueDefensa1, ataqueDefensa2;

    private VerticalLayout verticalJugadoresElegidosE1, verticalJugadoresElegidosE2, verticalEmpezar, verticalElegido1, verticalElegido2;

    private Div progressBarLabel1, progressBarLabel2, progressBarLabel1E2, progressBarLabel2E2;

    private int nMovimientos1, nMovimientos2, tipo1, tipo2;

    private Movimiento movimientoJ1, movimientoJ2;

    public PartidaView() {
        setClassName("backgroundEscenarios");

        instancias();
        disenio();
        setSpacing(false);
        acciones();

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

    private void acciones() {
        img1E1.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
            @Override
            public void onComponentEvent(ClickEvent<Image> event) {
                comprobarPersonajesE1();
                if (jugador1.getEquipo().estamosVivos()) {
                    if (elegidoUnoE1.getEnergiaVital() > 0) {
                        seleccionadoE1 = elegidoUnoE1;
                        setSeleccionado1();
                        setDatosJ1();
                    } else {
                        Notification notification = Notification.show("Personaje sin energía vital");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    partidaTerminada();
                }
            }
        });
        img2E1.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
            @Override
            public void onComponentEvent(ClickEvent<Image> event) {
                if (jugador1.getEquipo().estamosVivos()) {
                    if (elegidoDosE1.getEnergiaVital() > 0) {
                        seleccionadoE1 = elegidoDosE1;
                        setSeleccionado1();
                        setDatosJ1();
                    } else {
                        Notification notification = Notification.show("Personaje sin energía vital");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    partidaTerminada();
                }
            }
        });
        img3E1.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
            @Override
            public void onComponentEvent(ClickEvent<Image> event) {
                if (jugador1.getEquipo().estamosVivos()) {
                    if (elegidoTresE1.getEnergiaVital() > 0) {
                        seleccionadoE1 = elegidoTresE1;
                        setSeleccionado1();
                        setDatosJ1();
                    } else {
                        Notification notification = Notification.show("Personaje sin energía vital");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    partidaTerminada();
                }
            }
        });
        img1E2.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
            @Override
            public void onComponentEvent(ClickEvent<Image> event) {
                if (jugador2.getEquipo().estamosVivos()) {
                    if (elegidoUnoE2.getEnergiaVital() > 0) {
                        seleccionadoE2 = elegidoUnoE2;
                        setSeleccionado2();
                        setDatosJ2();
                    } else {
                        Notification notification = Notification.show("Personaje sin energía vital");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    partidaTerminada();
                }
            }
        });
        img2E2.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
            @Override
            public void onComponentEvent(ClickEvent<Image> event) {
                if (jugador2.getEquipo().estamosVivos()) {
                    if (elegidoDosE2.getEnergiaVital() > 0) {
                        seleccionadoE2 = elegidoDosE2;
                        setSeleccionado2();
                        setDatosJ2();
                    } else {
                        Notification notification = Notification.show("Personaje sin energía vital");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    partidaTerminada();
                }
            }
        });
        img3E2.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
            @Override
            public void onComponentEvent(ClickEvent<Image> event) {
                if (jugador2.getEquipo().estamosVivos()) {
                    if (elegidoTresE2.getEnergiaVital() > 0) {
                        seleccionadoE2 = elegidoTresE2;
                        setSeleccionado2();
                        setDatosJ2();
                    } else {
                        Notification notification = Notification.show("Personaje sin energía vital");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                    }
                } else {
                    partidaTerminada();
                }
            }
        });

        btnAtaqueE1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> buttonClickEvent) {
                nMovimientos1 = incrementarE1.getValue();
                movimientoJ1 = new Movimiento(1, nMovimientos1, seleccionadoE1);
                movimientoJ1.setTipo(1);
            }
        });
        btnAtaqueE2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> buttonClickEvent) {
                nMovimientos2 = incrementarE2.getValue();
                movimientoJ2 = new Movimiento(1, nMovimientos1, seleccionadoE1);
                movimientoJ2.setTipo(1);
            }
        });
        btnDefensaE1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> buttonClickEvent) {
                nMovimientos1 = incrementarE1.getValue();
                movimientoJ1 = new Movimiento(0, nMovimientos1, seleccionadoE1);
                movimientoJ1.setTipo(0);
            }
        });
        btnDefensaE2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> buttonClickEvent) {
                nMovimientos2 = incrementarE2.getValue();
                movimientoJ2 = new Movimiento(0, nMovimientos1, seleccionadoE1);
                movimientoJ2.setTipo(0);
            }
        });
        btnLuchar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> buttonClickEvent) {
                if ((jugador1.getEquipo().tenemosMovimientos() && jugador2.getEquipo().tenemosMovimientos())) {
                    if ((jugador1.getEquipo().estamosVivos()) && jugador2.getEquipo().estamosVivos()) {
                        if (seleccionadoE1.getEnergiaVital()<1 || seleccionadoE2.getEnergiaVital()<1){
                            Notification notification = Notification.show("ALGUN PERSONAJE ESTA MUERTO");
                            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                        }else{
                            seleccionadoE1.setNumMovimientos(seleccionadoE1.getNumMovimientos() - nMovimientos1);
                            seleccionadoE2.setNumMovimientos(seleccionadoE2.getNumMovimientos() - nMovimientos2);

                            System.out.println(movimientoJ1.getTipo());
                            System.out.println(movimientoJ2.getTipo());

                            if (movimientoJ1.getTipo() == 1 && movimientoJ2.getTipo() == 1) {

                                System.out.println("ataque - ataque");

                                seleccionadoE1.setEnergiaVital(seleccionadoE1.getEnergiaVital() - movimientoJ2.getEnergiaReal());
                                seleccionadoE2.setEnergiaVital(seleccionadoE2.getEnergiaVital() - movimientoJ1.getEnergiaReal());

                            } else if (movimientoJ1.getTipo() == 1 && movimientoJ2.getTipo() == 0) {

                                System.out.println("ataque - defensa");

                                seleccionadoE2.setEnergiaVital(seleccionadoE2.getEnergiaVital() - (movimientoJ1.getEnergiaReal() - movimientoJ2.getEnergiaReal()));

                            } else if (movimientoJ1.getTipo() == 0 && movimientoJ2.getTipo() == 1) {

                                System.out.println("defensa - ataque");

                                seleccionadoE1.setEnergiaVital(seleccionadoE1.getEnergiaVital() - (movimientoJ2.getEnergiaReal() - movimientoJ1.getEnergiaReal()));

                            }
                            System.out.println(seleccionadoE1.getEnergiaVital());
                            System.out.println(seleccionadoE2.getEnergiaVital());
                            setDatosJ1();
                            setDatosJ2();
                            System.out.println("Hola");
                            comprobarPersonajesE1();
                            comprobarPersonajesE2();
                            System.out.println("Adios");
                        }
                    } else {
                        partidaTerminada();
                    }
                } else {
                    partidaTerminada();
                }
            }
        });
    }

    private void setDatosJ1() {

        if (seleccionadoE1.getEnergiaVital() > 75) {
            vida.setValue(1);
        } else if (seleccionadoE1.getEnergiaVital() < 75 && seleccionadoE1.getEnergiaVital() > 50) {
            vida.setValue(0.75);
        } else if (seleccionadoE1.getEnergiaVital() < 50 && seleccionadoE1.getEnergiaVital() > 25) {
            vida.setValue(0.50);
        } else if (seleccionadoE1.getEnergiaVital() < 25 && seleccionadoE1.getEnergiaVital() > 1) {
            vida.setValue(0.25);
        } else if (seleccionadoE1.getEnergiaVital() > 1) {
            vida.setValue(0);
            seleccionadoE1.setVivo(false);
        }
        if (seleccionadoE1.getEnergiaVital() > 15) {
            energia.setValue(1);
        } else if (seleccionadoE1.getEnergiaVital() < 15 && seleccionadoE1.getEnergiaVital() > 10) {
            energia.setValue(0.75);
        } else if (seleccionadoE1.getEnergiaVital() < 10 && seleccionadoE1.getEnergiaVital() > 5) {
            energia.setValue(0.50);
        } else if (seleccionadoE1.getEnergiaVital() < 5 && seleccionadoE1.getEnergiaVital() > 1) {
            energia.setValue(0.25);
        } else if (seleccionadoE1.getEnergiaVital() > 1) {
            energia.setValue(0);
        }

        incrementarE1.setMax(seleccionadoE1.getNumMovimientos());
        if (seleccionadoE1.getEnergiaVital() == 0) {
            incrementarE1.setValue(0);
        }
        incrementarE1.setValue(1);
    }

    private void setDatosJ2() {
        if (seleccionadoE2.getEnergiaVital() > 75) {
            vida2.setValue(1);
        } else if (seleccionadoE2.getEnergiaVital() < 75 && seleccionadoE2.getEnergiaVital() > 50) {
            vida2.setValue(0.75);
        } else if (seleccionadoE2.getEnergiaVital() < 50 && seleccionadoE2.getEnergiaVital() > 25) {
            vida2.setValue(0.50);
        } else if (seleccionadoE2.getEnergiaVital() < 25 && seleccionadoE2.getEnergiaVital() > 1) {
            vida2.setValue(0.25);
        } else if (seleccionadoE2.getEnergiaVital() < 1) {
            vida2.setValue(0);
            seleccionadoE2.setVivo(false);
        }
        if (seleccionadoE2.getEnergiaVital() > 15) {
            energia2.setValue(1);
        } else if (seleccionadoE2.getEnergiaVital() < 15 && seleccionadoE2.getEnergiaVital() > 10) {
            energia2.setValue(0.75);
        } else if (seleccionadoE2.getEnergiaVital() < 10 && seleccionadoE2.getEnergiaVital() > 5) {
            energia2.setValue(0.50);
        } else if (seleccionadoE2.getEnergiaVital() < 5 && seleccionadoE2.getEnergiaVital() > 1) {
            energia2.setValue(0.25);
        } else if (seleccionadoE2.getEnergiaVital() < 1) {
            energia2.setValue(0);
        }

        incrementarE2.setMax(seleccionadoE2.getNumMovimientos());
        if (seleccionadoE1.getEnergiaVital() == 0) {
            incrementarE2.setValue(0);
        } else {
            incrementarE2.setValue(1);
        }
    }

    private void partidaTerminada() {
        System.out.println("partida terminada");
        Partida partidaFinalizada = null;
        MongoDB mongo = new MongoDB();
        boolean empate = false;
        mongo.guardarPartida(jugador1, jugador2, jugador1.getEquipo(), jugador2.getEquipo(), escenario, empate);
        getUI().ifPresent(ui -> ui.navigate(MenuView.class));
        /*Notification notification = Notification.show("Partida terminada, enhorabuena "+partidaFinalizada.getGanador().getUsuario());
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);*/

        /*if (elegidoUnoE1.getEnergiaVital()<1 || elegidoDosE1.getEnergiaVital()<1 || elegidoTresE1.getEnergiaVital()<1){

             notification = Notification.show("Partida terminada, enhorabuena "+partidaFinalizada.getGanador().getUsuario());
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            notification.setPosition(Notification.Position.MIDDLE);

            partidaFinalizada = new Partida(jugador2, jugador1, jugador2.getEquipo(), jugador1.getEquipo(), escenario, false);

        }else if (elegidoUnoE2.getEnergiaVital()<1 || elegidoDosE2.getEnergiaVital()<1 || elegidoTresE2.getEnergiaVital()<1){

             notification = Notification.show("Partida terminada, enhorabuena "+partidaFinalizada.getGanador().getUsuario());
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            notification.setPosition(Notification.Position.MIDDLE);

            partidaFinalizada = new Partida(jugador1, jugador2, jugador1.getEquipo(), jugador2.getEquipo(), escenario, false);


        } else if (elegidoUnoE1.getNumMovimientos()<1 || elegidoDosE1.getNumMovimientos()<1 || elegidoTresE1.getNumMovimientos()<1){

             notification = Notification.show("Partida terminada, enhorabuena "+partidaFinalizada.getGanador().getUsuario());
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            notification.setPosition(Notification.Position.MIDDLE);

            partidaFinalizada = new Partida(jugador2, jugador1, jugador2.getEquipo(), jugador1.getEquipo(), escenario, false);

        }else if (elegidoUnoE2.getNumMovimientos()<1 || elegidoDosE2.getNumMovimientos()<1 || elegidoTresE2.getNumMovimientos()<1){

             notification = Notification.show("Partida terminada, enhorabuena "+partidaFinalizada.getGanador().getUsuario());
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            notification.setPosition(Notification.Position.MIDDLE);

            partidaFinalizada = new Partida(jugador1, jugador2, jugador1.getEquipo(), jugador2.getEquipo(), escenario, false);

        } else{

             notification = Notification.show("Habeis quedado empate..... INUTILES");
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            notification.setPosition(Notification.Position.MIDDLE);

            partidaFinalizada = new Partida(jugador1, jugador2, jugador1.getEquipo(), jugador2.getEquipo(), escenario, true);

        }
        ComponentUtil.setData(UI.getCurrent(), "PartidaFinalizada", partidaFinalizada);
        System.out.println("PARTIDA TERMINADA");

         notification = Notification.show("Partida terminada, enhorabuena "+partidaFinalizada.getGanador().getUsuario());
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        notification.setPosition(Notification.Position.MIDDLE);
        getUI().ifPresent(ui -> ui.navigate(MenuView.class));*/
    }

    private void setSeleccionado1() {
        seleccionado1.setSrc(seleccionadoE1.getUrl());
    }

    private void setSeleccionado2() {
        seleccionado2.setSrc(seleccionadoE2.getUrl());
    }

    private void comprobarPersonajesE1() {
        if (elegidoUnoE1.getEnergiaVital() < 1 || elegidoUnoE1.getNumMovimientos() < 1) {
            elegidoUnoE1.setUrl("https://github.com/Valero004/resources/blob/main/a1c1015dd07177e6bdcda50913126716.png?raw=true");
            img1E1.setSrc(elegidoUnoE1.getUrl());
            setSeleccionado1();
            elegidoUnoE1.setVivo(false);
        }
        if (elegidoDosE1.getEnergiaVital() < 1 || elegidoDosE1.getNumMovimientos() < 1) {
            elegidoDosE1.setUrl("https://github.com/Valero004/resources/blob/main/a1c1015dd07177e6bdcda50913126716.png?raw=true");
            img2E1.setSrc(elegidoDosE1.getUrl());
            setSeleccionado1();
            elegidoDosE1.setVivo(false);
        }
        if (elegidoTresE1.getEnergiaVital() < 1 || elegidoTresE1.getNumMovimientos() < 1) {
            elegidoTresE1.setUrl("https://github.com/Valero004/resources/blob/main/a1c1015dd07177e6bdcda50913126716.png?raw=true");
            img3E1.setSrc(elegidoTresE1.getUrl());
            setSeleccionado1();
            elegidoTresE1.setVivo(false);
        }
    }

    private void comprobarPersonajesE2() {
        if (elegidoUnoE2.getEnergiaVital() < 1 || elegidoUnoE2.getNumMovimientos() < 1) {
            elegidoUnoE2.setUrl("https://github.com/Valero004/resources/blob/main/a1c1015dd07177e6bdcda50913126716.png?raw=true");
            img1E2.setSrc(elegidoUnoE2.getUrl());
            setSeleccionado2();
            elegidoUnoE2.setVivo(false);
        }
        if (elegidoDosE2.getEnergiaVital() < 1 || elegidoDosE2.getNumMovimientos() < 1) {
            elegidoDosE2.setUrl("https://github.com/Valero004/resources/blob/main/a1c1015dd07177e6bdcda50913126716.png?raw=true");
            img2E2.setSrc(elegidoDosE2.getUrl());
            setSeleccionado2();
            elegidoDosE2.setVivo(false);
        }
        if (elegidoTresE2.getEnergiaVital() < 1 || elegidoTresE2.getNumMovimientos() < 1) {
            elegidoTresE2.setUrl("https://github.com/Valero004/resources/blob/main/a1c1015dd07177e6bdcda50913126716.png?raw=true");
            img3E2.setSrc(elegidoTresE2.getUrl());
            setSeleccionado2();
            elegidoTresE2.setVivo(false);
        }
    }

    private void disenio() {
        verticalJugadoresElegidosE2.add(img1E2, img2E2, img3E2);
        verticalJugadoresElegidosE1.add(img1E1, img2E1, img3E1);
        ataqueDefensa1.add(btnAtaqueE1, btnDefensaE1);
        ataqueDefensa2.add(btnDefensaE2, btnAtaqueE2);
        verticalElegido1.add(progressBarLabel1, vida, progressBarLabel2, energia, seleccionado1, incrementarE1, ataqueDefensa1);
        verticalElegido1.getStyle().set("margin-top", "55px");
        verticalElegido2.add(progressBarLabel1E2, vida2, progressBarLabel2E2, energia2, seleccionado2, incrementarE2, ataqueDefensa2);
        verticalElegido2.getStyle().set("margin-top", "55px");

        verticalElegido2.getStyle().set("margin-left", "950px");

        meQuieroMorir.add(verticalJugadoresElegidosE1, verticalElegido1, verticalElegido2, verticalJugadoresElegidosE2);

        verticalEmpezar.add(meQuieroMorir);
        add(imgEscenario);
        add(verticalEmpezar);
        add(btnLuchar);
    }

    private void instancias() {

        btnLuchar = new Button("LUCHAR");
        btnLuchar.setClassName("btnAtqDfn");

        btnAtaqueE1 = new Button("Atacar");
        btnAtaqueE1.setClassName("btnAtqDfn");

        btnDefensaE1 = new Button("Defender");
        btnDefensaE1.setClassName("btnAtqDfn");

        btnAtaqueE2 = new Button("Atacar");
        btnAtaqueE2.setClassName("btnAtqDfn");

        btnDefensaE2 = new Button("Defender");
        btnDefensaE2.setClassName("btnAtqDfn");

        Partida partida = (Partida) ComponentUtil.getData(UI.getCurrent(), "Partida");
        jugador1 = partida.getJugador1();
        jugador2 = partida.getJugador2();
        escenario = partida.getEscenario();

        elegidoUnoE1 = jugador1.getEquipo().getMiembrosEquipo().get(0);
        elegidoDosE1 = jugador1.getEquipo().getMiembrosEquipo().get(1);
        elegidoTresE1 = jugador1.getEquipo().getMiembrosEquipo().get(2);

        elegidoUnoE2 = jugador2.getEquipo().getMiembrosEquipo().get(0);
        elegidoDosE2 = jugador2.getEquipo().getMiembrosEquipo().get(1);
        elegidoTresE2 = jugador2.getEquipo().getMiembrosEquipo().get(2);

        imgEscenario = new Image();

        imgEscenario.setSrc(escenario.getUrl());
        imgEscenario.setClassName("escenarios6");

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

        seleccionado1 = new Image();
        seleccionadoE1 = elegidoDosE1;
        seleccionado1.setSrc(seleccionadoE1.getUrl());
        seleccionado1.setClassName("personajeSeleccionado");

        seleccionado2 = new Image();
        seleccionadoE2 = elegidoDosE2;
        seleccionado2.setSrc(seleccionadoE2.getUrl());
        seleccionado2.setClassName("personajeSeleccionado");

        verticalEmpezar = new VerticalLayout();
        verticalJugadoresElegidosE1 = new VerticalLayout();
        verticalJugadoresElegidosE2 = new VerticalLayout();

        vida = new ProgressBar();
        energia = new ProgressBar();
        vida.addThemeVariants(ProgressBarVariant.LUMO_SUCCESS);
        energia.addThemeVariants(ProgressBarVariant.LUMO_ERROR);
        vida.setValue(1);
        energia.setValue(1);

        progressBarLabel1 = new Div();
        progressBarLabel1.setClassName("btnAtqDfn");

        progressBarLabel2 = new Div();
        progressBarLabel2.setClassName("btnAtqDfn");

        progressBarLabel1.setText("Vida");
        progressBarLabel2.setText("Energia");

        vida2 = new ProgressBar();
        energia2 = new ProgressBar();
        vida2.addThemeVariants(ProgressBarVariant.LUMO_SUCCESS);
        energia2.addThemeVariants(ProgressBarVariant.LUMO_ERROR);
        vida2.setValue(1);
        energia2.setValue(1);
        progressBarLabel1E2 = new Div();
        progressBarLabel2E2 = new Div();

        progressBarLabel1E2.setClassName("btnAtqDfn");
        progressBarLabel2E2.setClassName("btnAtqDfn");

        progressBarLabel1E2.setText("Vida");
        progressBarLabel2E2.setText("Energia");

        incrementarE1 = new IntegerField();
        incrementarE1.setMin(0);
        incrementarE1.setValue(1);
        incrementarE1.setMax(seleccionadoE1.getNumMovimientos());
        incrementarE1.setHasControls(true);
        incrementarE1.setClassName("btnAtqDfn");

        incrementarE2 = new IntegerField();
        incrementarE2.setMin(0);
        incrementarE2.setValue(1);
        incrementarE2.setMax(seleccionadoE1.getNumMovimientos());
        incrementarE2.setHasControls(true);
        incrementarE2.setClassName("btnAtqDfn");

        verticalElegido1 = new VerticalLayout();
        verticalElegido2 = new VerticalLayout();

        meQuieroMorir = new HorizontalLayout();

        ataqueDefensa1 = new HorizontalLayout();
        ataqueDefensa1.setClassName("botonAtaqueDefensa");
        ataqueDefensa2 = new HorizontalLayout();
        ataqueDefensa2.setClassName("botonAtaqueDefensa");
    }
}