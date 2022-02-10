package aulas.Entidades;
import java.util.Scanner;
public class projTriangulo {


        public static void main(String[] args) {
            Scanner sc=new Scanner((System.in));
            Triangulo t1,t2,t3;
            t1= new Triangulo();
            t2= new Triangulo();
            t3= new Triangulo();

            System.out.println(("1ºtriangulo"));
            System.out.println("Lado A");
            t1.LA=sc.nextDouble();

            System.out.println("Lado B");
            t1.LB=sc.nextDouble();

            System.out.println("Lado C");
            t1.LC=sc.nextDouble();


            System.out.printf("A area do triangulo9 é: %.2f%n",t1.Area());

        }

}
