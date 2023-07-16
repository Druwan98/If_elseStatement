package exercises.If_elseStatement;

public class If_elseStatement {
    public static void main(String[] args) {
        //Usando if-else, stampa se il numero di lettere di myName è pari o dispari.
        String myName = "Claudio";

        if (myName.length() % 2 == 0){
            System.out.println("Il numero di lettere del mio nome è Pari");
        } else {
            System.out.println("Il numero di lettere del mio nome è Dispari");
        }

    }
}
