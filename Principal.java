package atividade06;
public class Principal {
    public static void main(String[] args) {
        Pessoa persona = new Pessoa();
        Funcionario trabalhador = new Funcionario();
        Cliente comprador = new Cliente();
        FuncionarioCliente funcli = new FuncionarioCliente();
        
        persona.setNome("Nome: Jõao Fonseca Barros");
        persona.setCpf("CPF: 003.646.884");
        persona.setRg("RG: 22.333.444");
        persona.setEndereco("END: Rua 14, quadra 163, lote 18, bairro portuga.");
        System.out.println(persona.getNome());
        System.out.println(persona.getCpf());
        System.out.println(persona.getRg());
        System.out.println(persona.getEndereco());
        
        trabalhador.setNome("\nNome de funcionário: Junior Santos Costa");
        trabalhador.setCpf("CPF: 222.333.444");
        trabalhador.setRg("RG: 23.434.23");
        trabalhador.setEndereco("END: Rua 25, n25, lote 40, bairro polenta.");
        funcli.setDescontoEspecial("Fúncionario têm 20% de desconto.");
        System.out.println(trabalhador.getNome());
        System.out.println(trabalhador.getCpf());
        System.out.println(trabalhador.getRg());
        System.out.println(trabalhador.getEndereco());
        System.out.println(funcli.getDescontoEspecial());
        trabalhador.salarioMensal();
        funcli.limiteCredito();
        funcli.preferencias();
        
        comprador.setNome("\nNome de cliente: Anibal Silva Santos");
        comprador.setCpf("CPF: 121.234.233");
        comprador.setRg("RG: 55.344.23");
        comprador.setEndereco("END: Rua 18, quadra 25, lote 1, bairro cachoeria.");
        System.out.println(comprador.getNome());
        System.out.println(comprador.getCpf());
        System.out.println(comprador.getRg());
        System.out.println(comprador.getEndereco());
        comprador.limiteCredito();
        comprador.preferencias();
    
    }
   
}
