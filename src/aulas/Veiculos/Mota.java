package aulas.Veiculos;

public class Mota {
    public String Marca;
    public String Modelo;
    public double Custo;
    public String Combustivel;
    public Mota(){}
    public Mota(String marca,String modelo,double custo,String combustivel)
    {
        this.Marca=marca;
        this.Modelo=modelo;
        this.Custo=custo;
        this.Combustivel=combustivel;
    }
    public  String GetMarca()
    {
        return (this.Marca);
    }
    public String GetModelo()
    {
        return(this.Modelo);
    }
    public double GetCusto()
    {
        return(this.Custo);
    }
    public void SetMarca(String marca)
    {
        this.Marca=marca;

    }
    public void SetModelo(String modelo)
    {
        this.Modelo=modelo;

    }
    public void SetCusto(double custo)
    {
        this.Custo=custo;


    }
    public String GetCombustivel()
    {
        return(this.Combustivel);
    }
    public void SetCombustivel(String combustivel)
    {
        this.Combustivel=combustivel;

    }
}
