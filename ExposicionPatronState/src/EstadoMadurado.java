class EstadoMadurado implements EstadoCultivo {
    @Override
    public void regar(Cultivo cultivo) {
        System.out.println("No es necesario regar una planta madura.");
    }

    @Override
    public void crecer(Cultivo cultivo) {
        System.out.println("La planta ya está madura. ¡Lista para cosechar!");
    }

    @Override
    public void cosechar(Cultivo cultivo) {
        System.out.println("¡Has cosechado el cultivo maduro! +" + cultivo.getRendimientoCosecha() + " unidades.");
    }

    @Override
    public void alCambiarEstacion(Cultivo cultivo, String nuevaEstacion) {
        System.out.println("La planta madura se marchitó por cambio de estación.");
        cultivo.setEstado(new EstadoMarchito());
    }
}