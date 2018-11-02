import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Car car[] = new Car[10];
        car[0] = new Car("Ford", "ZSD 123456", "czerwony", 4, 12342, LocalDate.of(2017, 10, 10), false);
        car[1] = new Car("Mitsubishi", "DW 123456", "srebrny", 5, 12992, LocalDate.of(2016, 12, 24), false);
        car[2] = new Car("Lamborgini", "ZSD 000056", "złoty", 5, 12992, LocalDate.of(2014, 9, 3), false);
        car[3] = new Car("Fiat", "DOA 12888", "czarny", 5, 12911, LocalDate. of(2019, 12, 24), true);
        car[4] = new Car("VolksWagen", "DWR 123456", "niebieski", 5, 12988, LocalDate.of(2017, 4, 6), true);
        car[5] = new Car("Fiat", "DWR 123456", "niebieski", 5, 12988, LocalDate.of(2010, 12, 12), false);
        car[6] = new Car("VolksWagen", "DWR 123456", "biały", 5, 12988, LocalDate.of(2019, 1, 10), false);
        car[7] = new Car("Opel", "DWR 123456", "szary", 5, 12988, LocalDate.of(2018, 11, 30), false);
        car[8] = new Car("Toyota", "DWR 878787", "różowy", 5, 12988, LocalDate.of(2017, 12, 12), true);
        car[9] = new Car("VolksWagen", "DWR 123456", "granatowy", 5, 12988, LocalDate.of(2019, 03, 03), false);

        DrukowanieListy drukowanieListy = new DrukowanieListy();
        drukowanieListy.metodaDrukowanieListy(car);

        WypozyczalniaAut wypozyczalniaAut = new WypozyczalniaAut();
        car = wypozyczalniaAut.wypozyczAuto(car);
        car = wypozyczalniaAut.zwrocAuto(car);

        Car newCar = new Car ("Tra la la", "XYZ 00000", "teczowy", 13, 0, LocalDate.of(2019, 03, 03), false);

        car = wypozyczalniaAut.dodajAutoDoWypozyczalni(car, newCar);

        drukowanieListy.metodaDrukowanieListy(car);
    }
}