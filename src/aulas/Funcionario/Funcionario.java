package aulas.Funcionario;

public class Funcionario {
    public String nome;
    public double salariobruto;
    public double imposto;
    public double aumento;

    public double SalarioLiquido(){
        return (salariobruto - imposto);
    }
    public double Aumento(){
        return (SalarioLiquido()+(salariobruto * aumento/100));
    }
}
