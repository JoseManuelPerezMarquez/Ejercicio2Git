/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion_empleado;

/**
 *
 * @author usuario
 */
public class Empleado {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String direcion;
    private int cp;
    private String provincia;
    private  int edad;
    private char categoria; // A director, B  técnico superior, C técnico medio, D auxiliar
    private int nHijos; 
    private int nIngles; // nivel de ingles 1 inicial  2 medio 3 avanzado
    private int antiguedad; // años que lleva trabajando en la empresa

    
  // Constructor  
    
    public Empleado(String nombre, String apellidos, String dni, String direcion, int cp, String provincia, int edad, char categoria, int nHijos, int nIngles, int antiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direcion = direcion;
        this.cp = cp;
        this.provincia = provincia;
        this.edad = edad;
        this.categoria = categoria;
        this.nHijos = nHijos;
        this.nIngles = nIngles;
        this.antiguedad = antiguedad;
    }

    public Empleado(String nombre, String apellidos, int edad, char categoria, int nHijos, int nIngles, int antiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.categoria = categoria;
        this.nHijos = nHijos;
        this.nIngles = nIngles;
        this.antiguedad = antiguedad;
    }

  
    
    // método que devuelve el sueldo base según la categoría de del empleado y  la antiguedad
    public double sueldoBase(){
        double sueldo = 0;
        double plus = 1;
        if (this.antiguedad>=5){ plus = 1.10;}
        switch (this.categoria){
            case 'A' : sueldo = 2500*plus; break;
            case 'B' : sueldo = 2000*plus; break;
            case 'C' : sueldo = 1500*plus; break;
            case 'D' : sueldo = 1000*plus; break;
        }
        return sueldo;
    }
 // método para calcualr la retención IRPF que se le aplica en función del número de hijos
    public double retencionIRPF(){
       double porcentaje;
        switch (this.nHijos){
            case 0  : porcentaje=18; break;
            case 1-2: porcentaje=16; break;
            default : porcentaje=14; 
        }
        return porcentaje;
       }
   //método que devuelve el nivel de ingles inicial, médio o avanzado
    public String nivelIngles(){ 
    String nivel;
        switch (this.nIngles){
            case 1 : nivel= "Inicial"; break;
            case 2 : nivel="Medio"; break;
            case 3 : nivel="Avanzado"; break;
            default: nivel="no se registra"; 
        }
        return nivel;
    }
    
    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getnHijos() {
        return nHijos;
    }

    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    public int getnIngles() {
        return nIngles;
    }

    public void setnIngles(int nIngles) {
        this.nIngles = nIngles;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
}
