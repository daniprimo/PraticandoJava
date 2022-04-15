package Exercicios.Pratica05;

import  java.util.*;

/*
Calcule e mostre as médias dos pesos das pessoas da
mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos,
de 21 a 30 anos e maiores de 31 anos
*/



public class SomaPesos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> lista1a10 = new ArrayList<>();
        ArrayList<Double> lista11a20 = new ArrayList<>();
        ArrayList<Double> lista21a30 = new ArrayList<>();
        ArrayList<Double> listaMariores30 = new ArrayList<>();





        int idade;
        double peso;
        Double sum1a10 = 0d;
        Double sum11a20 = 0d;
        Double sum21a30 = 0d;
        Double sumMaiores30 = 0d;
        int p = 0;

        while (p < 10) {

            System.out.println((p+1) +"° Registro");

            System.out.println("Por favor digite a sua idade: ");
            idade = sc.nextInt();

            if( idade >= 1 || idade <= 10 ){

                System.out.println("Por favor digite o seu peso");
                peso = sc.nextDouble();
                lista1a10.add(peso);

                Iterator<Double> iterator = lista1a10.iterator();
                while(iterator.hasNext()) {
                    Double number = iterator.next();
                    sum1a10 += number;
                }

                p++;

            }
            if( idade >= 11 || idade <= 20 ){

                System.out.println("Por favor digite o seu peso");
                peso = sc.nextDouble();
                lista11a20.add(peso);

                Iterator<Double> iterator2 = lista11a20.iterator();
                while(iterator2.hasNext()) {
                    Double number = iterator2.next();
                    sum11a20 += number;
                }

                p++;
            }
            if( idade >= 21 || idade <= 30 ){

                System.out.println("Por favor digite o seu peso");
                peso = sc.nextDouble();
                lista21a30.add(peso);

                Iterator<Double> iterator3 = lista21a30.iterator();
                while(iterator3.hasNext()) {
                    Double number = iterator3.next();
                    sum21a30 += number;
                }

                p++;

            }
            if( idade > 30 ){

                System.out.println("Por favor digite o seu peso");
                peso = sc.nextDouble();
                listaMariores30.add(peso);


                Iterator<Double> iterator4 = listaMariores30.iterator();
                while(iterator4.hasNext()) {
                    Double number = iterator4.next();
                    sumMaiores30 += number;
                }

                p++;

            }
        }


        System.out.println("A média das pessoas na faixa etária de 1 a 10 anos é de: " + sum1a10/lista1a10.size());
        System.out.println("A média das pessoas na faixa etária de 11 a 20 anos é de: " + sum11a20/lista11a20.size());
        System.out.println("A média das pessoas na faixa etária de 21 a 30 anos é de: " + sum21a30/lista21a30.size());
        System.out.println("A média das pessoas na faixa etária de maiores que 30 anos é de: " + sumMaiores30/listaMariores30.size());



    }
}

