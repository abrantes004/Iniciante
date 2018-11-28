package atividade06;
public class FuncionarioCliente extends Funcionario implements CreditoPreferencias{
    private String descontoEspecial;
    
    protected void setDescontoEspecial(String parametro_descontoEspecial){
        this.descontoEspecial= parametro_descontoEspecial;
    }
    protected String getDescontoEspecial(){
        return this.descontoEspecial;
    }
    @Override
    public void limiteCredito(){
        System.out.println("Credito até r$ 1000,00");
    }
    @Override
    public void preferencias(){
        System.out.println("Costuma comprar: Móveis, bicicletas, eletroeletrónicos.");
    }
}    
