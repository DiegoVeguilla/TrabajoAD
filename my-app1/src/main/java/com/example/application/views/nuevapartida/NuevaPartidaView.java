package com.example.application.views.nuevapartida;

import com.example.application.clases.MongoDB;
import com.example.application.clases.Personaje;
import com.example.application.views.resumen.ResumenView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Personajes")
@Route(value = "personajes")

public class NuevaPartidaView extends VerticalLayout {

    int i, e;

    private Button personaje1E1, personaje2E1, personaje3E1, personaje4E1, personaje5E1, personaje6E1, personaje7E1, personaje8E1,
            personaje9E1, personaje10E1, personaje11E1, personaje12E1, personaje13E1, personaje14E1, personaje15E1, personaje16E1, personaje17E1;
    private MongoDB mongoDB;
    private Button btnStart;

    private Button personaje1E2, personaje2E2, personaje3E2, personaje4E2, personaje5E2, personaje6E2, personaje7E2,
            personaje8E2, personaje9E2, personaje10E2, personaje11E2, personaje12E2, personaje13E2, personaje14E2,
            personaje15E2, personaje16E2, personaje17E2;

    private Image img1E1, img2E1, img3E1;

    private Image img1E2, img2E2, img3E2;

    private VerticalLayout verticalEquipoUno, verticalEquipoDos, verticalLayoutr;

    private HorizontalLayout horizontalEquipoUnoImg, horizontalBotones1E1, horizontalBotones5E1, horizontalBotones2E1,
            horizontalBotones3E1, horizontalBotones4E1, horizontalEquipoDosImg, horizontalBotones1E2, horizontalBotones5E2,
            horizontalBotones2E2, horizontalBotones3E2, horizontalBotones4E2, porProbar;

    private Personaje scarletWitch, ironMan, dominio, deadpool, capitanAmerica, blackWidow, magneto, wolverine,
            marvelGirl, storm, spiderman, hulk, captainMarvel, sheHulk, thor, hunterAngel, doctorStrange, elegido1E1, elegido2E1, elegido3E1, elegido1E2, elegido2E2, elegido3E2;

    public NuevaPartidaView() {

        setClassName("backgroundNuevaPartida");
        conexionMongo();
        vincularPersonajes();

        instancias();

        disenioEquipoUno();

        acciones();
        setSizeFull();
    }

