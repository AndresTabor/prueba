package com.sofka.agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operation;
        int isActive = 1;
        int contador_contactos = 0;
        String name;
        String celphone;
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido");

        while (isActive == 1){

            System.out.println("""                        
            Ingrese la operación a realizar: 
            1 = Nuevo contacto.
            2 = Modificar contacto.         
            3 = Eliminar contacto.
            4 = Buscar contacto.  
            5 = Vaciar Agenda.""");
            operation = scanner.nextInt();


            switch (operation) {
                case 1:
                    if (contador_contactos < 99){
                        name = getName();
                        celphone = getCel();
                        agenda.addContact(new Contacto(name, celphone), contador_contactos);
                        contador_contactos = contador_contactos + 1;
                    }else {
                        System.out.println("Agenda llena");
                    }
                    break;
                case 2:
                    //agenda.updateContact(persona);
                    break;
                case 3:
                    //agenda.deleteContact(persona);
                    break;
                case 4:
                    name = getName();
                    agenda.getContact(name);
                    break;
                case 5:
                    name = getName();
                    //agenda.deleAllContact(name);
                    break;
                default:
                    System.out.println("Operación invalida");
                    continue;

            }

            System.out.println("""
                Desea realizar otra operación?
                1 = Si.
                2 = No.""");

            isActive = scanner.nextInt();
        }
    }
    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Ingrese el nombre ");
        name = scanner.nextLine();
        return name;
    }
    public static String getCel(){
        Scanner scanner = new Scanner(System.in);
        String celphone;
        System.out.println("Ingrese el numero telefónico ");
        celphone = scanner.nextLine();
        return celphone;
    }
}
