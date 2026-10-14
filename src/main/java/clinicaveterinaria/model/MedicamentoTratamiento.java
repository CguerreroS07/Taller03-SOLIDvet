package clinicaveterinaria.model;

public class MedicamentoTratamiento extends TratamientoBase {

    public MedicamentoTratamiento(int id, String descripcion, double costo) {
        super(id, descripcion, costo);
    }

    @Override
    public double calcularCostoFinal() {
        return getCosto() * 1.10;
    }

    @Override
    public double calcularCostoConImpuestos() {
        return getCosto() * 1.08;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Administrar segun receta.";
    }

    @Override
    public String prepararSala() {
        return "Preparar receta y dosis.";
    }
}