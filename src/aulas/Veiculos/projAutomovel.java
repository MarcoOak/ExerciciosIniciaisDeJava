package aulas.Veiculos;

import jdk.nashorn.internal.objects.annotations.Where;

import java.util.Scanner;

public class projAutomovel {
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        double custoTotalAuto = 0;
        double custoTotalMota = 0;
        String Marcamin="";
        String ModeloMin="";
        String MarcaMotamin="";
        String ModeloMotaMin="";
        System.out.println("Numero De Automovel : ");
        int A = sc.nextInt();
        sc.nextLine();
        Automovel[] automoveis = new Automovel[A];
        double automovelmin=999999999;
        double motamin=999999999;

        for (int i = 1; i <= A; i++) {
            System.out.println("Marca do" + i + "º Automovel");
            String marca = sc.nextLine();
            System.out.println("Modelo do" + i + "º Automovel");
            String modelo =
                    sc.nextLine();

            System.out.println("Preço do" + i + "º Automovel");
            double custo = sc.nextDouble();
            sc.nextLine();
            System.out.println("Combustivel do" + i + "º Automovel");
            String combustivel = sc.nextLine();
            if(custo<automovelmin) {
                automovelmin = custo;
                ModeloMin=modelo;
                Marcamin=marca;
            }




            Automovel a = new Automovel(marca, modelo, custo,combustivel);
            automoveis[i - 1] = a;
        }
        System.out.println("Numero De Motas : ");
        int M = sc.nextInt();
        sc.nextLine();
        Mota[] motas = new Mota[M];


        for (int i = 1; i <= M; i++) {
            System.out.println("Marca da" + i + "º Mota");
            String marca = sc.nextLine();
            System.out.println("Modelo da" + i + "º Mota");
            String modelo =
                    sc.nextLine();

            System.out.println("Preço da" + i + "º Mota");
            double custo = sc.nextDouble();
            sc.nextLine();
            System.out.println("Combustivel da" + i + "º Mota");
            String combustivel = sc.nextLine();
            if(custo<motamin) {
                motamin = custo;
                ModeloMotaMin=modelo;
                MarcaMotamin=marca;
            }

            Mota m = new Mota(marca, modelo, custo,combustivel);
            motas[i - 1] = m;
        }

        for (int i = 0; i < A; i++) {
            System.out.println("Automovel " + (i + 1) + ": " + automoveis[i].GetMarca()+",Modelo "+automoveis[i].GetModelo());
            custoTotalAuto += automoveis[i].GetCusto();

        }
        for (int i = 0; i < M; i++) {
            System.out.println("Motas " + (i + 1) + ": " + motas[i].GetMarca()+" "+motas[i].GetModelo());
            custoTotalMota += motas[i].GetCusto();

        }


        System.out.println("Custo Minimo de um Automovel "+automovelmin+" Marca : "+Marcamin+" Modelo :"+ModeloMin);

        System.out.println("Custo Minimo de uma Mota "+motamin+" Marca : "+MarcaMotamin+" Modelo :"+ModeloMotaMin);

        System.out.printf("Custo Total dos Automoveis %.2f%n",custoTotalAuto);

        System.out.printf("Custo Total dos Mota %.2f%n",custoTotalMota);
        System.out.printf("Custo Total dos Veiculos %.2f%n",(custoTotalMota+custoTotalAuto));

    }



}
