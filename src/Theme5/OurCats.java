package Theme5;

public class OurCats {
    private CatFamily[] cats;

    public CatFamily[] getCats(){
        return cats;
    }

    public OurCats(CatFamily...cats) {
        this.cats = cats;
    }

    public void showInfoAboutCat(){
        for (CatFamily c : cats)
            if (c.info())
                System.out.println("Котик " + c.getName() + " сыт. Мяу!");
            else
                System.out.println("Котик " + c.getName() + " голодный.");
    }
}
