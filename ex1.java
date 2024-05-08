/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.a1;

/**
 *
 * @author GAMER
 */
import java.util.Scanner;
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        double valorTotal, valorPago, trocoTotal;
        boolean pagamentoValido;
        int trocoNotas;
        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] notasNecessarias = new int[notas.length];
        
        System.out.println("Digite o seu nome: ");
        nome = ler.next();
        
        System.out.println("Digite o valor total da sua compra: ");
        valorTotal = ler.nextDouble();
        
        System.out.println("Digite o valor total que você pagará: ");
        valorPago = ler.nextDouble();
        
        trocoTotal = valorTotal - valorPago;
        
        trocoNotas = (int) trocoTotal;
        
        pagamentoValido = validarPagamento(valorTotal, valorPago);
        
        for(int i = 0; i < notas.length; i++){
            
            notasNecessarias[i] = trocoNotas / notas[i];
            trocoNotas %= notas[i];
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Valor total da compra: R$" + valorTotal);
        System.out.println("Valor pago: R$" + valorPago);
        
        if (pagamentoValido == true){
            
            System.out.println("Troco: " + (trocoTotal * -1));
            
            for(int i = 0; i < notas.length; i++){
                
                System.out.println("Notas de " + notas[i] + ": " + (notasNecessarias[i] * -1));
            }
        }
        else{
            
            System.out.println("Valor insuficiente para realizar suas compras!");
        }
        
    }
    
    public static boolean validarPagamento (double valorTotal, double valorPago){
        
        if (valorPago >= valorTotal){
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
}
