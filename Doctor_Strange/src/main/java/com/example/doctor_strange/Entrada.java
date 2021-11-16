package com.example.doctor_strange;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //ATRIBUTOS
        Scanner teclado = new Scanner(System.in);
        Jugador jActual, j1, j2;
        int opcion = 0;
        boolean seguir = true;
        //DESARROLLO
        //todo aqui iría el menu de iniciar y se crearia el usuario o iniciaria sesión
        //Como todabia no hemos creado el menú inicar sesion genero los usuarios por defecto
        Jugador jcreado1 = new Jugador("Patata", "Patata", "Avengers");
        Jugador jcreado2 = new Jugador("Tomate", "Tomate", "x-men");
        //**********************************************
        jActual = jcreado1;
        j1 = jcreado1;
        System.out.println("DOCTOR STRANGE (THE GAME)");
        System.out.println("*** *** MENÚ *** ***");
        System.out.println("\t 1. INICIAR PARTIDA");
        System.out.println("\t 2. CONSULTAR PERSONAJES");
        System.out.println("\t 3. REGLAS DEL JUEGO");
        System.out.println("\t 4. INFORMACIÓN");
        System.out.println("\t 5. RANKING");
        System.out.println("\t 6. GUARDADO EN BBDD");
        System.out.println();
        System.out.println("Usuario: " + jActual.getUsuario());
        System.out.println("*** *** *** *** *** ***");
        System.out.print("OPCIÓN: ");
        opcion = teclado.nextByte();
        System.out.println();
        switch (opcion){
            case 1://todo case 1
                opcion = 0;
                //todo menu seleccionar escenario
                System.out.println("BUSCANDO SEGUNDO JUGADOR...");//AQUI IRÍA EL MENU DE INICIO DE SESION PARA EL SEGUNDO JUGADOR
                jActual = jcreado2;
                j2 = jcreado2;
                //****************************************************************************************************************
                System.out.println("DOCTOR STRANGE (THE GAME)");
                System.out.println("*** *** MENÚ *** ***");
                System.out.println("\t 1. UNIRSE A PARTIDA");
                System.out.println("\t 2. CONSULTAR PERSONAJES");
                System.out.println("\t 3. REGLAS DEL JUEGO");
                System.out.println("\t 4. INFORMACIÓN");
                System.out.println("\t 5. RANKING");
                System.out.println("\t 6. GUARDADO EN BBDD");
                System.out.println();
                System.out.println("Usuario: " + jActual.getUsuario());
                System.out.println("*** *** *** *** *** ***");
                System.out.print("OPCIÓN: ");
                opcion = teclado.nextByte();
                System.out.println();
                switch (opcion){
                    case 1:
                        //Partida partida = new Partida(j1,j2,);
                        System.out.println("Apartado en desarrollo");
                        break;
                    case 2:
                        System.out.println("*** CONSULTAR PERSONAJES ***");
                        jActual.consultarPersonajes();
                        break;
                    case 3:
                        System.out.println("*** REGLAS DEL JUEGO ***");
                        File f = new File("src/main/java/com/example/doctor_strange/resources/Reglas.txt");
                        String reglas="";
                        if (f.exists()&& f.canRead()){
                            try {
                                FileReader fr = new FileReader(f);
                                int nChar = 0;
                                while ((nChar = fr.read()) != -1){
                                    reglas += (char)(nChar);
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }finally {
                                System.out.println(reglas);
                            }
                        }else{
                            System.out.println("No se encuentra el fichero reglas o no tiene permisos");
                        }
                        break;
                    case 4:
                        System.out.println("*** INFORMACIÓN ***");
                        File f1 = new File("src/main/java/com/example/doctor_strange/resources/Informacion.txt");
                        String info="";
                        if (f1.exists()&& f1.canRead()){
                            try {
                                FileReader fr = new FileReader(f1);
                                int nChar = 0;
                                while ((nChar = fr.read()) != -1){
                                    info += (char)(nChar);
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }finally {
                                System.out.println(info);
                            }
                        }else{
                            System.out.println("No se encuentra el fichero información o no tiene permisos");
                        }
                        break;
                    case 5:
                        System.out.println("*** RANKING ***");
                        System.out.println("Apartado en desarrollo");
                        break;
                    case 6:
                        System.out.println("*** CONEXIÓN A BBDD ***");
                        System.out.println("Apartado en desarrollo");
                        break;
                }
                break;
            case 2:
                System.out.println("*** CONSULTAR PERSONAJES ***");
                jActual.consultarPersonajes();
                break;
            case 3:
                System.out.println("*** REGLAS DEL JUEGO ***");
                File f = new File("src/main/java/com/example/doctor_strange/resources/Reglas.txt");
                String reglas="";
                if (f.exists()&& f.canRead()){
                    try {
                        FileReader fr = new FileReader(f);
                        int nChar = 0;
                        while ((nChar = fr.read()) != -1){
                            reglas += (char)(nChar);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        System.out.println(reglas);
                    }
                }else{
                    System.out.println("No se encuentra el fichero reglas o no tiene permisos");
                }
                break;
            case 4:
                System.out.println("*** INFORMACIÓN ***");
                File f1 = new File("src/main/java/com/example/doctor_strange/resources/Informacion.txt");
                String info="";
                if (f1.exists()&& f1.canRead()){
                    try {
                        FileReader fr = new FileReader(f1);
                        int nChar = 0;
                        while ((nChar = fr.read()) != -1){
                            info += (char)(nChar);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        System.out.println(info);
                    }
                }else{
                    System.out.println("No se encuentra el fichero información o no tiene permisos");
                }
                break;
            case 5:
                System.out.println("*** RANKING ***");
                System.out.println("Apartado en desarrollo");
                break;
            case 6:
                System.out.println("*** CONEXIÓN A BBDD ***");
                System.out.println("Apartado en desarrollo");
                break;
        }
    }
}
