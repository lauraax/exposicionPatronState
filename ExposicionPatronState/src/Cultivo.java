class Cultivo {
    private EstadoCultivo estado;
    private String estacion;
    private int diasParaMadurar;
    private int diasCrecimiento = 0;
    private boolean regado = false;
    private int rendimientoCosecha;

    public Cultivo(String estacion, int diasParaMadurar, int rendimientoCosecha) {
        this.estacion = estacion;
        this.diasParaMadurar = diasParaMadurar;
        this.rendimientoCosecha = rendimientoCosecha;
        this.estado = new EstadoSemilla();
    }

    public void setEstado(EstadoCultivo estado) {
        this.estado = estado;
    }

    public String getEstacion() {
        return estacion;
    }

    public int getDiasParaMadurar() {
        return diasParaMadurar;
    }

    public int getDiasCrecimiento() {
        return diasCrecimiento;
    }

    public void incrementarDiasCrecimiento() {
        this.diasCrecimiento++;
    }

    public boolean estaRegado() {
        return regado;
    }

    public void setRegado(boolean regado) {
        this.regado = regado;
    }

    public int getRendimientoCosecha() {
        return rendimientoCosecha;
    }

    public void regar() {
        estado.regar(this);
    }

    public void crecer() {
        estado.crecer(this);
    }

    public void cosechar() {
        estado.cosechar(this);
    }

    public void cambiarEstacion(String nuevaEstacion) {
        if (!this.estacion.equals(nuevaEstacion)) {
            System.out.println("\n ¡Cambió la estación de " + this.estacion + " a " + nuevaEstacion + "!");
            estado.alCambiarEstacion(this, nuevaEstacion);
            this.estacion = nuevaEstacion;
        }
    }
}