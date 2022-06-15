public class Cliente extends Persona {
    // Atributos
    private int idCliente;
    /*
     * static sirve para todas las instancias de la clase
     * no local de cada cliente, por lo que se iran sumando y no empezaran cada vez
     * que se llame a esta
     */
    private static int idUltimo = 0;
    private String email;

    // constructor
    public Cliente(String nombre, String apellidos, String nif, String email) {
        super(nombre, apellidos, nif);
        // TODO Auto-generated constructor stub
        this.email = email;
        setId();
    }

    // getters and setters
    public void setId() {
        idCliente = idUltimo + 1;
        idUltimo++;
    }

    public int getId() {
        return idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // metodos

    public String toString() {
        String resultado = "";
        resultado += "Nombre:\t\t" + getNombre() + "\n";
        resultado += "Apellidos:\t" + getApellidos() + "\n";
        resultado += "NIF:\t\t" + getNif() + "\n";
        resultado += "ID:\t\t" + getId() + "\n";
        resultado += "Email:\t\t" + getEmail() + "\n";
        resultado += "====================";

        return resultado;
    }

}