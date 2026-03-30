
public class Pessoas {
 private String nome;
 private String sexo;
 private int idade;
 private int meses;
 
 public Pessoas(String nome, String sexo, int idade){
     this.nome = nome;
     this.sexo = sexo;
     this.idade = idade;
 }
 
 public String getNome(){
     return this.nome;
 }
 
 public void setNome(String nome){
     this.nome = nome;
 }
 
 public String getSexo(){
     return this.sexo;
 }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
 
    public void viraMeses(){
        this.meses = this.idade * 12;
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}

