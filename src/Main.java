public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService ();
        int price = 7345;
        int miles = service.calculate(price);
        System.out.print("Количество бонусных миль: ");
        System.out.println(miles);

    }
}