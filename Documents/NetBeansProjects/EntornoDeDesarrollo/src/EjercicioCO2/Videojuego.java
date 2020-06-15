/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCO2;

/**
 *
 * @author josem
 */
public class Videojuego {
    private String titulo="LIBRE";
    private int horasestimadas=10;
    private boolean prestado=false;
    private String genero;
    private String compañia;

    public Videojuego(String titulo, String genero, String compañia) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
    }

    public Videojuego() {
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasestimadas() {
        return horasestimadas;
    }

    public void setHorasestimadas(int horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    public void alquilar(int alquilarVJ){
        this.prestado=true;
        alquilarVJ++;
    }
    public void devolver(int alquilarVJ){
        this.prestado=false;
        alquilarVJ--;
    }
    public void esEntregado(int alquilarVJ){
        for (int i = 0; i <1; i++) {
            if(this.prestado==true){
                alquilarVJ++;
            }
        }
        System.out.println("Hay "+alquilarVJ+" videojuegos alquilados");
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + "\nhorasestimadas=" + horasestimadas + "\nprestado=" + prestado + "\ngenero=" + genero + "\ncompa\u00f1ia=" + compañia;
    }
    
}
