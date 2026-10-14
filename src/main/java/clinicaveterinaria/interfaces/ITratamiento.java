package clinicaveterinaria.interfaces;

public interface ITratamiento {
    int getId();
    String getDescripcion();
    double getCosto();
    double calcularCostoFinal();
    double calcularCostoConImpuestos();
    String obtenerIndicaciones();
    String prepararSala();
}
