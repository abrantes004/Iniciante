package aula09;
public class Cavalo extends Mamifero implements AnimalDomestico {
    @Override
    public void alimentar(){
        System.out.println("O cavalo está se alimentando");
        
    }
    @Override
    public void levarVeterinario(){
        System.out.println("O cavalo vai ao veterinário");
    }
    @Override
    public void chamarVeterinario(){
        System.out.println("Ligue para o veterinario");
    }
}
