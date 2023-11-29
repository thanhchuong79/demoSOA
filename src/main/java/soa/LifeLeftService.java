package soa;

import java.time.Year;

public class LifeLeftService {
    private static final Integer ESPARANCE_VIE_HOMMES = 79;
    private static final Integer ESPARANCE_VIE_FEMMES = 85;

    String homme = "homme";
    String femme = "femme";

    Integer evDeReference = 0;

    public String anneeRestanteAVivre (String prenom, String sexe, Integer anneeNaissance){
        if (sexe.equals(homme)) evDeReference = ESPARANCE_VIE_HOMMES;
        else evDeReference = ESPARANCE_VIE_FEMMES;

        //Remarque, en ca de preobleme, vous pouvez changer Year,now().getValue() par Calendar.getInstance().get(Calendar.YEAR)
        Integer anneeRestantes = evDeReference - (Year.now().getValue() - anneeNaissance);
        return "Bonjour " + prenom + ", il vous reste" + anneeRestantes + " ans à vivre, profitez-en au maximum!";
    }
}
