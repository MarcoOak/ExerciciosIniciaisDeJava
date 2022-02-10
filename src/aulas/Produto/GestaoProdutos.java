package aulas.Produto;

import java.util.Scanner;

public class GestaoProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Numero De Produtos : ");
        int N =sc.nextInt();
        sc.nextLine();
        Produto[] produtos = new Produto[N];
       for(int i =1;i<=N;i++)
       {
           System.out.print("Nome do"+ i + "º Produto");
           String nome=sc.nextLine();
           System.out.print("Preço do"+ i + "º Produto");
           double preço=sc.nextDouble();
           sc.nextLine();
           Produto p =new Produto(nome,preço);
           produtos[i-1]= p ;

       }
       double total=0;
       for(int i=0;i<N;i++)
       {
           System.out.println("Produto "+ (i+1)+": "+ produtos[i].GetName());
           total +=produtos[i].GetPreço();
       }
       double media=total/N;
       System.out.printf("Media dos Produtos . %2f%n",media);



    }
}
