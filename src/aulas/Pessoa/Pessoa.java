package aulas.Pessoa;

public class Pessoa {
    public double Peso;
    public String Nome;
    public double Altura;

    public Pessoa(){}
    public Pessoa(String nome,double peso,double altura)
    {
        this.Nome=nome;
        this.Peso=peso;
        this.Altura=altura;
    }
    public  String GetName()
    {
        return (this.Nome);
    }
    public double GetPeso()
    {
        return(this.Peso);
    }
    public double GetAltura()
    {
        return(this.Altura);
    }
    public void SetName(String nome)
    {
        this.Nome=nome;

    }
    public void SetPreço(double peso)
    {
        this.Peso=peso;

    }
    public void SetAltura(double altura)
    {
        this.Altura=altura;


    }

}
