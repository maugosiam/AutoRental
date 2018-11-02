import java.time.LocalDate;

public class Car {
    String marka;
    String nrRejestracyjny; //do rozszerzenia na koleją klasę skłądającą się ze strina i liczby
    String kolor;
    int liczbaMiejsc;
    int przebiegWkm;
    LocalDate dataOstatniegoPrzegladu;
    boolean wypozyczony;

    public Car(String marka, String nrRejestracyjny, String kolor, int liczbaMiejsc, int przebiegWkm, LocalDate dataOstatniegoPrzegladu, boolean wypozyczony) {
        this.marka = marka;
        this.nrRejestracyjny = nrRejestracyjny;
        this.kolor = kolor;
        this.liczbaMiejsc = liczbaMiejsc;
        this.przebiegWkm = przebiegWkm;
        this.dataOstatniegoPrzegladu = dataOstatniegoPrzegladu;
        this.wypozyczony = wypozyczony;
    }


    public String toString(){
        return "Marka: "+marka +", Numer rejestracyjny: "+ nrRejestracyjny+", Kolor: "+kolor+", Liczba miejsc: "+liczbaMiejsc+", Przebieg: "+przebiegWkm+" Data Ostatniego przeglądu: "+dataOstatniegoPrzegladu+", Wypożyczony: "+wypozyczony;
    }

    public boolean czyPrzegladWazny(){
        if (dataOstatniegoPrzegladu.isAfter(LocalDate.now())){
            return false;
        }
        else return true;
    }
}
