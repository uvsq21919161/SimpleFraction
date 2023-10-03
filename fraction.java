class fraction {

    int numerateur;
    int denominateur;

    fraction (int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    fraction (int numerateur) {
        this.numerateur = numerateur;
    }

    fraction () {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public int getNumerateur () {
        return this.numerateur;
    }

    public int getDenominateur () {
        return this.denominateur;
    }

    public double doubleValue() {
        return (double) this.numerateur/this.denominateur;
    }

    @Override
    public String toString() {
        System.out.println("Je suis une fraction.");
        return this.numerateur + "/" + this.denominateur;
    }
}

class main {

    final fraction Zero = new fraction();
    final fraction UN = new fraction(1,1);

    public static void main ( String [] args) {
        fraction MaFraction = new fraction(2,5);
        String x = MaFraction.toString();
        System.out.println(x);
        fraction Fraction2 = new fraction(5, 8);
        double valeurEnDouble = Fraction2.doubleValue();
        
        System.out.println(valeurEnDouble);
        assert valeurEnDouble == 0.625 : "nulle";
    }

    public static void test ( String [] args) {

        fraction fraction1 = new fraction(3, 4);
        assert fraction1.toString() == "3/4" : "Erreur : Constructeur avec numérateur et dénominateur";

        fraction fraction2 = new fraction(5);
        assert fraction2.toString() == "5/1" : "Erreur : Constructeur avec seulement le numérateur";

        fraction fraction3 = new fraction();
        assert fraction3.toString() == "0/1" : "Erreur : Constructeur sans arguments";

        System.out.println("Tests des constructeurs réussis.");

        fraction doublefrac = new fraction(5, 8);
        double valeurEnDouble = doublefrac.doubleValue();
        System.out.println(valeurEnDouble);
        assert valeurEnDouble == 0.625 : "Erreur : la valeur en double est incorrecte";
    }
}