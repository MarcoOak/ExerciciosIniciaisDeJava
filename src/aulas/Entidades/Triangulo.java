package aulas.Entidades;

public class Triangulo {
    public double LA;
    public double LB;
    public double LC;

    public double Area()
    {
        double b = (LA+LB+LC)/2;
        double a = Math.sqrt((b+(b-LA)+ (b-LB)+(b-LC)));
        return a;
    }
}
