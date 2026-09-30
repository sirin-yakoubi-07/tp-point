package tp1;

public class point {
    private int abscisse;
    private int ordonnee;
    private String nom;

    public point(String n, int x, int y) {
        nom = n;
        abscisse = x;
        ordonnee = y;
    }

    public point(int x, int y) {
        this("SansNom", x, y);
    }

    public point(String n) {
        this(n, 0, 0);
    }

    public void Affiche() {
        System.out.println(this.nom + " (" + this.abscisse + ", " + this.ordonnee + ")");
    }

    public void TranslHoriz(int d) {
        abscisse += d;
    }

    public void TranslVert(int d) {
        ordonnee += d;
    }

    public void Translation(int d, int c) {
        ordonnee += d;
        abscisse += c;
    }
    public boolean Coincide(point p) {
        if (p == null) return false;
        return this.abscisse == p.abscisse && this.ordonnee == p.ordonnee;
    }

    public String getNom() {
        return nom;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnée() {
        return ordonnee;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setAbscisse(int a) {
        this.abscisse = a;
    }

    public void setOrdonnée(int a) {
        this.ordonnee = a;
    }

    public static void main(String[] args) 
    {
        point p1 = new point(3, 5); 
        point p2 = new point("a"); 
        point p3 = new point("b", 3, 5); 

        System.out.println("\n ---------------------------\n"); 
        System.out.println("les points créés sont :"); 
        p1.Affiche(); 
        p2.Affiche();
        p3.Affiche(); 
        System.out.println("\n ---------------------------\n"); 
        if (p1.Coincide(p3) == true) 
        System.out.println("Les 2 points p1 et p3 coïncident"); 
        else 
        System.out.println("Les 2 points ne coïncident pas");

        System.out.println("\n ---------------------------\n"); 
        System.out.println("translation des point "); 
        p1.TranslHoriz(4); 
        p2.TranslVert(3); 
        p3.Translation(5, 2); 
        p1.Affiche(); 
        p2.Affiche(); 
        p3.Affiche(); 

        System.out.println("\n ---------------------------\n"); 
        System.out.println("modification des attributs des points"); 
        p1.setNom("SRI21"); 
        p2.setAbscisse(25); 
        p3.setOrdonnée(50); 
        p1.Affiche(); 
        p2.Affiche(); 
        p3.Affiche(); 

        System.out.println("\n ---------------------------\n"); 
        System.out.println("utilisation des méthodes get"); 
        String x = p1.getNom(); 
        int y = p1.getAbscisse(); 
        int z = p1.getOrdonnée(); 
        System.out.println(" le nom du point p1 est : " + x); 
        System.out.println(" son abscisse est : " + y); 
        System.out.println(" son ordonnée est : " + z); 
    }
}