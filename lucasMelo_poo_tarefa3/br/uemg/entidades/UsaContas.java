package br.uemg.entidades;

public class UsaContas {
    
    public static void main(String[] args) {


        //incluir dados relativos a(s) conta(s) do cliente
        ContaBancaria conta = new ContaBancaria("Lucas Melo", 1599293, (float)596.10);
        ContaPoupanca poupanca = new ContaPoupanca("Lucas Melo", 1599293, (float)150.60, 16);
        ContaEspecial especial = new ContaEspecial("Lucas Melo", 1599293, (float)1780, 400);

        System.out.println();
        System.out.println("IMPRIMINDO AS CONTAS: ");
        imprimir(conta, poupanca, especial);


        //sacar um determinado valor de sua(s) conta(s)
        //sacar valor disponivel  valor->100.00
        System.out.println("--SACANDO 100.00 --");
        System.out.println(conta.sacar(100));
        System.out.println(poupanca.sacar(100));
        System.out.println(especial.sacar(100));
        imprimir(conta, poupanca, especial);
        //sacar valor não disponível  valor->2000.00
        System.out.println("--SACANDO 3000.00 --");
        System.out.println(conta.sacar(3000));
        System.out.println(poupanca.sacar(3000));
        System.out.println(especial.sacar(3000));
        imprimir(conta, poupanca, especial);


        //Depositar um determinado valor na(s) sua(s) conta(s)
        System.out.println("--DEPOSITANDO 1000.00 --");
        System.out.println(conta.depositar(1000));
        System.out.println(poupanca.depositar(1000));
        System.out.println(especial.depositar(1000));
        imprimir(conta, poupanca, especial);


        //Mostrar o novo saldo do cliente, a parti da taxa de rendimento,daquele que possuem conta poupança
        System.out.println("-- ADICIONANDO REDIMENTO DA POUPANÇA (0.05)--");
        System.out.println(poupanca);
        poupanca.calcularNovoSaldo((float)0.05);
        System.out.println(poupanca);

        //Mostra os dados da(s) conta(s) de um cliente
        System.out.println();
        System.out.println("IMPRIMINDO AS CONTAS: ");
        imprimir(conta, poupanca, especial);

    }

    public static void imprimir(ContaBancaria conta, ContaBancaria poupanca, ContaBancaria especial){
        System.out.println(conta);
        System.out.println(poupanca);
        System.out.println(especial);
        System.out.println();
    }
}
