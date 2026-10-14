package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.Caminador;
import clinicaveterinaria.interfaces.Nadador;

public class Gato extends Animal implements Caminador, Nadador {
    public Gato(int id, String nombre) {
        super(id, nombre, TipoAnimal.GATO);
    }

    @Override  
    public void caminar(){
        System.out.println(getNombre() + "esta caminando");
    }

    @Override  
    public void nadar(){
        System.out.println(getNombre() + "esta nadando");
    }

}
