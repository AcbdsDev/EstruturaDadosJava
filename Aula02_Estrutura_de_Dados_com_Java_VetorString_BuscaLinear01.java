package aula02;

import java.util.Scanner;

public class Aula02_Estrutura_de_Dados_com_Java_VetorString_BuscaLinear01 {
    public static void main(String[] args) {


        //******************************PARTE 01 ******************************


    String[] estados = new String[10];
    estados[0]="PR";
    estados[1]="MS";
    estados[2]="MT";
    estados[3]="SP";
    estados[5]="RO";
    estados[4]="TO";
    estados[6]="SE";
    estados[7]="AM";
    estados[8]="PA";
    estados[9]="MG";


        for( int i = 0; i<estados.length; i++){
        System.out.println("Estado " + i + ":" + estados[i]);

        }
    }
}

