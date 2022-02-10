package aulas.Marco.Futebol;

public class Jogador {
    public String Nome;
    public int Idade;
    public String Morada;
    public int Peso;
    public int Altura;
    public int NCamisola;
    public String Posição;
    public int Renumeração;
    public Jogador(){}
    public Jogador(String nome,int idade,String morada,int peso,int altura,int nCamisola,String posição,int renumeração)
    {
        this.Nome=nome;
        this.Idade=idade;
        this.Morada=morada;
        this.Peso=peso;
        this.Altura=altura;
        this.NCamisola=nCamisola;
        this.Posição=posição;
        this.Renumeração=renumeração;

    }
    public double SalarioAnual()
    {
        return (Renumeração*14);
    }
    public double MassaCorporal()
    {
        return (Peso/Math.pow(Altura,2));
    }
    public String getNome()
    {
        return (this.Nome);
    }
    public int getIdade()
    {
        return (this.Idade);
    }
    public String getMorada()
    {
        return (this.Morada);
    }
    public double getPeso()
    {
        return (this.Peso);
    }
    public double getAltura()
    {
        return (this.Altura);
    }
    public int getNCamisola()
    {
        return (this.NCamisola);
    }
    public String getPosição()
    {
        return (this.Posição);
    }
    public double getRenumeração()
    {
        return (this.Renumeração);
    }
    public void setNome(String nome)
    {
        this.Nome=nome;
    } public void setIdade(int idade)
    {
        this.Idade=idade;
    } public void setMorada(String morada)
    {
        this.Morada=morada;
    } public void setPeso(int peso)
    {
        this.Peso=peso;
    } public void setAltura(int altura)
    {
        this.Altura=altura;
    } public void setNCamisola(int nCamisola)
    {
        this.NCamisola=nCamisola;
    } public void setPosição(String posição)
    {
        this.Posição=posição;
    } public void setRenumeração(int renumeração)
    {
        this.Renumeração=renumeração;
    }
    public String toString(){
        String s=this.Nome;

        s +=",Posição: "+this.Posição;
        s +=", Salario Anual:  "+this.SalarioAnual();
        s +=", Idade:  "+this.Idade;
        s+=", Indice Massa Corporal: "+this.MassaCorporal();
        return s;
    }


}
