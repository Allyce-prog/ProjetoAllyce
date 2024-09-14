import java.util.Arrays;

public class Cliente {
    public String nome;
    public long cpf;
    private Computador[] computadores;

    public Cliente(String nome, long cpf, Computador[] computadores) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = computadores != null ? computadores : new Computador[0];
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador computador : this.computadores) {
            computador.mostraPCConfigs();
            total += computador.preco;
        }
        return total;
    }
}
