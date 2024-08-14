package br.uemg.entidades;

public class ContaBancaria {
    
    private String cliente;
    private int num_conta;
    private float saldo;
    
    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    //método sacar(o saldo não pode ficar negativo)
    public boolean sacar(float valor) {

        if(valor < 0){
            return false; //tratando para não receber valores negativos.
        }

        if(valor > this.saldo){
            return false;
        }
        this.saldo = this.saldo - valor;
        return true;   
    }

    //método depositar
    public boolean depositar(float valor) {
        if(valor >= 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [cliente=" + cliente + ", Num_conta=" + num_conta + ", Saldo=" + saldo + "]";
    }
        
}
