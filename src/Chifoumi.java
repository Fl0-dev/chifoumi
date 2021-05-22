/**
 * Enumération des possibilités
 * d'un Chifoumi
 * et sa méthode pour déterminer qui bat l'autre
 */
public enum Chifoumi {
    PIERRE,
    FEUILLE,
    CISEAUX;

    /**
     * méthode qui permet de savoir si l'énumération courante
     * est au dessus de l'énumération passé en paramètre
     * @param chifoumi énumération
     * @return boolean true si victoire
     */
    public boolean bats(Chifoumi chifoumi){
        boolean gagne = false;
        switch (Chifoumi.this){
            case CISEAUX :
                    if(chifoumi == Chifoumi.FEUILLE){
                        gagne = true;
                    } else{
                        gagne = false;
                    }
            break;
            case PIERRE :  
                if (chifoumi == Chifoumi.CISEAUX){
                    gagne = true;
                } else{
                    gagne = false;
                }
                break;
            case FEUILLE : if (chifoumi == Chifoumi.PIERRE){
                gagne = true;
            } else{
                gagne = false;
            }
        }
        return gagne;
    }

}
