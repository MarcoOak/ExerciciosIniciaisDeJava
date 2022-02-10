package aulas.Notas;

public class Notas {
    public double Nota1;
    public double Nota2;
    public double Nota3;

    public double NotaFinal(){

        return (Nota1 + Nota2+Nota3);
    }
    public double PontosQueFaltam(){
        return(60-NotaFinal());
    }
}

