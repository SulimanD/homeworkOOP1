// 1. Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
// 2. Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
// 3. В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
// 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре


public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Шмузе", 60.0));
        itemMachin.addProduct(new Product("Капучино", 50.0));
        itemMachin.addProduct(new Product("Капучино- Итальяно", 40.0));
        itemMachin.addProduct(new Product("Спрайт", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachin.addProduct(new HotDrink("Капучино", 130.0, 400, 55.0));
        itemMachin.addProduct(new HotDrink("Латте", 190.0, 350, 60.0));
        itemMachin.addProduct(new HotDrink("Какао", 60.0, 300, 80.0));

        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
       
    }
}