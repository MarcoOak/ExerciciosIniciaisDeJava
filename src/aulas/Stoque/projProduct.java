package aulas.Stoque;
import java.util.Scanner;
public class projProduct {


    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        Product P1;
        P1= new Product();

        System.out.println("Nome");
        P1.nome=sc.nextLine();

        System.out.println("Preço");

        P1.preco=sc.nextDouble();

        System.out.println("Quantidade");
        P1.quant=sc.nextInt();


        System.out.printf("Nome : " +P1.preco+" ,Preço por unidade : "+P1.preco+" ,Quantidade : "+P1.quant+" Preço do Stoque : "+P1.Total());
        System.out.println("Quantas unidades entraram no stoque:");
        P1.entrada=sc.nextInt();
        P1.AddProduct();
        System.out.printf("Nome : " +P1.preco+" ,Preço por unidade : "+P1.preco+" ,Quantidade : "+P1.quant+" Preço do Stoque : "+P1.Total());
        System.out.println("Quantas unidades vendidas no stoque:");
        P1.saida=sc.nextInt();
        P1.RemoveProduct();
        System.out.printf("Nome : " +P1.preco+" ,Preço por unidade : "+P1.preco+" ,Quantidade : "+P1.quant+" Preço do Stoque : "+P1.Total());

    }

}
