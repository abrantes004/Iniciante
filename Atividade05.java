package atividade05;
public class Atividade05 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa ();
        Funcionario f = new Funcionario ();
        Cliente c = new Cliente ();
            
        p.setNome("João");
        p.setIdade(30);
        p.setNaturalidade("Tocantins");
        
        f.setNome("Junior");
        f.setIdade(20);
        f.setNaturalidade("Bahia");
        
        c.setNome("Ana Maria");
        c.setIdade(40);
        c.setNaturalidade("Roraima");
        p.nm();
        System.out.println(p.getNome());
        p.nt();
        System.out.println(p.getNaturalidade());
        p.id();
        System.out.println(p.getIdade());
        f.cargo();
        System.out.println(f.getNome() +"\n" +f.getIdade() +"\n" +f.getNaturalidade());
        c.cargo();
        System.out.println(c.getNome() +"\n" +c.getIdade() +"\n" +c.getNaturalidade());

    
    
    }
            
}
