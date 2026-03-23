public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
       private String situacao;
       
       
       public Alunos()
        {
          nome="";
          nota1=0;
          nota2=0;
          media=0;
          situacao="";
        }
       
       public String getNome(){
           return this.nome;
       }
       
       public void setNome(String nome){
           this.nome = nome;
       }
       
       public Double getNota1(){
           return this.nota1;
       }
       
       public void setNota1(Double nota1){
           this.nota1 = nota1;
       }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
       
       public Double getMedia(){
          return this.media;
       }
       
       public String getSituacao(){
           return this.situacao;
       }
       
       
       public void calcularMedia(){
           media = (nota1 + nota2)/2;
           
           if(media>=6){
               situacao = "Aprovado";
           }else
           {
               situacao = "Reprovado";
           }
       }
       
}
