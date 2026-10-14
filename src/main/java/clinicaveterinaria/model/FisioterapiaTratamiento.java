package clinicaveterinaria.model;

public class FisioterapiaTratamiento extends TratamientoBase {

    public FisioterapiaTratamiento(int id, String descripcion, double costo) {
        super(id, descripcion, costo);
    }

    @Override
    public double calcularCostoFinal() {
        return getCosto() * 0.95;
    }

    @Override
    public double calcularCostoConImpuestos() {
        return getCosto() * 1.05;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Repetir sesiones dos veces por semana.";
    }

    @Override
    public String prepararSala() {
        return "Preparar camilla y bandas elasticas.";
    }
}