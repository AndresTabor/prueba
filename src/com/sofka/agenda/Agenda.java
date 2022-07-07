package com.sofka.agenda;

import java.util.Scanner;

public class Agenda {

    static Contacto[] lista_contactos = new Contacto[99];

    public void addContact(Contacto contacto, int position) {
        this.lista_contactos[position] = contacto;
    }


    public static void deleteContact(String name) {
        for (int i = 0; i < lista_contactos.length; i++) {
            if (lista_contactos[i].name.equals(name)){
                lista_contactos[i]= null;
                System.out.println("Contacto eliminado");
                break;
            }else{
                System.out.println("Contacto no encontrado");
            }
        }
    }

    public static void updateContact(String name) {
        for (Contacto contacto : lista_contactos){
            if (contacto.name.equals(name)){
                System.out.println("Ingrese nombre");
                Scanner scanner = new Scanner(System.in);
                String nuevoName = scanner.nextLine();

                System.out.println("Ingrese número de contacto");
                String nuevoNumero = scanner.nextLine();

                contacto.name = nuevoName;
                contacto.celphone = nuevoNumero;
                System.out.println("Contacto actualizado");
                break;

            }else{
                System.out.println("Contacto no encontrado");
            }
        }
    }

    public static void getContact(String name) {
        for (Contacto contacto : lista_contactos) {
            if (contacto.name.equals(name)){
                System.out.println("Nombre: " + contacto.name + "\n" + "Teléfono: " + contacto.celphone);
                break;
            }else{
                System.out.println("Contacto no encontrado");
            }
        }
    }

    public static void deleAllContact() {

    }
}
 /*
    Contacto[] lista_contactos = new Contacto[99];
    private int contador_contactos = 0; // Contador de objetos creados. Variable muy importante.

    public void Consultar(String nombre, int telefono) {
        for (int i = 0; i < this.contador_contactos; i++) {

            if (nombre.equals(this.lista_contactos[i].getNombre())) {
                System.out.println("Ya existe un contacto con ese nombre");
            }
        }

    }

    public void Anadir(String nombre, int telefono) {
        if (contador_contactos < 99) {
            this.lista_contactos[contador_contactos] = new Contacto();
            this.lista_contactos[contador_contactos].set_nombre(nombre);
            this.lista_contactos[contador_contactos].set_telefono(telefono);
            this.contador_contactos++;
            Ordenar();
        } else {
            System.out.println("La agenda está llena");
        }

    }
*/