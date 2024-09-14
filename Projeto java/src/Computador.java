import java.util.Arrays;

public class Computador {
    public String marca;
    public float preco;
    private MemoriaUSB memoriaUsb;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwareBasico;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico[] hardwareBasico) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasico = hardwareBasico != null ? hardwareBasico : new HardwareBasico[0];
    }

    public void mostraPCConfigs() {
        System.out.println("-----------------");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        if (memoriaUsb != null) {
            System.out.println("Memória USB: " + memoriaUsb.nome + " - Capacidade: " + memoriaUsb.capacidade + "GB");
        } else {
            System.out.println("Nenhuma Memória USB conectada.");
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " - Tipo: " + sistemaOperacional.tipo);
        System.out.println("Hardware Básico:");
        for (HardwareBasico hb : hardwareBasico) {
            System.out.println(" - " + hb.nome + " " + hb.capacidade);
        }
        System.out.println("-----------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUsb = musb;
    }
}
