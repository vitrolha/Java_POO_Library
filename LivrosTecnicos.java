/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Vítor
 */
public class LivrosTecnicos extends Livros{
    
    
    public LivrosTecnicos(String titulo, int copias, String nome_autor)
    {
        super(titulo, copias, nome_autor);
        reservado = false;
    }
    
    public void reservar()
    {
        reservado = true;
    }
    
    public void liberar()
    {
        reservado = false;
    }
    @Override
    public void imprimir()
    {
        super.imprimir();
        
        
    }
}
