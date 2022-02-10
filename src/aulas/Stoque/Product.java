package aulas.Stoque;

public class Product {

        public String nome;
        public double preco;
        public int quant;
        public int entrada;
    public int saida;



    public double Total(){

            return (preco * quant);
        }
    public double AddProduct(){
quant=quant+entrada;
        return quant ;
    }
    public double RemoveProduct(){
quant=quant-saida;
        return quant;
    }



}
