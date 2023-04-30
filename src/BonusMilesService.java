public class BonusMilesService {
    public int calculate(int price) {
        int rubPerMile = 20; // кол-во рублей для одной бонусной мили
        return price / rubPerMile; // кол-во выдаваемых бонусных милей
    }
}
