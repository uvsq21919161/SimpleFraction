class fraction {

    int numerateur;
    int denominateur;

    fraction (int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    fraction (int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
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

    public fraction add (fraction autreFraction) {
        int num = (this.numerateur * autreFraction.denominateur) + (autreFraction.numerateur * this.denominateur);
        int den = this.denominateur * autreFraction.denominateur;
        return new fraction(num, den);
    }

    public boolean equal(fraction autre) {
        if (this.doubleValue() == autre.doubleValue()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void compare(fraction autre) {
        if (this.doubleValue() == autre.doubleValue()) {
            System.out.println(this.toString() + autre.toString() + " ont la même valeur.");
        }
        else if (this.doubleValue() > autre.doubleValue()) {
            System.out.println(this.toString() + " est plus grand que " + autre.toString() + ".");
        }
        else {
            System.out.println(this.toString() + " est plus petit que " + autre.toString() + ".");
        }
    }

    @Override
    public String toString() {
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

        fraction fraction1 = new fraction(3, 4);
        assert fraction1.toString().equals("3/4") : "Erreur : Constructeur avec numérateur et dénominateur";

        fraction fraction2 = new fraction(5);
        assert fraction2.toString().equals("5/1") : "Erreur : Constructeur avec seulement le numérateur";
        
        fraction fraction3 = new fraction();
        assert fraction3.toString().equals("0/1") : "Erreur : Constructeur sans arguments";

        System.out.println("Tests des constructeurs réussis.");

        fraction doublefrac = new fraction(5, 8);
        double valeurEnDouble = doublefrac.doubleValue();
        assert valeurEnDouble == 0.625 : "Erreur : la valeur en double est incorrecte";

        System.out.println("Tests du double réussi.");

        fraction frac = new fraction(1, 2);
        fraction frac2 = new fraction(1, 3);
        fraction addfrac = frac.add(frac2);
        assert addfrac.toString().equals("5/6") : "Erreur : la valeur de l'addition est incorrecte.";
        System.out.println("Tests de l'addition réussi.");

        fraction frac3 = new fraction(1, 2);
        fraction frac4 = new fraction(1, 2);
        boolean egaux = frac3.equal(frac4);
        assert egaux : "Les valeurs ne sont pas égaux2.";
        assert frac3.toString().equals(frac4.toString()): "Les valeurs ne sont pas égaux.";
        System.out.println("Tests de l'égalité réussi.");

        frac.compare(frac2);

    }
}