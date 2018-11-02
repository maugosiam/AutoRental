public class WypozyczalniaAut {

    public WypozyczalniaAut() {
    }

    Car[] wypozyczAuto(Car car[]){
        for(int i = 0; i<10; i++){
            if(car[i].wypozyczony == false && car[i].kolor == "granatowy" ){
                car[i].wypozyczony = true;
                System.out.println("\n-----------------------------\nOd tego momentu wypożyczony/a jest: "+car[i].kolor+" "+car[i].marka+" o numerach rejestracyjnych: "+car[i].nrRejestracyjny);
            }
        }
        return car;
    }

    Car[] zwrocAuto(Car car[]){
        for(int i = 0; i<car.length; i++){
            if(car[i].wypozyczony == true && car[i].marka == "Toyota" ){
                car[i].wypozyczony = false;
                System.out.println("\n-----------------------------\nWłaśnie zwrócono auto marki: "+car[i].marka+" o numerach rejestracyjnych: "+car[i].nrRejestracyjny);
            }
        }
        return car;
    }

    Car[] dodajAutoDoWypozyczalni(Car car[], Car noweAuto) {
        Car[] newCar = new Car[car.length + 1];
        for (int i = 0; i < car.length; i++) {
            newCar[i] = car[i];
        }
        newCar[newCar.length - 1] = noweAuto;
        //car = newCar;
        System.out.println("\n-----------------------------\nWłaśnie dodano do bazy nowe auto: "+car[car.length-1]+"\n");
        return newCar;
    }


}
