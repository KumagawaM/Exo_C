public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        super("Cercle",rayon, rayon);
    }

    public double getFormePerimetre(){
        return Math.PI*Math.pow(rayon,2);
    }


}