    private void acciones() {


        personaje1E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5261a85a501fe.jpg");
                    elegido1E1 = doctorStrange;
                } else if (i == 2) {
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5261a85a501fe.jpg");
                    elegido2E1 = doctorStrange;
                } else if (i == 3) {
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5261a85a501fe.jpg");
                    elegido3E1 = doctorStrange;
                }


            }
        });
        personaje2E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b.jpg");
                    elegido1E1 = scarletWitch;
                } else if (i == 2) {
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b.jpg");
                    elegido2E1 = scarletWitch;
                } else if (i == 3) {
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b.jpg");
                    elegido3E1 = scarletWitch;
                }
            }
        });
        personaje3E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg");
                    elegido1E1 = ironMan;
                } else if (i == 2) {
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg");
                    elegido2E1 = ironMan;
                } else if (i == 3) {
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg");
                    elegido3E1 = ironMan;
                }
            }
        });
        personaje4E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/60/526031dc10516.jpg");
                    elegido1E1 = dominio;
                } else if (i == 2) {
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/60/526031dc10516.jpg");
                    elegido2E1 = dominio;
                } else if (i == 3) {
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/60/526031dc10516.jpg");
                    elegido3E1 = dominio;
                }
            }
        });
        personaje5E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99.jpg");
                    elegido1E1 = deadpool;
                } else if (i == 2) {
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99.jpg");
                    elegido2E1 = deadpool;
                } else if (i == 3) {
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99.jpg");
                    elegido3E1 = deadpool;
                }
            }
        });
        personaje6E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg");
                    elegido1E1 = capitanAmerica;
                } else if (i == 2) {
                    elegido2E1 = capitanAmerica;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg");
                } else if (i == 3) {
                    elegido3E1 = capitanAmerica;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg");
                }
            }
        });
        personaje7E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b.jpg");
                    elegido1E1 = blackWidow;
                } else if (i == 2) {
                    elegido2E1 = blackWidow;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b.jpg");
                } else if (i == 3) {
                    elegido3E1 = blackWidow;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b.jpg");
                }
            }
        });
        personaje8E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827.jpg");
                    elegido1E1 = magneto;
                } else if (i == 2) {
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827.jpg");
                    elegido2E1 = magneto;
                } else if (i == 3) {
                    elegido3E1 = magneto;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827.jpg");
                }
            }
        });
        personaje9E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg");
                    elegido1E1 = wolverine;
                } else if (i == 2) {
                    elegido2E1 = wolverine;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg");
                } else if (i == 3) {
                    elegido3E1 = wolverine;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg");
                }
            }
        });
        personaje10E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/d0/528d3412090b4.jpg");
                    elegido1E1 = marvelGirl;
                } else if (i == 2) {
                    elegido2E1 = marvelGirl;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/d0/528d3412090b4.jpg");
                } else if (i == 3) {
                    elegido3E1 = marvelGirl;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/d0/528d3412090b4.jpg");
                }
            }
        });
        personaje11E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    elegido1E1 = storm;
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg");
                } else if (i == 2) {
                    elegido2E1 = storm;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg");
                } else if (i == 3) {
                    elegido3E1 = storm;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg");
                }
            }
        });
        personaje12E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    elegido1E1 = spiderman;
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/03/5239b59f49020.jpg");
                } else if (i == 2) {
                    elegido2E1 = spiderman;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/03/5239b59f49020.jpg");
                } else if (i == 3) {
                    elegido3E1 = spiderman;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/03/5239b59f49020.jpg");
                }
            }
        });
        personaje13E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    elegido1E1 = hulk;
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0.jpg");
                } else if (i == 2) {
                    elegido2E1 = hulk;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0.jpg");
                } else if (i == 3) {
                    elegido3E1 = hulk;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0.jpg");
                }
            }
        });
        personaje14E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    elegido1E1 = captainMarvel;

                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a.jpg");
                } else if (i == 2) {
                    elegido2E1 = captainMarvel;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a.jpg");
                } else if (i == 3) {
                    elegido3E1 = captainMarvel;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a.jpg");
                }
            }
        });
        personaje15E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {

                    elegido1E1 = sheHulk;
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/8/d0/523214b8ea2cf.jpg");
                } else if (i == 2) {
                    elegido2E1 = sheHulk;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/8/d0/523214b8ea2cf.jpg");
                } else if (i == 3) {
                    elegido3E1 = sheHulk;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/8/d0/523214b8ea2cf.jpg");
                }
            }
        });
        personaje16E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {

                    elegido1E1 = thor;
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg");
                } else if (i == 2) {
                    elegido2E1 = thor;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg");
                } else if (i == 3) {
                    elegido3E1 = thor;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg");
                }
            }
        });
        personaje17E1.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                i++;
                if (i == 4) {
                    i = 1;
                }
                if (i == 1) {
                    elegido1E1 = hunterAngel;
                    img1E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/7/00/545a82f59dd73.jpg");
                } else if (i == 2) {
                    elegido2E1 = hunterAngel;
                    img2E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/7/00/545a82f59dd73.jpg");
                } else if (i == 3) {
                    elegido3E1 = hunterAngel;
                    img3E1.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/7/00/545a82f59dd73.jpg");
                }
            }
        });


        personaje1E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = doctorStrange;

                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5261a85a501fe.jpg");
                } else if (e == 2) {
                    elegido2E2 = doctorStrange;

                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5261a85a501fe.jpg");
                } else if (e == 3) {
                    elegido3E2 = doctorStrange;

                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/f0/5261a85a501fe.jpg");
                }
            }
        });
        personaje2E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = scarletWitch;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b.jpg");
                } else if (e == 2) {
                    elegido2E2 = scarletWitch;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b.jpg");
                } else if (e == 3) {
                    elegido3E2 = scarletWitch;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b.jpg");
                }
            }
        });
        personaje3E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = ironMan;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg");
                } else if (e == 2) {
                    elegido2E2 = ironMan;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg");
                } else if (e == 3) {
                    elegido3E2 = ironMan;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg");
                }
            }
        });
        personaje4E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = dominio;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/60/526031dc10516.jpg");
                } else if (e == 2) {
                    elegido2E2 = dominio;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/60/526031dc10516.jpg");
                } else if (e == 3) {
                    elegido3E2 = dominio;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/60/526031dc10516.jpg");
                }
            }
        });
        personaje5E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = deadpool;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99.jpg");
                } else if (e == 2) {
                    elegido2E2 = deadpool;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99.jpg");
                } else if (e == 3) {
                    elegido3E2 = deadpool;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99.jpg");
                }
            }
        });
        personaje6E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = capitanAmerica;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg");
                } else if (e == 2) {
                    elegido2E2 = capitanAmerica;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg");
                } else if (e == 3) {
                    elegido3E2 = capitanAmerica;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg");
                }
            }
        });
        personaje7E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = blackWidow;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b.jpg");
                } else if (e == 2) {
                    elegido2E2 = blackWidow;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b.jpg");
                } else if (e == 3) {
                    elegido3E2 = blackWidow;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b.jpg");
                }
            }
        });
        personaje8E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = magneto;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827.jpg");
                } else if (e == 2) {
                    elegido2E2 = magneto;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827.jpg");
                } else if (e == 3) {
                    elegido3E2 = magneto;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827.jpg");
                }
            }
        });
        personaje9E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = wolverine;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg");
                } else if (e == 2) {
                    elegido2E2 = wolverine;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg");
                } else if (e == 3) {
                    elegido3E2 = wolverine;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg");
                }
            }
        });
        personaje10E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = marvelGirl;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/d0/528d3412090b4.jpg");
                } else if (e == 2) {
                    elegido2E2 = marvelGirl;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/d0/528d3412090b4.jpg");
                } else if (e == 3) {
                    elegido3E2 = marvelGirl;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/f/d0/528d3412090b4.jpg");
                }
            }
        });
        personaje11E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = storm;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg");
                } else if (e == 2) {
                    elegido2E2 = storm;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg");
                } else if (e == 3) {
                    elegido3E2 = storm;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg");
                }
            }
        });
        personaje12E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = spiderman;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/03/5239b59f49020.jpg");
                } else if (e == 2) {
                    elegido2E2 = spiderman;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/03/5239b59f49020.jpg");
                } else if (e == 3) {
                    elegido3E2 = spiderman;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/9/03/5239b59f49020.jpg");
                }
            }
        });
        personaje13E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = hulk;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0.jpg");
                } else if (e == 2) {
                    elegido2E2 = hulk;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0.jpg");
                } else if (e == 3) {
                    elegido3E2 = hulk;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0.jpg");
                }
            }
        });
        personaje14E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = captainMarvel;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a.jpg");
                } else if (e == 2) {
                    elegido2E2 = captainMarvel;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a.jpg");
                } else if (e == 3) {
                    elegido3E2 = captainMarvel;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a.jpg");
                }
            }
        });
        personaje15E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = sheHulk;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/8/d0/523214b8ea2cf.jpg");
                } else if (e == 2) {
                    elegido2E2 = sheHulk;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/8/d0/523214b8ea2cf.jpg");
                } else if (e == 3) {
                    elegido3E2 = sheHulk;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/8/d0/523214b8ea2cf.jpg");
                }
            }
        });
        personaje16E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }
                if (e == 1) {
                    elegido1E2 = thor;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg");
                } else if (e == 2) {
                    elegido2E2 = thor;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg");
                } else if (e == 3) {
                    elegido3E2 = thor;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg");
                }
            }
        });
        personaje17E2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                e++;
                if (e == 4) {
                    e = 1;
                }

                if (e == 1) {
                    elegido1E2 = hunterAngel;
                    img1E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/7/00/545a82f59dd73.jpg");
                } else if (e == 2) {
                    elegido2E2 = hunterAngel;
                    img2E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/7/00/545a82f59dd73.jpg");
                } else if (e == 3) {
                    elegido3E2 = hunterAngel;
                    img3E2.setSrc("http://i.annihil.us/u/prod/marvel/i/mg/7/00/545a82f59dd73.jpg");
                }
            }
        });
        btnStart.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                if (elegido1E1 ==null || elegido2E1 == null  || elegido3E1 == null || elegido1E2 ==null || elegido2E2 == null  || elegido3E2 == null){

                    Notification notification = Notification.show("Elige 6 Personajes");
                    notification.addThemeVariants(NotificationVariant.LUMO_ERROR);

                }else {
                    if (elegido1E1 == elegido2E1 || elegido3E1 == elegido1E1 || elegido2E1 == elegido3E1 || elegido1E2 == elegido2E2 || elegido3E2 == elegido1E2 || elegido2E2 == elegido3E2){

                        Notification notification = Notification.show("No se pueden repetir jugadores");
                        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);

                    }else {
                        ComponentUtil.setData(UI.getCurrent(), "Personaje1E1", elegido1E1);

                        ComponentUtil.setData(UI.getCurrent(), "Personaje2E1", elegido2E1);
                        ComponentUtil.setData(UI.getCurrent(), "Personaje3E1", elegido3E1);

                        ComponentUtil.setData(UI.getCurrent(), "Personaje1E2", elegido1E2);
                        ComponentUtil.setData(UI.getCurrent(), "Personaje2E2", elegido2E2);
                        ComponentUtil.setData(UI.getCurrent(), "Personaje3E2", elegido3E2);

                        getUI().ifPresent(ui -> ui.navigate(ResumenView.class));


                    }


                }
            }
        });
    }

    private void vincularPersonajes() {
        doctorStrange = mongoDB.buscarPersonaje("01");
        scarletWitch = mongoDB.buscarPersonaje("02");
        ironMan = mongoDB.buscarPersonaje("03");
        dominio = mongoDB.buscarPersonaje("04");
        deadpool = mongoDB.buscarPersonaje("05");
        capitanAmerica = mongoDB.buscarPersonaje("06");
        blackWidow = mongoDB.buscarPersonaje("07");
        magneto = mongoDB.buscarPersonaje("08");
        wolverine = mongoDB.buscarPersonaje("09");
        marvelGirl = mongoDB.buscarPersonaje("10");
        storm = mongoDB.buscarPersonaje("11");
        spiderman = mongoDB.buscarPersonaje("12");
        hulk = mongoDB.buscarPersonaje("13");
        captainMarvel = mongoDB.buscarPersonaje("14");
        sheHulk = mongoDB.buscarPersonaje("15");
        thor = mongoDB.buscarPersonaje("16");
        hunterAngel = mongoDB.buscarPersonaje("17");
    }

    private void conexionMongo() {
        mongoDB = new MongoDB();
    }

    private void disenioEquipoUno() {

        horizontalEquipoUnoImg.add(img1E1, img2E1, img3E1);

        horizontalBotones1E1.add(personaje1E1, personaje2E1, personaje3E1, personaje4E1);
        horizontalBotones2E1.add(personaje5E1, personaje6E1, personaje7E1, personaje8E1);
        horizontalBotones3E1.add(personaje9E1, personaje10E1, personaje11E1, personaje12E1);
        horizontalBotones4E1.add(personaje13E1, personaje14E1, personaje15E1, personaje16E1);
        horizontalBotones5E1.add(personaje17E1);

        verticalEquipoUno.add(horizontalEquipoUnoImg);
        verticalEquipoUno.add(horizontalBotones1E1, horizontalBotones2E1, horizontalBotones3E1, horizontalBotones4E1, horizontalBotones5E1);

        add(verticalEquipoUno);

        horizontalEquipoDosImg.add(img3E2, img2E2, img1E2);
        horizontalEquipoDosImg.getStyle().set("margin-botton", "50px");
        horizontalBotones1E2.add(personaje1E2, personaje2E2, personaje3E2, personaje4E2);
        horizontalBotones2E2.add(personaje5E2, personaje6E2, personaje7E2, personaje8E2);
        horizontalBotones3E2.add(personaje9E2, personaje10E2, personaje11E2, personaje12E2);
        horizontalBotones4E2.add(personaje13E2, personaje14E2, personaje15E2, personaje16E2);
        horizontalBotones5E2.add(personaje17E2);

        verticalEquipoDos.add(horizontalEquipoDosImg);
        verticalEquipoDos.add(horizontalBotones1E2, horizontalBotones2E2, horizontalBotones3E2, horizontalBotones4E2, horizontalBotones5E2);

        add(verticalEquipoDos);
        verticalEquipoDos.getStyle().set("margin-left", "500px");
        btnStart.getStyle().set("margin-left", "440px");
        btnStart.getStyle().set("text-align", "center");
        btnStart.setClassName("boton");
        verticalLayoutr.add(btnStart);

        porProbar.add(verticalEquipoUno, verticalLayoutr, verticalEquipoDos);

        porProbar.getStyle().set("margin-top", "100px");
        add(porProbar);
    }

    private void aniadirEuipo2() {
        add(personaje1E2);
        add(personaje2E2);
        add(personaje3E2);
        add(personaje4E2);
        add(personaje5E2);
        add(personaje6E2);
        add(personaje7E2);
        add(personaje8E2);
        add(personaje9E2);
        add(personaje10E2);
        add(personaje11E2);
        add(personaje12E2);
        add(personaje13E2);
        add(personaje14E2);
        add(personaje15E2);
        add(personaje16E2);
        add(personaje17E2);
        add(img1E2);
        add(img2E2);
        add(img3E2);
    }

    private void aniadirEuipo1() {
        add(personaje1E1);
        add(personaje2E1);
        add(personaje3E1);
        add(personaje4E1);
        add(personaje5E1);
        add(personaje6E1);
        add(personaje7E1);
        add(personaje8E1);
        add(personaje9E1);
        add(personaje10E1);
        add(personaje11E1);
        add(personaje12E1);
        add(personaje13E1);
        add(personaje14E1);
        add(personaje15E1);
        add(personaje16E1);
        add(personaje17E1);
        add(img1E1);
        add(img2E1);
        add(img3E1);
    }

    private void instancias() {

        personaje1E1 = new Button();
        personaje1E1.setClassName("btnP1");

        personaje2E1 = new Button();
        personaje2E1.setClassName("btnP2");

        personaje3E1 = new Button();
        personaje3E1.setClassName("btnP3");

        personaje4E1 = new Button();
        personaje4E1.setClassName("btnP4");

        personaje5E1 = new Button();
        personaje5E1.setClassName("btnP5");

        personaje6E1 = new Button();
        personaje6E1.setClassName("btnP6");

        personaje7E1 = new Button();
        personaje7E1.setClassName("btnP7");

        personaje8E1 = new Button();
        personaje8E1.setClassName("btnP8");

        personaje9E1 = new Button();
        personaje9E1.setClassName("btnP9");

        personaje10E1 = new Button();
        personaje10E1.setClassName("btnP10");

        personaje11E1 = new Button();
        personaje11E1.setClassName("btnP11");

        personaje12E1 = new Button();
        personaje12E1.setClassName("btnP12");

        personaje13E1 = new Button();
        personaje13E1.setClassName("btnP13");

        personaje14E1 = new Button();
        personaje14E1.setClassName("btnP14");

        personaje15E1 = new Button();
        personaje15E1.setClassName("btnP15");

        personaje16E1 = new Button();
        personaje16E1.setClassName("btnP16");

        personaje17E1 = new Button();
        personaje17E1.setClassName("btnP17");


        img1E1 = new Image();
        img1E1.setClassName("image");
        img2E1 = new Image();
        img2E1.setClassName("image");
        img3E1 = new Image();
        img3E1.setClassName("image");


        personaje1E2 = new Button();
        personaje1E2.setClassName("btnP1");

        personaje2E2 = new Button();
        personaje2E2.setClassName("btnP2");

        personaje3E2 = new Button();
        personaje3E2.setClassName("btnP3");

        personaje4E2 = new Button();
        personaje4E2.setClassName("btnP4");

        personaje5E2 = new Button();
        personaje5E2.setClassName("btnP5");

        personaje6E2 = new Button();
        personaje6E2.setClassName("btnP6");

        personaje7E2 = new Button();
        personaje7E2.setClassName("btnP7");

        personaje8E2 = new Button();
        personaje8E2.setClassName("btnP8");

        personaje9E2 = new Button();
        personaje9E2.setClassName("btnP9");

        personaje10E2 = new Button();
        personaje10E2.setClassName("btnP10");

        personaje11E2 = new Button();
        personaje11E2.setClassName("btnP11");

        personaje12E2 = new Button();
        personaje12E2.setClassName("btnP12");

        personaje13E2 = new Button();
        personaje13E2.setClassName("btnP13");

        personaje14E2 = new Button();
        personaje14E2.setClassName("btnP14");

        personaje15E2 = new Button();
        personaje15E2.setClassName("btnP15");

        personaje16E2 = new Button();
        personaje16E2.setClassName("btnP16");

        personaje17E2 = new Button();
        personaje17E2.setClassName("btnP17");


        img1E2 = new Image();
        img1E2.setClassName("image");
        img2E2 = new Image();
        img2E2.setClassName("image");
        img3E2 = new Image();
        img3E2.setClassName("image");

        verticalEquipoUno = new VerticalLayout();
        verticalEquipoDos = new VerticalLayout();

        horizontalEquipoDosImg = new HorizontalLayout();
        horizontalEquipoUnoImg = new HorizontalLayout();

        horizontalBotones1E1 = new HorizontalLayout();
        horizontalBotones2E1 = new HorizontalLayout();
        horizontalBotones3E1 = new HorizontalLayout();
        horizontalBotones4E1 = new HorizontalLayout();
        horizontalBotones5E1 = new HorizontalLayout();

        horizontalBotones1E2 = new HorizontalLayout();
        horizontalBotones2E2 = new HorizontalLayout();
        horizontalBotones3E2 = new HorizontalLayout();
        horizontalBotones4E2 = new HorizontalLayout();
        horizontalBotones5E2 = new HorizontalLayout();

        porProbar = new HorizontalLayout();

        verticalLayoutr = new VerticalLayout();

        btnStart = new Button("LISTO");
    }

}
