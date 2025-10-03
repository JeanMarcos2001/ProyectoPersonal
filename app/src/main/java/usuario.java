import com.google.android.material.textfield.TextInputEditText;

public class usuario {
    public int Dni;
    private String Apellidos;
    private String Nombre;
    public int Celular;
    public String Sexo;

    private String Correo;
    public String Clave;

    public usuario(int dni, String apellidos, String nombre, int celular, String sexo, String correo, String clave) {
        Dni = dni;
        Apellidos = apellidos;
        Nombre = nombre;
        Celular = celular;
        Sexo = sexo;
        Correo = correo;
        Clave = clave;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }
}
