import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TravelCostCalculator {
    private List<Hotel> hotels3Star;
    private List<Hotel> hotels4Star;
    private List<Hotel> hotels5Star;
    private List<Museum> museums;

    public TravelCostCalculator() {
        hotels3Star = new ArrayList<>();
        hotels4Star = new ArrayList<>();
        hotels5Star = new ArrayList<>();
        museums = new ArrayList<>();


        hotels3Star.add(new Hotel("Hotel 1 Star 3", 250));
        hotels3Star.add(new Hotel("Hotel 2 Star 3", 300));
        hotels4Star.add(new Hotel("Hotel 3 Star 4", 350));
        hotels4Star.add(new Hotel("Hotel 4 Star 4", 400));
        hotels5Star.add(new Hotel("Hotel 5 Star 5", 450));
        hotels5Star.add(new Hotel("Hotel 6 Star 5", 500));


        museums.add(new Museum("Muzeum 1", 50));
        museums.add(new Museum("Muzeum 2", 60));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witamy w kalkulatorze wyjazdu ");
        System.out.println("Wybierz kategorię hotelu:");
        System.out.println("1. Hotel 3-gwiazdkowy");
        System.out.println("2. Hotel 4-gwiazdkowy");
        System.out.println("3. Hotel 5-gwiazdkowy");
        int hotelCategory = scanner.nextInt();

        List<Hotel> selectedHotels;
        switch (hotelCategory) {
            case 1:
                selectedHotels = hotels3Star;
                break;
            case 2:
                selectedHotels = hotels4Star;
                break;
            case 3:
                selectedHotels = hotels5Star;
                break;
            default:
                System.out.println("Nieprawidłowy wybór. Proszę wybrać ponownie.");
                return;
        }

        System.out.println("Dostępne hotele w wybranej kategorii:");
        for (int i = 0; i < selectedHotels.size(); i++) {
            System.out.println((i + 1) + ". " + selectedHotels.get(i));
        }
        System.out.println("Wybierz hotel wpisując jego numer:");
        int hotelChoice = scanner.nextInt() - 1;
        Hotel selectedHotel = selectedHotels.get(hotelChoice);

        System.out.println("Podaj liczbę noclegów w hotelu:");
        int nights = scanner.nextInt();
        System.out.println("Cena za hotel to " + selectedHotel.getPricePerNight() * nights);

        System.out.println();
        System.out.println("Teraz zapraszamy do wyboru muzeum ");
        System.out.println("Dostępne muzea:");
        for (int i = 0; i < museums.size(); i++) {
            System.out.println((i + 1) + ". " + museums.get(i));
        }
        System.out.println("Wybierz muzeum wpisując jego numer:");
        int museumChoice = scanner.nextInt() - 1;
        Museum selectedMuseum = museums.get(museumChoice);

        int totalCost = selectedHotel.getPricePerNight() * nights + selectedMuseum.getEntryFee();
        System.out.println("Całkowity koszt wyjazdu wynosi: " + totalCost + " PLN");

        scanner.close();
    }

    public static void main(String[] args) {
        TravelCostCalculator calculator = new TravelCostCalculator();
        calculator.start();
    }
}
