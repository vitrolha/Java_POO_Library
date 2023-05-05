/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Vítor
 */
public class Publicacoes {
    
    private String titulo;
    protected int copias, copias_total, copias_disp;
    
    
    public Publicacoes(String titulo, int copias)
    {
        this.titulo = titulo;
        this.copias = copias;
        copias_disp = copias;
    }
    
    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getCopias_total() {
        return copias_total;
    }

    public void setCopias_total(int copias_total) {
        this.copias_total = copias_total;
    }

    public int getCopias_disp() {
        return copias_disp;
    }

    public void setCopias_disp(int copias_disp) {
        this.copias_disp = copias_disp;
    }
    
    public void imprimir()
    {
        System.out.println("Titulo: " + titulo + "\nTotal de Copias: " + copias + "\nCopias Disponiveis: " + copias_disp);
    }
    
    public boolean disponivel()
    {
        if(copias_disp > 0)return true;
        return false;
    }
    
    public boolean consultar()
    {
        if(copias_disp > 0)
        {
            copias_disp --;
            return true;
        }
        return false;
    }
    
    public boolean retornar()
    {
        if(copias_disp < copias)
        {
            copias_disp ++;
            return true;
        }

        return false;        
    }
}
