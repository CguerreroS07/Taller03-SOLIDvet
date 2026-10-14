package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;
import java.util.Objects;

public abstract class TratamientoBase implements ITratamiento{
    private final int id;
    private final String descripcion;
    private final double costo;

    protected TratamientoBase(int id, String descripcion, double costo){
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public double getCosto(){
        return costo;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (!(o instanceof TratamientoBase)){
            return false;
        }
        return id == ((TratamientoBase) o).id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+"{"+"id="+id+", descripcion="+ descripcion +'\''+", costo="+ costo + '}';
    }
}
