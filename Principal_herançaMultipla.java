package aula09;
public class Principal_herançaMultipla {
    public static void main(String[] args) {
        /*Animal a = new Animal();
        Ave av = new Ave();
        Papagaio pa = new Papagaio();
        a.emitirSom();
        av.emitirSom();
        av.Voar();
        pa.Voar();
        pa.emitirSom();*/
        Cavalo ca = new Cavalo();
        ca.alimentar();
        ca.chamarVeterinario();
        ca.levarVeterinario();
        Gato ga = new Gato();
        ga.amamentar();
        ga.alimentar();
        ga.chamarVeterinario();
        ga.levarVeterinario();
        ga.levarPassear();
        ga.brincar();
        Cachorro dog = new Cachorro();
        dog.alimentar();
        dog.brincar();
        dog.levarPassear();
        dog.levarVeterinario();
        dog.chamarVeterinario();
        dog.amamentar();
        Papagaio pag = new Papagaio ();
        pag.Voar();
    }
}
