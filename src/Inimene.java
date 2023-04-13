import java.util.List;

public class Inimene {
    private String eesnimi;
    private String perenimi;
    private List<String> lasteNimed;

    public String getEesnimi() {
        return eesnimi;
    }

    public String getPerenimi() {
        return perenimi;
    }

    public List<String> getLasteNimed() {
        return lasteNimed;
    }

    public Inimene(String eesnimi, String perenimi, List<String> lasteNimed) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.lasteNimed = lasteNimed;
    }

    @Override
    public String toString() {
        return "Inimene{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perenimi='" + perenimi + '\'' +
                ", lasteNimed=" + lasteNimed +
                '}';
    }
}
