package aula08;
public class Aula08 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Passaro d = new Passaro();
        c.setNome("Cachorro1");
        d.setNome("Bird");
        
        System.out.println(c.getNome());
        System.out.println(d.getNome());
        
        /*Animal cachorro = new  Animal();
        
        cachorro.setNome("Totó");
        cachorro.setCor("Amarelo");
        cachorro.setPeso(15);
        
        System.out.println(cachorro.getCor());
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getPeso());
    */
    }
    
}
