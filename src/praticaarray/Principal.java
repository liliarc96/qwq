/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaarray;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        Produto produtos[] = new Produto[n];
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i < n;i++){
            System.out.println("Nome, preço e valor do"+ (1 + i) +"º produto");
            String nome = entrada.next();
            int quant_estoque = entrada.nextInt();
            double valor = entrada.nextDouble();
            produtos[i] = new Produto(nome, quant_estoque, valor);
        }
        
        
        System.out.println("Digite o ID do produto adquirido: ");
        int id = entrada.nextInt();
        System.out.println("Digite a quantidade adquirida: ");
        int quant = entrada.nextInt();
        
        if(id >= 0 && id <= 2){
            produtos[id].baixaEstoque(quant);
            System.out.println("Total a ser pago: R$ " + (produtos[id].getValor())*quant);
            produtos[id].imprimeInventario();
        }
        
        System.out.println("Foram adquiridos produtos com qual ID?");
        id = entrada.nextInt();
        System.out.println("Digite a quantidade adquirida: ");
        quant = entrada.nextInt();
        
        produtos[id].adicionaEstoque(quant);
        produtos[id].imprimeInventario();
    }
    
}
