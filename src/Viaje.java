public class Viaje {
    private String destino;
    private String fecha;
    private String plan;
    private double costo;
    private String nombreCliente;

    public Viaje(String destino, String fecha, String plan, double costo, String nombreCliente) {
        this.destino = destino;
        this.fecha = fecha;
        this.plan = plan;
        this.costo = costo;
        this.nombreCliente = nombreCliente;
    }

    public String getDestino() { return destino; }
    public String getFecha() { return fecha; }
    public String getPlan() { return plan; }
    public double getCosto() { return costo; }
    public String getNombreCliente() { return nombreCliente; }
}



