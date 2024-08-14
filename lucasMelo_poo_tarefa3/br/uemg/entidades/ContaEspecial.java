package br.uemg.entidades;

public class ContaEspecial extends ContaBancaria{
    
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite){
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {

        if(valor < 0){
            return false; //tratando para não receber valores negativos.
        }


        if(valor > this.getSaldo()+this.limite){  // ultrapassando o disponível
            return false;
        }
        if(valor > this.getSaldo()) {  // dentro do disponível
            this.limite = this.limite - (valor - this.getSaldo());
            super.sacar(this.getSaldo());
            return true;
        }
        else {
            super.sacar(valor);
            return true;
        }
        
    }

    @Override
    public String toString() {
        return "ContaEspecial [limite=" + limite + ", Cliente()=" + getCliente() + ", Num_conta()="
                + getNum_conta() + ", Saldo()=" + getSaldo() + "]";
    }

   

}
