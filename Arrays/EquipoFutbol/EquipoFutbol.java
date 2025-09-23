package Arrays.EquipoFutbol;

public class EquipoFutbol {
    private String nombreEquipo;
    private String entrenador;
    private String[] jugadores;
    private int cantidadActual;
    private final int MAX_JUGADORES = 25;

    // Constructor (sin validaciones)

    public EquipoFutbol(String nombreEquipo, String entrenador) {
        this.nombreEquipo = nombreEquipo; // Asignar el nombre del equipo
        this.entrenador = entrenador;    // Asignar el entrenador
        jugadores = new String[MAX_JUGADORES]; // Inicializar el array
        cantidadActual = 0;                // Establecer cantidad inicial
    }

    // Getters y setters básicos

    public String getNombreEquipo() {
        return nombreEquipo; // Retornar el nombre del equipo
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo; // Asignar el nuevo nombre
    }

    public String getEntrenador() {
        return entrenador; // Retornar el nombre del entrenador
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador; // Asignar el nuevo nombre
    }

    public int getCantidadActual() {
        return cantidadActual; // Retornar la cantidad actual de jugadores
    }

    public int getCapacidadMaxima() {
        return MAX_JUGADORES; // Retornar la capacidad máxima
    }

    // Operaciones sobre jugadores

    public boolean agregarJugador(String nombreJugador) {

        if (cantidadActual < MAX_JUGADORES) { // Verificar si hay espacio

            jugadores[cantidadActual] = nombreJugador; // Asignar el jugador

            // Incrementar cantidadActual

            return true;
        }
        return false;

    }

    public boolean eliminarJugador(int posicion) {

        if (posicion < 0 || posicion >= cantidadActual) {
            return false; // Validar posición
        }

        for (int i = posicion; i < cantidadActual - 1; i++) {

            // Mover los jugadores restantes

        }

        // Limpiar la última posición y reducir cantidadActual

        return true;

    }

    public String[] getJugadores() {

        String[] copia = new String[cantidadActual]; // Crear nuevo array

        for (int i = 0; i < cantidadActual; i++) {

            // Copiar los jugadores al nuevo array

        }

        return copia;

    }

    // Representación en texto del equipo

    @Override

    public String toString() {

        String texto = "Equipo: " + nombreEquipo + " | Entrenador: " + entrenador

                     + "\nJugadores (" + cantidadActual + "):\n";

        for (int i = 0; i < cantidadActual; i++) {
            // Agregar cada jugador con su posición
        }

        return texto;

    }
}
