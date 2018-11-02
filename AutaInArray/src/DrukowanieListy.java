public class DrukowanieListy {


    public DrukowanieListy() {
    }

    public void metodaDrukowanieListy(Car car[]) {
        for (int i = 1; i < car.length; i++) {
            System.out.println(car[i] + ", Czy przegląd ważny: " + car[i].czyPrzegladWazny());
        }
    }
}
