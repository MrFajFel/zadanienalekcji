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

        return ulica;
    }

    public String getNumerDomu() {

        return numerDomu;
    }

    public String getKodPocztowy() {

        return kodPocztowy;
    }

    public String getMiasto() {

        return miasto;
    }

    public void setUlica(String ulica) {
        if (ulica == null){
            throw new IllegalArgumentException("ulica nie moze byc pusta ");
        }
        this.ulica = ulica;
    }

    public void setNumerDomu(String numerDomu) {
        Pattern pattern = Pattern.compile("^[0-9]+[a-zA-Z]*$");
        if (!pattern.matcher(numerDomu).matches()){
            throw new IllegalArgumentException("blad numerdomu");
        }
        this.numerDomu = numerDomu;
    }

    public void setKodPocztowy(String kodPocztowy) {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        if (!pattern.matcher(kodPocztowy).matches()){
            throw new IllegalArgumentException("blad kodpocztowy");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public void setMiasto(String miasto) {
        if (miasto == null){
            throw new IllegalArgumentException("miasto nie moze byc puste ");
        }
        this.miasto = miasto;
    }
}
