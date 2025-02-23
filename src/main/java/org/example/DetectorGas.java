package org.example;

import com.google.common.eventbus.EventBus;

public class DetectorGas {
    private final EventBus eventBus;

    public DetectorGas(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void detectar() {
        System.out.println("🔍 Analizando sensores de gas...");
        boolean fugaDetectada = Math.random() > 0.5; // Simulación

        if (fugaDetectada) {
            System.out.println("⚠️ ¡FUGA DE GAS DETECTADA!");
            eventBus.post(new EventoFugaGas("☠\uFE0F Alerta: Fuga de gas detectada."));
        } else {
            System.out.println("✅ No se detecta fuga de gas.");
        }
    }
}
