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
        Produto produtos[] = new Produto[3];
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome, preço e valor do 1o produto: ");
        String nome = entrada.next();
        int quant_estoque = entrada.nextInt();
        double valor = entrada.nextDouble();
        Produto produto1 = new Produto(nome, quant_estoque, valor);
        
        System.out.println("Nome, preço e valor do 2o produto: ");
        nome = entrada.next();
        quant_estoque = entrada.nextInt();
        valor = entrada.nextDouble();
        Produto produto2 = new Produto(nome, quant_estoque, valor);
        
        System.out.println("Nome, preço e valor do 3o produto: ");
        nome = entrada.next();
        quant_estoque = entrada.nextInt();
        valor = entrada.nextDouble();
        Produto produto3 = new Produto(nome, quant_estoque, valor);
        
        produtos[0] = produto1;
        produtos[1] = produto2;
        produtos[2] = produto3;
        
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
