import java.util.Scanner;

public class calc{
public static void main(String[]args){
    System.out.println("Ciao!");
    System.out.println("Benvenuto sulla calcolatrice fisica di base");
    System.out.println();

    String op;
    double forza1;
    double forza2;
    double massa;
    double gravita;
    double forza;
    double forzatotale;
    double forza_peso;
    double forza_elastica;
    double costante_elastica;
    double spostamento;
    double forza_di_attrito;
    double forza_di_attrito_statico;
    double forza_di_attrito_dinamico;
    double forza_premente;
    double forza_parallela;
    double mu_s;
    double mu_d;
    double altezza;
    double lunghezza;
    double base;

    // Lista dei funzioni
    System.out.println("Seleziona con i letteri minuscoli");
    System.out.println("[a] per calcolare FORZA TOTALE");
    System.out.println("[b] per calcolare FORZA PESO");
    System.out.println("[c] per calcolare MASSA");
    System.out.println("[d] per calcolare GRAVITA'");
    System.out.println("[e] per calcolare FORZA ELASTICA");
    System.out.println("[f] per calcolare COSTANTE ELASTICA");
    System.out.println("[g] per calcolare SPOSTAMENTO");
    System.out.println("[h] per calcolare FORZA DI ATTRITO (STATICO)");
    System.out.println("[i] per calcolare FORZA DI ATTRITO (DINAMICO)");
    System.out.println("[j] per calcolare FORZA PREMENTE");
    System.out.println("[k] per calcolare FORZA PARALLELA");

    // DICHIARAZIONE PER IL INPUT USING SYSTEM (SCANNER)
    Scanner scrivi = new Scanner(System.in);

    System.out.print("Seleziona: ");
    op = scrivi.next();

    switch (op) {
        case "a":
        System.out.print("Immettere il valore di FORZA 1: ");
        forza1 = scrivi.nextDouble();
        System.out.print("Immettere il valore di FORZA 2: ");
        forza2 = scrivi.nextDouble();
        forzatotale = forza1 + forza2;
        System.out.print("Il tuo risultato e' "+forzatotale+" N");           
            break;
        case "b":
        System.out.print("Immettere il valore di MASSA: ");
        massa = scrivi.nextDouble();
        System.out.print("Immettere il valore di GRAVITA': ");
        gravita = scrivi.nextDouble();
        forza_peso = massa * gravita;
        System.out.print("Il tuo risultato e' "+forza_peso+" N");           
            break;
        case "c":
        System.out.print("Immettere il valore di FORZA PESO: ");
        forza_peso = scrivi.nextDouble();
        System.out.print("Immettere il valore di GRAVITA': ");
        gravita = scrivi.nextDouble();
        massa = forza_peso / gravita;
        System.out.print("Il tuo risultato e' "+massa+" kg");           
            break;
        case "d":
        System.out.print("Immettere il valore di FORZA PESO: ");
        forza_peso = scrivi.nextDouble();
        System.out.print("Immettere il valore di FORZA MASSA: ");
        massa = scrivi.nextDouble();
        gravita = forza_peso / massa;
        System.out.print("Il tuo risultato e' "+gravita+" N/kg");           
            break;
        case "e":
        System.out.print("Immettere il valore di COSTANTE ELASTICA: ");
        costante_elastica = scrivi.nextDouble();
        System.out.print("Immettere il valore di SPOSTAMENTO: ");
        spostamento = scrivi.nextDouble();
        forza_elastica = costante_elastica *spostamento;
        System.out.print("Il tuo risultato e' "+forza_elastica+" N");           
            break;
        case "f":
        System.out.print("Immettere il valore di FORZA ELASTICA: ");
        forza_elastica = scrivi.nextDouble();
        System.out.print("Immettere il valore di SPOSTAMENTO: ");
        spostamento = scrivi.nextDouble();
        costante_elastica = forza_elastica / spostamento;
        System.out.print("Il tuo risultato e' "+costante_elastica+" N/m");           
            break;
        case "g":
        System.out.print("Immettere il valore di FORZA ELASTICA: ");
        forza_elastica = scrivi.nextDouble();
        System.out.print("Immettere il valore di COSTANTE ELASTICA: ");
        costante_elastica = scrivi.nextDouble();
        spostamento = forza_elastica / costante_elastica;
        System.out.print("Il tuo risultato e' "+spostamento+" m");           
            break;
        case "h":
        System.out.print("Immettere il valore di MU STATICO: ");
        mu_s = scrivi.nextDouble();
        System.out.print("Immettere il valore di FORZA PREMENTE: ");
        forza_premente = scrivi.nextDouble();
        forza_di_attrito_statico = mu_s * forza_premente;
        System.out.print("Il tuo risultato e' "+forza_di_attrito_statico+" N");           
            break;
        case "i":
        System.out.print("Immettere il valore di MU DINAMICO: ");
        mu_d = scrivi.nextDouble();
        System.out.print("Immettere il valore di FORZA PREMENTE: ");
        forza_premente = scrivi.nextDouble();
        forza_di_attrito_dinamico = mu_d * forza_premente;
        System.out.print("Il tuo risultato e' "+forza_di_attrito_dinamico+" N");           
            break;
        case "j":
        System.out.print("Immettere il valore di FORZA PESO: ");
        forza_peso = scrivi.nextDouble();
        System.out.print("Immettere il valore di PARALLELA: ");
        forza_parallela = scrivi.nextDouble();
        forza_premente = Math.sqrt(Math.pow(forza_peso, 2)-Math.pow(forza_parallela, 2));
        System.out.print("Il tuo risultato e' "+forza_premente+" N");           
            break;
        case "k":
        System.out.print("Immettere il valore di FORZA PESO: ");
        forza_peso = scrivi.nextDouble();
        System.out.print("Immettere il valore di ALTEZZA: ");
        altezza = scrivi.nextDouble();
        System.out.print("Immettere il valore di LUNGHEZZA: ");
        lunghezza = scrivi.nextDouble();
        forza_parallela = forza_peso*altezza/lunghezza;
        System.out.print("Il tuo risultato e' "+forza_parallela+" N");           
            break;
    
        default:
        System.out.println(
            "Ricontrolla i tuoi dati, forse c'e qualche errore, Grazie"
        );
            break;
    }
    System.out.println();
    System.out.println("Grazie per usare la nostra calcolatrice, Ci vedremo piu' presto possibile!");
    }
}
