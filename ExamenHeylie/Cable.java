
public class Cable extends OperacionBanc {

    private int PagoCable;
   
    public Cable( String nombre,int PagoCable)
    {
        super(nombre);
        this.PagoCable = PagoCable;
    }

    public void setfacturaCable(int PagoCable)
    {
        this.PagoCable = PagoCable;
    }

    public int getPagoCable()
    {
        return PagoCable = 500;
    }

    @Override
    public double CPago()
    {
        return getPagoCable();
    }

    public String toPagoCable()
    {
        return String.format
        ("Propiedad: %s%n El pago es de: %d", nombre , getPagoCable());
    }
}