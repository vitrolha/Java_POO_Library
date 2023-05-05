/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Vítor
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livros l = new Livros("oi", 100, "Pedro");
        LivrosTecnicos lt = new LivrosTecnicos("Xesq", 50, "Joao");
        Periodicos p = new Periodicos("Semsouls", 20, 103);
        
        l.imprimir();
        lt.imprimir();
        p.imprimir();
        
        l.emprestar();
        System.out.println("");
        l.imprimir();
        System.out.println("");
        l.devolver();
        System.out.println("");
        l.imprimir();
        System.out.println("");
        
        lt.reservar();
        lt.imprimir();
        lt.liberar();
        lt.imprimir();
        System.out.println("");
        
        p.imprimir();
        p.consultar();
        p.imprimir();
        p.retornar();
        p.imprimir();
        
    }
    
}
