package com.mycompany.principioliskov;

public class ConfiguracionSistema implements RecursoPersistente, Notificable{

    public void load() {
        System.out.println("Configuracion sistema cargada");
        notificar();
    }

    public void save() {
        System.out.println("Configuracion sistema almacenada");
        notificar();
    }

    @Override
    public void notificar() {
        System.out.println("Notificación: La configuración del sistema ha sido procesada.");
    }
}
