/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Vítor
 */
public class Livros extends Publicacoes{
    
    private String nome_autor;
    protected boolean reservado;
    
    public Livros(String titulo, int copias, String nome_autor)
    {
        super(titulo, copias);
        this.nome_autor = nome_autor;
    }
    
    //getters e setters

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }
    
    public boolean emprestar()
    {
        if(reservado) return false;
        if(copias_disp > 0)
        {
            copias_disp --;
            return true;
        }
        return false;
    }
    
    public boolean devolver()
    {
        if(copias_disp < copias)
        {
            copias_disp ++;
        }
        return false;
    }
    
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Nome do autor: " + nome_autor + "\nReservado: " + (reservado?"Sim":"Nao"));
    }
    
}
