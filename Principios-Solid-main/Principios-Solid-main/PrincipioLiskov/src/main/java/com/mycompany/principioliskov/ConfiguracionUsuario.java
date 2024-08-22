package com.mycompany.principioliskov;

public class ConfiguracionUsuario implements RecursoPersistente, Notificable{

    public void load() {
        System.out.println("Configuracion usuario cargada");
        notificar();
    }

    public void save() {
        System.out.println("Configuracion usuario almacenada");
        notificar();
    }

    @Override
    public void notificar() {
        System.out.println("Notificación: La configuración del usuario ha sido procesada.");
    }
}
