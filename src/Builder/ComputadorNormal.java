package Builder;

public class ComputadorNormal {

    public Computador criar() {
        return new Computador.Builder()
                .processador("Intel Core i3-12100")
                .memoriaRam("8GB DDR4")
                .ssd("256GB")
                .hd("Sem HD")
                .fonte("400W")
                .placaDeVideo("Vídeo Integrado")
                .build();
    }
}