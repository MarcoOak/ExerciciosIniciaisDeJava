package aulas.Produto;

import java.lang.reflect.Array;

public class Produto {
    public double Preço;
    public String Nome;

    public Produto(){}
    public Produto(String nome,double preço)
    {
        this.Nome=nome;
        this.Preço=preço;
    }
    public  String GetName()
    {
        return (this.Nome);
    }
    public double GetPreço()
    {
        return(this.Preço);
    }
    public void SetName(String nome)
    {
        this.Nome=nome;

    }
    public void SetPreço(double preço)
    {
        this.Preço=preço;

    }

}

