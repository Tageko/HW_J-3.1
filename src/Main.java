public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int costTicket = 15_000_99;
        int miles = service.calculate(costTicket);
        System.out.println(miles);


    }
}
