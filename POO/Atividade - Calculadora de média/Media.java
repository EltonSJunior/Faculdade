package media;

public class Media {

    private double notaLab;
    private double notaAva;
    private double notaExame;
    private double media;

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotaLab() {
        return this.notaLab;
    }

    public void setNotaLab(double notaLab) {
        this.notaLab = notaLab;
    }

    public double getNotaAva() {
        return this.notaAva;
    }

    public void setNotaAva(double notaAva) {
        this.notaAva = notaAva;
    }

    public double getNotaExame() {
        return this.notaExame;
    }

    public void setNotaExame(double notaExame) {
        this.notaExame = notaExame;
    }

    public double calcPeso(double nota, double peso){
        return nota * peso;
    }

    public double calcMedia() {
        media = calcPeso(getNotaAva(), 0.3) +
                calcPeso(getNotaExame(), 0.5) +
                calcPeso(getNotaLab(), 0.2);
        return media;
    }

    public char calcConceito(double media) {
        if (media >= 0 && media <= 5) {
            return 'E';
        } else if (media > 5 && media <= 6) {
            return 'D';
        } else if (media > 6 && media <= 7) {
            return 'C';
        } else if (media > 7 && media <= 8) {
            return 'B';
        } else if (media > 8 && media <= 10) {
            return 'A';
        }
        return ' ';
    }
}
