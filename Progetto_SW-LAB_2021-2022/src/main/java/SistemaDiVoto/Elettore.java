package SistemaDiVoto;

/**
 * OVERVIEW: Le istanze di questa classe rappresentano un elettore di una
 * sessione di voto. Questa classe estende la classe User assorbendone i
 * comportamenti e campi. Si tratta di una versione embrionale della classe
 * Elettore finale. L'idea è quella di dare una visione generica del
 * comportamento degli oggetti Elettore. Ogni elettore un votare una e una sola
 * volta. Le istanze sono mutabili.
 */
public class Elettore extends User {

    // Attributi
    /**
     * Rappresenta il voto dell'utente. vote = false allora l'utente non può votare
     */
    private boolean vote;

    // COSTRUTTORE
    /**
     * Costruisce un oggetto di tipo Elettore.
     * 
     */
    public Elettore(String name, String surname, String codFisc) {
        super(name, surname, codFisc);
        this.vote = true;
    }

    /**
     * Permette all'elettore di votare secondo la modalità consentita. Al termine di
     * tale metodo l'elettore verrà inibito della facoltà di votare, per consentire
     * il rispetto della regola: "ciascuno può espreimere al più un solo voto".
     */
    public void Vote() {
        /** do thing */
        /** inibisci facoltà di voto */
        this.vote = false;
        return;
    }

    @Override
    public String toString() {
        return "Elettore: " + this.surname + " " + this.name;
    }
}