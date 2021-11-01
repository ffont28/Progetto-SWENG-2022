package SistemaDiVoto;

/**
 * OVERVIEW: Si tratta di una versione embrionale della classe Scrutatore finale. 
 *           Questa classe estende user e ne assorbe i comportamenti e attributi.
 *           L'idea è quella di dare una visione generica del comportamento degli oggetti Scrutatore. 
 *           Le istanze di questa classe rappresentano uno scrutatore di una sessione di voto.
 * 
 */
public class Scrutatore extends User {

    // COSTRUTTORI

    /**
     * Costruisce un oggetto Scrutatore passando a super i parametri.
     *
     *
     * (Condizioni non definitive) vedi super()
     */
    public Scrutatore(String name, String surname, String codFisc) {
        super(name, surname, codFisc);
    }

    // METODI

    /**
     * Setta l'ora di inizio e fine della sessione di voto: Si veda RASD.
     */
    public void setTimeSession() {
        /** do thing */
    }

    /**
     * Setta l'ora di inizio e fine della sessione di scrutinio: Si veda RASD.
     */
    public void setTimeBallot() {
        /** do thing */
    }

    /**
     * Permette allo scrutatore di scegliere la modalità di voto: Si veda RASD.
     */
    public void chooseVote() {
        /** do thing */
    }

    /**
     * Permette allo scrutatore di scegliere la modalità del vincitore: Si veda
     * RASD.
     */
    public void chooseMode() {
        /** do thing */
    }

    /**
     * Inserisce i partiti, gruppi e candidati nella lista da votare: Si veda RASD.
     */
    public void insertGroup() {
        /** do thing */
    }

    /**
     * Consente la visione del risultato nell'interfaccia: Si veda RASD.
     */
    public void showResult() {
        /** do thing */
    }

    @Override
    public String toString() {
        return "Scrutatore: " + this.surname + " " + this.name;
    }
}
