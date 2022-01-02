public class TestEllipseCercle {
    private int taille;
    private Cercle[] cercles;
    private Ellipse[] ellipses;

    public TestEllipseCercle(int taille) {
        this.taille = taille;
        this.cercles = new Cercle[taille];
        this.ellipses = new Ellipse[taille];
    }

    public void createEllipseCercle() {
        for(int i = 0; i < this.taille; i++) {
            this.cercles[i] = new Cercle((i+1)*1);
            this.ellipses[i] = new Ellipse((i+1)*1,(i+1)*2);
            Display(cercles[i]);
            Display(ellipses[i]);
        }

    }

    public String Display(Forme forme) {
        return "nous avons un objet de type : "+ forme.getType() +
        " de longueur : "+ forme.getLongueur() + " de largeur : "+ forme.getLargeur();
    }

    public void DisplayAll() {
        for(int i = 0; i < this.taille; i++) {
            Display(cercles[i]);
            Display(ellipses[i]);
        }
    }

    public Cercle[] getCercles() {
        return cercles;
    }

    public Ellipse[] getEllipses() {
        return ellipses;
    }

    public int getTaille () {
        return taille;
    }

    public static void main(String [] args) {
        TestEllipseCercle testEllipseCercle = new TestEllipseCercle(3);



    }
}
