package aulas.ex7;

import java.util.ArrayList;

public class Turma {
    public String Designaçao;


    public ArrayList<Aluno> Alunos;

    public Turma (){}
    public Turma (String designaçao,ArrayList<Aluno> alunos){
        this.Designaçao=designaçao;
        this.Alunos=(ArrayList<Aluno>)alunos.clone();

    }
    public double MediaTurma()
    {
        int total=0;
        for(Aluno a: Alunos)
        {
            total+=a.Media();
        }
        return (total/Alunos.size());
    }
    public int Mais3Negas()
    {
        int totalALunos=0;
        for(Aluno a: Alunos) {
           if(a.NNegativas()>=3)
               totalALunos++;
        }
        return  totalALunos;
    }
    public double MediaMaisAlta()
    {
        double mediaMaisAlta=0;
        for(Aluno a:Alunos) {
            if(a.Media()>mediaMaisAlta)
                mediaMaisAlta=a.Media();
        }
        return  mediaMaisAlta;
    }
    public String GetDesignaçao()
    {
        return (this.Designaçao);
    }
    public void SetDesignaçao(String designaçao)
    {
        this.Designaçao=designaçao;
    }
    public ArrayList<Aluno> getAlunos(){return this.Alunos;}
    public void setAlunos(ArrayList<Aluno> alunos){
        this.Alunos=(ArrayList<Aluno>)alunos.clone();
    }





}
