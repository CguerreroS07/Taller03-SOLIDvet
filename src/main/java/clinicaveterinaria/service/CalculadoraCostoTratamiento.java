package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.ITratamiento;
import clinicaveterinaria.model.Tratamiento;


public class CalculadoraCostoTratamiento {
    public double calcularConImpuestos(ITratamiento tratamiento) {
        return tratamiento.calcularCostoConImpuestos();
    }
}
