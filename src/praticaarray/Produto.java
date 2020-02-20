/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaarray;

/**
 *
 * @author aluno
 */
public class Produto {
   private String nome;
   private int quant_estoque;
   private double valor;

    public Produto(String nome, int quant_estoque, double valor) {
        this.nome = nome;
        this.quant_estoque = quant_estoque;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant_estoque() {
        return quant_estoque;
    }

    public void setQuant_estoque(int quant_estoque) {
        this.quant_estoque = quant_estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
   public void adicionaEstoque(int adiciona){
       this.quant_estoque += adiciona;
   }
   
   public void baixaEstoque(int baixa){
       if(this.quant_estoque >= baixa){
            this.quant_estoque -= baixa;
       }else{
           System.out.println("Estoque insuficioente!!!");
       }
   }
   
   public void imprimeInventario(){
       System.out.println("---=== Inventário ===---");
       System.out.println("Nome: " + this.getNome());
       System.out.println("Quantidade em Estoque: " + this.getQuant_estoque());
       System.out.println("Valor: R$ " + this.getValor());
   }
}
