package org.example;
import com.google.common.eventbus.Subscribe;

public class ListenerEventos {

    @Subscribe
    public void manejarFugaGas(EventoFugaGas evento) {
        System.out.println("🚨 Evento recibido: " + evento.getMensaje());
        System.out.println("🔴 Cerrando válvula de gas...");
    }
    @Subscribe
    public void manejarFuego(EventoFuego evento) {
        System.out.println("🚨 Evento recibido: " + evento.getMensaje());
        System.out.println("🔴 Cerrando válvula de gas...");
    }

}