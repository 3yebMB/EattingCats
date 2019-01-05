package Theme5;

public class Dishes {
    private Bowls[] bowls;

    public Dishes(Bowls...bowls) {
        this.bowls = bowls;
    }

    public void fill(float...f){
        int i=0;
        for (Bowls b : bowls) {
            b.fillingBowl(f[i++]);
        }
    }

    public void feed(OurCats ourCats) {
        int i=0;
        for (CatFamily c : ourCats.getCats()){
                bowls[i++].emptyingBowl(c);
        }
    }

}
