package aula09;
public class Gato extends Mamifero implements AnimalDomestico, AnimalEstimacao{
    String raca;
    @Override
    public void alimentar(){
        System.out.println("O gato está se alimentado");
    }
    @Override
    public void levarVeterinario(){
        System.out.println("Levar o gato ao veterinário");
    }
    @Override
    public void chamarVeterinario(){
        System.out.println("Ligue para o Veterinario");
    }

    @Override
    public void brincar() {
        System.out.println("O gato está brincando");
    }

    @Override
    public void levarPassear() {
        System.out.println("Leve o gato para passear");
    }

}
