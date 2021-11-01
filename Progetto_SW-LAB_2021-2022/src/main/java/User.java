/**
 * OVERVIEW: Le istanze di questa classe astratta rappresentano un utente del
 * sistema di voto. Un utente è identificato da un Nome e da un Cognome, e in
 * maniera univoca da un Codice Fiscale. Gli oggetti di questa classe sono
 * immutabili.
 */
public abstract class User {

    // CAMPI

    /** Rappresentano il nome, cognome e id (cod. fisc) dell'utente */
    public final String name, surname, codFisc;

    // COSTRUTTORI
    /**
     * Costruisce l'oggetto User tale: this.name = name this.surname = surname
     * this.codFisc = codFisc
     * 
     * @param name    il nome dell'utente. Non può essere NULL altrimenti solleva
     *                NullPointerException
     * @param surname il cognome dell'utente. Non può essere NULL altrimenti solleva
     *                NullPointerException
     * @param codFisc il Codice Fiscale dell'utente. Non può essere NULL altrimenti
     *                solleva NullPointerException
     */
    public User(String name, String surname, String codFisc) {
        this.name = name;
        this.surname = surname;
        this.codFisc = codFisc;
    }
}