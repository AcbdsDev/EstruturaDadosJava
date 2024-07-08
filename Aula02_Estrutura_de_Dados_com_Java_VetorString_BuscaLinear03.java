package aula02;

import java.util.Scanner;

public class Aula02_Estrutura_de_Dados_com_Java_VetorString_BuscaLinear03 {
    public static void main(String[] args) {



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
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado vc quer buscar?");
        String siglaBusca = leitor.nextLine();





            for (int i=0; i < estados.length; i++) {
                String elemento = estados[i];
                if (elemento.equals(siglaBusca)){
                    System.out.println("Sou euuuu");
            }else{
                     System.out.println("Nãum sou ieuuu");
        }
        }


    }
}


