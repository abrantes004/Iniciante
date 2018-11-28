package atividade05;
public class Pessoa {
    private String nome;
    private String naturalidade;
    private int idade;
        
        public void setNome (String p_nome){
            this.nome = p_nome;
        }
        public String getNome (){
            return this.nome;
        }
        public void setNaturalidade (String p_naturalidade){
            this.naturalidade = p_naturalidade;
        }
        public String getNaturalidade (){
            return this.naturalidade;
        }
        public void setIdade (int p_idade){
            this.idade = p_idade;
        }
        public int getIdade(){
            return this.idade;
        }
        public void id(){
            System.out.println("\nIdade: ");
        }
        public void nm(){
            System.out.println("Nome: ");
        }
        public void nt(){
            System.out.println("\nNatural de(a): ");
        }
}
