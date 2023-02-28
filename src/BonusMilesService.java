public class BonusMilesService {
    public int calculate(int price) {
        int rubAmount = 20;
        int bonusMiles = price / rubAmount;
        return bonusMiles;
    }


}