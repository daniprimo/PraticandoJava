package ExercicioTelevisão;

import java.util.Objects;

public class Canal {

    private double canal;
    private String nomeDoCanal;

    Canal (double canal, String nomeCanal){
        this.canal = canal;
        this.nomeDoCanal = nomeCanal;
    }

    public String getNomeDoCanal() {
        return nomeDoCanal;
    }

    public void setNomeDoCanal(String nomeDoCanal) {
        this.nomeDoCanal = nomeDoCanal;
    }

    public double getCanal() {
        return canal;
    }

    public void setCanal(double canal) {
        this.canal = canal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Canal canal1 = (Canal) o;
        return Double.compare(canal1.canal, canal) == 0 && Objects.equals(nomeDoCanal, canal1.nomeDoCanal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canal, nomeDoCanal);
    }
}
