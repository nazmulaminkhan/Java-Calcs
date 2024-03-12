import java.util.Scanner;

public class soloalmetro {
    public static void main(String[] args){
        System.out.println("Ciao tutti!");
        System.out.println("Convertitore per le unita di misure");
        System.out.println();

        String op;
        double Tm;
        double Gm;
        double Mm;
        double km;
        double hm;
        double decm;
        double m;
        double dm;
        double cm;
        double mm;
        double micm;
        double nm;

        Scanner enter = new Scanner(System.in);

        System.out.print("Scegli quale unita vuoi cambiare a quale scrivendo cosi, ad es: 'km al m' benisso devi scirvere cosi 'kmalm': ");
        op = enter.next();

        switch (op){
            case "kmalm":
                System.out.print("Immettere km: ");
                km = enter.nextDouble();
                m = km * 1000;
                System.out.println(km+" km in metro è --> "+m+" m");
                break;
            case "hmalm":
                System.out.print("Immettere hm: ");
                hm = enter.nextDouble();
                m = hm * 100;
                System.out.println(hm+" hm in metro è --> "+m+" m");
                break;
            case "decmalm":
                System.out.print("Immettere Decm: ");
                decm = enter.nextDouble();
                m = decm * 10;
                System.out.println(decm+" Decm in metro è --> "+m+" m");
                break;
            case "dmalm":
                System.out.print("Immettere dm: ");
                dm = enter.nextDouble();
                m = dm / 10;
                System.out.println(dm+" dm in metro è --> "+m+" m");
                break;
            case "cmalm":
                System.out.print("Immettere cm: ");
                cm = enter.nextDouble();
                m = cm / 100;
                System.out.println(cm+" cm in metro è --> "+m+" m");
                break;
            case "mmalm":
                System.out.print("Immettere mm: ");
                mm = enter.nextDouble();
                m = mm / 1000;
                System.out.println(mm+" mm in è --> "+m+" m");
                break;
        }

    }
}
