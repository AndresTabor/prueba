package com.sofka.agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operation;
        int isActive = 1;
        String nameContact;
        String cel;
        int contador_contactos = 0;
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");

        while (isActive == 1){
            System.out.println("""                        
            Ingrese la operación a realizar: 
            1 = Nuevo contacto.
            2 = Modificar contacto.         
            3 = Eliminar contacto.
            4 = Listado de contacto.  
            5 = Vaciar Agenda.""");
            operation = scanner.nextInt();
            System.out.println("Ingrese nombre del contacto");
            nameContact = scanner.nextLine();
            System.out.println("Ingrese numero celular");
            cel = scanner.nextLine();

            Contacto persona = new Contacto(nameContact,cel);

            switch (operation) {
                case 1:
                    if (contador_contactos < 99){
                        agenda.addContact(persona, contador_contactos);
                        contador_contactos = contador_contactos + 1;
                    }else {
                        System.out.println("Agenda llena");
                    }
                    break;
                case 2:
                    agenda.updateContact(persona);
                    break;
                case 3:
                    agenda.deleteContact(persona);
                    break;
                case 4:
                    agenda.getContact(persona);
                    break;
                case 5:
                    agenda.deleAllContact();
                    break;
                default:
                    System.out.println("Operación invalida");
                    continue;

            }

            System.out.println("""
                Desea realizar otra operación?
                1 = Si.
                2 = No.""");


        }
    }
}
