
public abstract class OperacionBanc 
{
    protected String nombre;

    public OperacionBanc(String nombre)
    {
       this.nombre = nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public abstract double CPago();
}
