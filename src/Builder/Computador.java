package Builder;

import java.security.InvalidParameterException;

public class Computador {

    private String processador;
    private String memoriaRam;
    private String hd;
    private String ssd;
    private String fonte;
    private String placaDeVideo;

    public Computador(Builder builder) {
        this.processador = builder.processador;
        this.memoriaRam = builder.memoriaRam;
        this.hd = builder.hd;
        this.ssd = builder.ssd;
        this.fonte = builder.fonte;
        this.placaDeVideo = builder.placaDeVideo;
    }

    public String getProcessador() { return processador; }
    public String getMemoriaRam() { return memoriaRam; }
    public String getHd() { return hd; }
    public String getSsd() { return ssd; }
    public String getFonte() { return fonte; }
    public String getPlacaDeVideo() { return placaDeVideo; }

    @Override
    public String toString() {
        return "Computador {" +
                "\nProcessador: " + processador +
                "\nMemória RAM: " + memoriaRam +
                "\nHD: " + hd +
                "\nSSD: " + ssd +
                "\nFonte: " + fonte +
                "\nPlaca de Vídeo: " + placaDeVideo +
                "}";
    }

    public static class Builder {

        private String processador;
        private String memoriaRam;
        private String hd;
        private String ssd;
        private String fonte;
        private String placaDeVideo;

        public Builder processador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder memoriaRam(String memoriaRam) {
            this.memoriaRam = memoriaRam;
            return this;
        }

        public Builder hd(String hd) {
            this.hd = hd;
            return this;
        }

        public Builder ssd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder fonte(String fonte) {
            this.fonte = fonte;
            return this;
        }

        public Builder placaDeVideo(String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public Computador build() {
            if (processador == null || processador.isEmpty()) {
                throw new InvalidParameterException("O processador é obrigatório");
            }

            return new Computador(this);
        }
    }
}