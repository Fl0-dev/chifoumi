/**
 * Méthode exécutable qui permet de tester grâce à la méthode bats()
 * les possibilitées dans un chifoumi
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("%s est il plus fort que %s ?%n",Chifoumi.CISEAUX,Chifoumi.FEUILLE);
        System.out.println(Chifoumi.CISEAUX.bats(Chifoumi.FEUILLE)?"OUI":"NON");
        System.out.printf("%s est il plus fort que %s ?%n",Chifoumi.CISEAUX,Chifoumi.PIERRE);
        System.out.println(Chifoumi.CISEAUX.bats(Chifoumi.PIERRE)?"OUI":"NON");
        System.out.printf("%s est il plus fort que %s ?%n",Chifoumi.FEUILLE,Chifoumi.PIERRE);
        System.out.println(Chifoumi.FEUILLE.bats(Chifoumi.PIERRE)?"OUI":"NON");
    }
}
