class EstadoMarchito implements EstadoCultivo {
    @Override
    public void regar(Cultivo cultivo) {
        System.out.println("No puedes regar un cultivo marchito.");
    }

    @Override
    public void crecer(Cultivo cultivo) {
        System.out.println("El cultivo marchito no puede crecer.");
    }

    @Override
    public void cosechar(Cultivo cultivo) {
        System.out.println("No puedes cosechar un cultivo marchito.");
    }

    @Override
    public void alCambiarEstacion(Cultivo cultivo, String nuevaEstacion) {
        System.out.println("El cultivo sigue marchito.");
    }
}