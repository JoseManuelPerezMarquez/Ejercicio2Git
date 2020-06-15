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
public class Serie {
    private String titulo="LIBRE";
    private int numtemporadas=3;
    private boolean prestado=false;
    private String genero;
    private String creador;

    public Serie(String titulo, String genero, String creador) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        
    }

    public Serie() {
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return numtemporadas;
    }

    public void setTemporadas(int temporadas) {
        this.numtemporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    public void alquilar(int alquilarS){
        this.prestado=true;
        alquilarS++;
    }
    public void devolver(int alquilarS){
        this.prestado=false;
        for (int i = 0; i <1; i++) {
            if(this.prestado==false){
                alquilarS=0;
            }
        }
        System.out.println("Hay "+alquilarS+" series alquiladas");
    }
    void esEntregado(int alquilarS){
        for (int i = 0; i <1; i++) {
            if(this.prestado==true){
                alquilarS++;
            }
        }
        System.out.println("Hay "+alquilarS+" series alquiladas");
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + "\nnumtemporadas=" + numtemporadas + "\nprestado=" + prestado + "\ngenero=" + genero + "\ncreador=" + creador;
    }
    
    
    
}
