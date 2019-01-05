package Theme5;

public class Dish extends Bowls {
    float volume;
    float foodInside;

    public Dish(float volume) {
        this.volume = volume;
    }

    public void emptyingBowl(CatFamily catFamily){
        if (!catFamily.info()){
            if ((foodInside-catFamily.getMaxFood()) >= 0) {
                catFamily.eat(foodInside);
                foodInside -= catFamily.getMaxFood();
            }
            else
                System.out.println("Для кота " + catFamily.getName() + " в миске недостаточно еды. Еда закончилась.");
        }
        else
            System.out.println("Котик " + catFamily.getName() + " сыт. В кормлении не нуждается... пока!");
    }

    @Override
    public void fillingBowl(float food) {
        if (volume-foodInside>=food)
            this.foodInside += food;
        else {
            System.out.println("Вы стараетесь положить большое кол-во еды в миску. Можно положить, только "+
                                volume + " будем считать, что столько и положено.");
            this.foodInside = volume;
        }
    }
}
