package com.mycompany.principioliskov;

public class ConfiguracionHoraria implements RecursoPersistente, Notificable{

    public void load() {
        System.out.println("Configuracion horaria cargada");
        notificar();
    }

    @Override
    public void save() {

    }

    @Override
    public void notificar() {
        System.out.println("Notificación: La configuración horaria ha sido cargada.");
    }
}
