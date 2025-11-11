public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE CULTIVOS - STARDEW VALLEY ===\n");
        
        Cultivo melon = new Cultivo("Verano", 3, 5); // Verano, 3 dIas, 5 unidades
        
        System.out.println("-----------DIA 1-----------");
        melon.regar();
        melon.crecer();
        
        System.out.println("\n -----------DIA 2-----------");
        melon.crecer(); // Olvidó regar
        melon.regar();
        melon.crecer();
        
        System.out.println("\n-----------DIA 3-----------");
        melon.regar();
        melon.crecer(); // ¡Madura!
        
        System.out.println("\n-----------DIA 4-----------");
        melon.cosechar(); // Cosecha
        
        System.out.println("\n-----------DIA 5-----------");
        melon.cambiarEstacion("Otoño"); // Cambio de estación
        melon.regar();
        melon.crecer();
        
        System.out.println("\n=== EJEMPLO 2: Cultivo que se marchita ===\n");
        Cultivo tomate = new Cultivo("Verano", 4, 3);
        
        System.out.println("-----------DIA 1-----------");
        tomate.regar();
        tomate.crecer();
        
        System.out.println("\n-----------DIA 2-----------");
        tomate.regar();
        tomate.crecer();
        
        System.out.println("\n ¡Llegó el otoño!");
        tomate.cambiarEstacion("Otoño");
        tomate.cosechar(); // Intenta cosechar un cultivo marchito
    }
}