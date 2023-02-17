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

    }
}
