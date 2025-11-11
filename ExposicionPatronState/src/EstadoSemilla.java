class EstadoSemilla implements EstadoCultivo {
    @Override
    public void regar(Cultivo cultivo) {
        cultivo.setRegado(true);
        System.out.println("Has regado la semilla.");
    }

    @Override
    public void crecer(Cultivo cultivo) {
        if (cultivo.estaRegado()) {
            System.out.println("La semilla germina y empieza a crecer.");
            cultivo.setEstado(new EstadoCreciendo());
            cultivo.setRegado(false); // Reset para el siguiente ciclo
        } else {
            System.out.println("La semilla no puede crecer sin agua.");
        }
    }

    @Override
    public void cosechar(Cultivo cultivo) {
        System.out.println("No puedes cosechar una semilla.");
    }

    @Override
    public void alCambiarEstacion(Cultivo cultivo, String nuevaEstacion) {
        System.out.println("La semilla se ha marchitado al cambiar la estación.");
        cultivo.setEstado(new EstadoMarchito());
    }
}