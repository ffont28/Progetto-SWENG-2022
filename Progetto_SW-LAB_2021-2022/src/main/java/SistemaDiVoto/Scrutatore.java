package SistemaDiVoto;

/**
 * OVERVIEW: Si tratta di una versione embrionale della classe Scrutatore finale. L'idea è quella di dare una visione generica del comportamento degli oggetti Scrutatore.
 *           Le istanze di questa classe rappresentano uno scrutatore di una sessione di voto.
 *           Ogni scrutatore ha un nome, cognome, e id (univoco). 
 *           Per poter accedere come come scrutatore al sistema bisogna loggarsi con l'identità elettronica e inserire il codice di conferma associato a quello scrutatore.
 *           (La fase di login sarà gestita da istanze apposite ad ora non implementate).
             Lo scrutatore ha diverse funzioni (si veda documento RASD). Ad ora le funzioni vengono accennate a livello implementativo e quindi non sono le versioni finali.
 */
public class Scrutatore {
    
    //ATTRIBUTI
    /**Rappresentano il nome, cognome e id dello scrutatore. id è univoco per ogni scrutatore (cod.fiscale)*/
    private String name, surname, id; 
    /**Rappresentano la fase di login dello scrutatore*/
    private String username, password, otp;

    //COSTRUTTORI
    /**
     * La fase di costruzione dell'oggetto si basa sulla verifica del login. 
     * Se l'autenticazione è corretta l'oggetto viene istanziato assegnando a this.name, this.surname, e this.id il nome, cognome, e id associati allo username. 
     * 
     * In questa fase di progettazione il costruttore non verifica di ciò che è stato scritto poiché siamo i  una fase embrionale 
     * 
     * (Condizioni non definitive)
     * @param username non nulli
     * @param password non nulli
     * @param otp non nulli 
     */
    public Scrutatore(String username, String password, String otp){
        this.username = username;
        this.password = password;
        this.otp = otp;     
    }

    //METODI

    /**
     * 
     * @return this.name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * @return this.surname.
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * 
     * @return this.id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setta l'ora di inizio e fine della sessione di voto: Si veda RASD.
     */
    public void setTimeSession(){
        /**do thing */
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
    public void chooseVote(){
        /**do thing */
    }

    /**
     * Permette allo scrutatore di scegliere la modalità del vincitore: Si veda RASD.
     */
    public void chooseMode(){
        /**do thing */
    }

    /**
     * Inserisce i partiti, gruppi e candidati nella lista da votare: Si veda RASD.
     */
    public void inserGroup(){
        /**do thing */
    }

    /**
     * Consente la visione del risultato nell'interfaccia: Si veda RASD.
     */
    public void showResult(){
        /**do thing */
    }
}

