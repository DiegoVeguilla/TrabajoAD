package com.example.application.views.Informacion;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@PageTitle("Informacion")
@Route(value = "informacion")
public class InformacionView extends VerticalLayout {


    String informacion;
    Label txtInformacion;
    public InformacionView() {

        escribirTxt();
        setSpacing(false);



        add(txtInformacion);


        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

    private void escribirTxt() {
        System.out.println("* REGLAS DEL JUEGO *");
        File f = new File("src/main/resources/META-INF/resources/textoInformacion");
        informacion="";
        if (f.exists()&& f.canRead()){
            try {
                FileReader fr = new FileReader(f);
                int nChar = 0;
                while ((nChar = fr.read()) != -1){

                    informacion += (char)(nChar);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                System.out.println(informacion);
            }
            txtInformacion = new Label(informacion);

            txtInformacion.setMaxWidth("400px");
            txtInformacion.setMinWidth("400px");

        }else{
            System.out.println("No se encuentra el fichero reglas o no tiene permisos");
        }

    }
}
