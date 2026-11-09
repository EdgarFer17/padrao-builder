package Builder;

public class ComputadorGamer {

    public Computador criar() {
        return new Computador.Builder()
                .processador("Intel Core i9-14900K")
                .memoriaRam("32GB DDR5")
                .ssd("1TB NVMe")
                .hd("2TB")
                .fonte("850W")
                .placaDeVideo("RTX 4080")
                .build();
    }
}