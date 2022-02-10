package aulas.ex7;

public class Aluno {
    public String Nome;
    public int[] Notas;
    public int Alunos3Neg=0;

    public Aluno(){}
    public Aluno(String nome,int[] notas)
    {
        this.Nome=nome;
        this.Notas=notas;
    }
    public double Media()
    {
        double total = 0;
        for(int i=0;i<Notas.length;i++) {
            total+=Notas[i];

        }
        return (total/Notas.length);
    }
    public int NNegativas()
    {
        int nneg=0;
        for(int i =0;i<Notas.length;i++)
            if(Notas[i]<10) nneg++;
            return nneg;

    }
    public String GetNome()
    {
        return (this.Nome);
    }
    public int[] GetNotas()
    {
        return (this.Notas);
    }
    public void SetNotas(int[] notas)
    {
        this.Notas=notas;
    }
    public void SetNome(String nome)
    {
        this.Nome=nome;
    }

    public String toString(){
        String s=this.Nome;
        for(int i=0;i<Notas.length;i++)
            s += Notas[i]+",";
        s +=",Media"+this.Media();
        s +=", Nº Negativas: "+this.NNegativas();
        return s;
    }
    }

