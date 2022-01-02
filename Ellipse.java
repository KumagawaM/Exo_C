public class Ellipse extends Forme{
    protected double rayonA, rayonB;

    public Ellipse(double rayonA, double rayonB) {
        super("Ellipse",rayonA, rayonB);

    }

    public double getFormePerimetre(){
        return Math.PI*rayonA*rayonB;
    }
}
