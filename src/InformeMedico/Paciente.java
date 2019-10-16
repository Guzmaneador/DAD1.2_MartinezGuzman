package InformeMedico;

/**
 *
 * @author Vulture
 */
public class Paciente {
    String nombre;
    String Apellidos;
    String fecha;
    String idioma;
    String sexo;
    String residencia;
    String trabajo;
    String telefono;
    String correo;
    String personasConvive;
    String tipoVivienda;
    boolean macotas;
    String tipoMascota;
    String empleo;
    String anhosEmpleo;
    String empleosRiego;
    
    String vacunas;
    String alergias;
    String enfermedadesFrecuentes;

    public Paciente() {
        this.nombre = " ";
        this.Apellidos = " ";
        this.fecha = " ";
        this.idioma = " ";
        this.sexo = " ";
        this.residencia = " ";
        this.trabajo = " ";
        this.telefono = " ";
        this.correo = " ";
        this.personasConvive = "0";
        this.tipoVivienda = " ";
        this.macotas = false;
        this.tipoMascota = " ";
        this.empleo =" ";
        this.anhosEmpleo = "0";
        this.empleosRiego = " ";
        this.vacunas = " ";
        this.alergias = " ";
        this.enfermedadesFrecuentes = " ";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPersonasConvive() {
        return personasConvive;
    }

    public void setPersonasConvive(String personasConvive) {
        this.personasConvive = personasConvive;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public boolean isMacotas() {
        return macotas;
    }

    public void setMacotas(boolean macotas) {
        this.macotas = macotas;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    public String getAnhosEmpleo() {
        return anhosEmpleo;
    }

    public void setAnhosEmpleo(String anhosEmpleo) {
        this.anhosEmpleo = anhosEmpleo;
    }

    public String getEmpleosRiego() {
        return empleosRiego;
    }

    public void setEmpleosRiego(String empleosRiego) {
        this.empleosRiego = empleosRiego;
    }
    
    //-------------Historial medico--------------///

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesFrecuentes() {
        return enfermedadesFrecuentes;
    }

    public void setEnfermedadesFrecuentes(String enfermedadesFrecuentes) {
        this.enfermedadesFrecuentes = enfermedadesFrecuentes;
    }
    
   
    
}
