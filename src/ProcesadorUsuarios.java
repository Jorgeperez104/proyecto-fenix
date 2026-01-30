import java.util.List;

/**
 * Clase que procesa listas de usuarios y separa admins de invitados.
 * Permite obtener un resumen de cada rol en un solo String.
 */
public class ProcesadorUsuarios {

    /** Constante que representa el rol de administrador */
    private static final int ROL_ADMIN = 1;

    /** Constante que representa el rol de invitado */
    private static final int ROL_INVITADO = 2;

    /**
     * Procesa una lista de usuarios en formato "nombre:rol" y devuelve
     * un String con los admins e invitados separados.
     * 
     * @param usuarios Lista de usuarios con formato "nombre:rol"
     * @return String que contiene admins e invitados
     */
    public String procesarLista(List<String> usuarios) {
        String admins = "";
        String invitados = "";

        for (String u : usuarios) {
            String[] parts = u.split(":"); // Separar nombre y rol
            if (parts.length == 2) {
                String nombre = parts[0];
                int rol = Integer.parseInt(parts[1]);

                if (rol == ROL_ADMIN) {
                    admins += procesarAdmin(nombre);
                } else if (rol == ROL_INVITADO) {
                    invitados += procesarInvitado(nombre);
                }
            }
        }

        return "Admins: " + admins + " | Invitados: " + invitados;
    }

    /**
     * Procesa un admin y devuelve su nombre formateado.
     * 
     * @param nombre Nombre del admin
     * @return Nombre del admin con coma al final
     */
    private String procesarAdmin(String nombre) {
        return nombre + ",";
    }

    /**
     * Procesa un invitado y devuelve su nombre formateado.
     * 
     * @param nombre Nombre del invitado
     * @return Nombre del invitado con coma al final
     */
    private String procesarInvitado(String nombre) {
        return nombre + ",";
    }
}

