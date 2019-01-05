package Theme5;

public class Main {
    public static void main(String[] args) {
        OurCats ourCats = new OurCats(new Cat("Тимон", 430), new Cat("Алиса", 280),
                          new Cat("Бегемот", 450));
        Dishes dishes = new Dishes(new Dish(450), new Dish(300), new Dish(500));
        dishes.fill(460, 300, 400); // в первую миску кладём больше еды, чем может поместиться
        dishes.feed(ourCats); // кормим котиков
        ourCats.showInfoAboutCat(); // выводим информацию о сытости котиков
        dishes.fill(110, 111, 123); // добавляем еды в миски
        dishes.feed(ourCats); // снова предлагаем котикам поесть...
                              // последний котик, голодный после первой кормёшки, наконец-то сыт! Ура!!!

    }
}
