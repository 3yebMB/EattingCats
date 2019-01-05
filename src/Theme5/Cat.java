package Theme5;

public class Cat implements CatFamily {
    String name;
    float maxFood;
    boolean feeded = false;

    public Cat(String name, float maxFood) {
        this.name = name;
        this.maxFood = maxFood;
    }

    public void eat(float f){
        if (f==0)
            System.out.println("В миске нет еды!");
        else if (f>=maxFood) {
            System.out.println("Кот " + name + " наелся и в миске еще осталась еда.");
            feeded = true;
        }
        else
            System.out.println("Кот " + name + " поел, но всё ещё голоден.");
    }

    public boolean info(){
        return feeded;
    }

    public String getName(){
        return name;
    }

    public float getMaxFood(){
        return maxFood;
    }

}
