package org.example;

import com.google.common.eventbus.EventBus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EventBus eventBus = new EventBus();
        ListenerEventos listener = new ListenerEventos();

        eventBus.register(listener);

        DetectorGas detectorGas = new DetectorGas(eventBus);
        DetectorFuego detectorFuego = new DetectorFuego(eventBus);

        // Simular detección de fuego
        detectorGas.detectar();
        detectorFuego.detectar();

    }
}
