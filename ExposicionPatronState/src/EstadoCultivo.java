interface EstadoCultivo {
    void regar (Cultivo cultivo);
    void crecer (Cultivo cultivo);
    void cosechar(Cultivo cultivo);
    void alCambiarEstacion(Cultivo cultivo, String nuevaEstacion);
}