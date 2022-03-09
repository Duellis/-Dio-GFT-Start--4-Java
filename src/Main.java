
public class Main {
    public static void main(String[] args) {
        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");


        Conta cc = new ContaCorrente(eduardo);
        Conta cp = new ContaPoupanca(eduardo);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
