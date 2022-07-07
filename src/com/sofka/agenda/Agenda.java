package com.sofka.agenda;

public class Agenda {

    Contacto lista_contactos[] = new Contacto[99];

    public void addContact(Contacto contacto, int position) {
        this.lista_contactos[position] = contacto;
    }

    public static void getContact(Contacto contacto) {

    }

    public static void deleteContact(Contacto contacto) {

    }

    public static void updateContact(Contacto contacto) {

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