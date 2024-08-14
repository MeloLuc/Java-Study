package br.uemg.entidades;

public class ContaPoupanca extends ContaBancaria{

    private int diaDeRendimento; 

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaDeRendimento){
        super(cliente, num_conta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }
    
    public float calcularNovoSaldo(float taxaRendimento) { 
        this.depositar(this.getSaldo() * taxaRendimento);
        return this.getSaldo();
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca [diaDeRendimento=" + diaDeRendimento + ", Cliente()=" + getCliente()
                + ", Num_conta()=" + getNum_conta() + ", Saldo()=" + getSaldo() + "]";
    }
}
