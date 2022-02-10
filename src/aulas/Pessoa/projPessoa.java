package aulas.Pessoa;

import java.util.Scanner;

public class projPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Numero De Pessoas : ");
        int N = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoas = new Pessoa[N];
        double pesomax=0;
        double alturamax=0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Nome da" + i + "º Pessoa");
            String nome = sc.nextLine();
            System.out.println("Peso da" + i + "º Pessoa");
            double peso =
                    sc.nextDouble();
            sc.nextLine();
            System.out.println("Altura da" + i + "º Pessoa");
            double altura = sc.nextDouble();
            sc.nextLine();
            if(peso>pesomax)
                pesomax=peso;
            if(altura>alturamax)
                alturamax=altura;
            Pessoa p = new Pessoa(nome, peso, altura);
            pessoas[i - 1] = p;
       }
        double totalPeso = 0;
        double totalAltura = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Pessoa " + (i + 1) + ": " + pessoas[i].GetName());
            totalPeso += pessoas[i].GetPeso();
            totalAltura += pessoas[i].GetAltura();
        }
        double mediaPeso = totalPeso / N;
        double mediaAltura = totalAltura / N;

        System.out.printf("Media de Peso  %.2f%n", mediaPeso);
        System.out.printf("Media de Altura  %.2f%n", mediaAltura);
        System.out.printf("Peso Maximo %.2f%n",pesomax);
        System.out.printf("Altura Maximo %.2f%n",alturamax);

    }
    }
