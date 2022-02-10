package aulas.Notas;

import java.util.Scanner;

public class projNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        Notas N1;
        N1 = new Notas();

        System.out.println("Nota 1");
        N1.Nota1 = sc.nextDouble();
        if(N1.Nota1>30) {
            System.out.print("Nota 1 tem o valor maximo de 30");
            System.exit(0);
        }
        System.out.println("Nota 2");

        N1.Nota2 = sc.nextDouble();

        System.out.println("Nota 3");
        N1.Nota3 = sc.nextDouble();
        if(N1.Nota2>35) {
            System.out.print("Nota 2 tem o valor maximo de 35");
            System.exit(0);
        }
        if(N1.Nota3>35) {
            System.out.print("Nota 3 tem o valor maximo de 35");

        }
        System.out.printf("Nota Total : " + N1.NotaFinal());
        if (N1.NotaFinal() < 60) {
            System.out.printf("Nao Esta Aprovado, Nota Final : " + N1.NotaFinal());
            System.out.print("Faltam: " + N1.PontosQueFaltam());
        }
        else {
            System.out.printf("Esta Aprovado, Nota Final : " + N1.NotaFinal());
        }
    }
    }
