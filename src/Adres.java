import java.util.regex.Pattern;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, String numerDomu, String kodPocztowy, String miasto) {
        setUlica(ulica);
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
        setNumerDomu(numerDomu);
    }

    public String getUlica() {
        if (ulica == null){
            throw new IllegalArgumentException("ulica nie moze byc pusta ");
        }
        return ulica;
    }

    public String getNumerDomu() {
        Pattern pattern = Pattern.compile("^[0-9]+[a-zA-Z]*$");
        if (!pattern.matcher(numerDomu).matches()){
            throw new IllegalArgumentException("blad numerdomu")
        }
        return numerDomu;
    }

    public String getKodPocztowy() {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        if (!pattern.matcher(kodPocztowy).matches()){
            throw new IllegalArgumentException("blad kodpocztowy");
        }
        return kodPocztowy;
    }

    public String getMiasto() {
        if (miasto == null){
            throw new IllegalArgumentException("miasto nie moze byc puste ");
        }
        return miasto;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
