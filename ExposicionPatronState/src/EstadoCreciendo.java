public class EstadoCreciendo implements EstadoCultivo {
    @Override
    public void regar(Cultivo cultivo) {
        cultivo.setRegado(true);
        System.out.println("Has regado el cultivo en crecimiento.");
    }

    @Override
    public void crecer(Cultivo cultivo) {
        if (cultivo.estaRegado()) {
            cultivo.incrementarDiasCrecimiento();
            System.out.println("Día de crecimiento #" + cultivo.getDiasCrecimiento());
            cultivo.setRegado(false); // Necesita agua cada día

            if (cultivo.getDiasCrecimiento() >= cultivo.getDiasParaMadurar()) {
                System.out.println("La planta ha madurado.");
                cultivo.setEstado(new EstadoMadurado());
            }
        } else {
            System.out.println("La planta no creció hoy (faltó agua).");
        }
    }
    @Override
    public void cosechar(Cultivo cultivo) {
        System.out.println("Todavía no está lista para cosechar.");
    }

    @Override
    public void alCambiarEstacion(Cultivo cultivo, String nuevaEstacion) {
        System.out.println("El cultivo se ha marchitado al cambiar la estación.");
        cultivo.setEstado(new EstadoMarchito());
    }

}
