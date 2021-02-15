public class BonusMilesService {
    public int calculate(int costTicket) {

        int bonus = 20_00;
        int miles = costTicket / bonus;
        System.out.println(miles);

        return miles;
    }
}
