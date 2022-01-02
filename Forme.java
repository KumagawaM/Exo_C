public abstract class Forme {
    protected double longueur;
    protected double largeur;
    protected String type;

    public Forme(String type, double longueur, double largeur) {
        this.type = type;
        this.longueur =  longueur;
        this.largeur = largeur;
    }

    public String getType() {
        return type;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return  largeur;
    }

    public abstract double getFormePerimetre();


}
