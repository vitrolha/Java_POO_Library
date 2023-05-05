/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Vítor
 */
public class Periodicos extends Publicacoes{
    
    private int num_vol;
    
    public Periodicos(String titulo, int copias, int num_vol)
    {
        super(titulo, copias);
        this.num_vol = num_vol;
    }
    
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Numero do volume: " + num_vol);
    }
}
