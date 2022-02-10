package aulas.Funcionario;

import java.util.Scanner;

public class ProjFuncionario {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        Funcionario F1;
        F1= new Funcionario();

        System.out.println("Nome");
        F1.nome=sc.nextLine();

        System.out.println("Salario");

        F1.salariobruto=sc.nextDouble();

        System.out.println("Imposto");
        F1.imposto=sc.nextDouble();


        System.out.printf("Nome : " +F1.nome+" ,Salario : "+F1.salariobruto+" ,Imposto : "+F1.imposto+" Salario Liquido: "+F1.SalarioLiquido());
        System.out.print("Aumento de Salario:");
        F1.aumento=sc.nextDouble();

        System.out.printf("Nome : " +F1.nome+" Salario com o aumento: "+F1.Aumento());

    }

}


