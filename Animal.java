package aula08;
public class Animal {
    public String nome;
    private String cor;
    private int peso;
    
    public void setNome(String parametro_nome){
        this.nome = parametro_nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCor(String parametro_cor){
        this.cor = parametro_cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setPeso(int parametro_peso){
        this.peso = parametro_peso;
    }
    public int getPeso(){
        return this.peso;
    }
}
