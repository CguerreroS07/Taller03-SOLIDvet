package clinicaveterinaria.model;

public class VacunaTratamiento extends TratamientoBase {

    public VacunaTratamiento(int id, String descripcion, double costo) {
        super(id, descripcion, costo);
    }

    @Override
    public double calcularCostoFinal() {
        return getCosto() + 5.0;
    }

    @Override
    public double calcularCostoConImpuestos() {
        return getCosto() * 1.12;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Observar fiebre durante 24 horas.";
    }

    @Override
    public String prepararSala() {
        return "Preparar refrigeracion y jeringas.";
    }
}