package org.example;
import com.google.common.eventbus.EventBus;

public class DetectorFuego {
    private final EventBus eventBus;

    public DetectorFuego(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void detectar() {
        System.out.println("🔥 Analizando Camara Termica...");
        boolean fuegoDetectado = Math.random() > 0.5; // Simulación

        if (fuegoDetectado) {
            System.out.println("⚠️ ¡FUEGO DETECTADO!");
            eventBus.post(new EventoFuego("🔥 Alerta: Incendio detectado."));
        } else {
            System.out.println("✅ No se detecta fuego.");
        }
    }
}