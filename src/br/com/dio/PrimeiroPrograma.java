package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        /* int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a+b));*/

        /* ctrl + shift + / - comenta o bloco selecionado
         * ctrl + / - comenta linha por linha
         * shift + F6 - Renomear
         * ctrl + alt + l - Identação
         * ctrl + d - Duplica a linha
         * ctrl+l - Deleta a linha
         * ctrl + shift + seta - move o bloco inteiro
         * atalhos estão no git hub da professora Camila */

        Gato gato = new Gato(null, null, null);
        System.out.println(gato);

        Livro livro1 = new Livro("O problemas dos 3 corpos", 300);
        System.out.println(livro1);

    }

}
 class Livro {
    private String nome;
    private Integer numPag;

     public Livro(String nome, Integer numPag) {
         this.nome = nome;
         this.numPag = numPag;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getNumPag() {
         return numPag;
     }

     public void setNumPag(Integer numPag) {
         this.numPag = numPag;
     }

     @Override
     public String toString() {
         return "Livro{" +
                 "nome='" + nome + '\'' +
                 ", numPag=" + numPag +
                 '}';
     }
 }
