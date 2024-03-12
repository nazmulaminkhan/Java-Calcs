import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Unit of measure converter");
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

        System.out.print("Write what you want to convert from what: for exmple 'km to m' you need to write like this 'kmtm': ");
        op = enter.next();

        switch (op){
            case "kmtm":
                System.out.print("Enter km: ");
                km = enter.nextDouble();
                m = km * 1000;
                System.out.println(km+" km in meter is --> "+m+" m");
                break;
            case "hmtm":
                System.out.print("Enter hm: ");
                hm = enter.nextDouble();
                m = hm * 100;
                System.out.println(hm+" hm in meter is --> "+m+" m");
                break;
            case "decmtm":
                System.out.print("Enter Decm: ");
                decm = enter.nextDouble();
                m = decm * 10;
                System.out.println(decm+" Decm in meter is --> "+m+" m");
                break;
            case "dmtm":
                System.out.print("Enter dm: ");
                dm = enter.nextDouble();
                m = dm / 10;
                System.out.println(dm+" dm in meter is --> "+m+" m");
                break;
            case "cmtm":
                System.out.print("Enter cm: ");
                cm = enter.nextDouble();
                m = cm / 100;
                System.out.println(cm+" cm in meter is --> "+m+" m");
                break;
            case "mmtm":
                System.out.print("Enter mm: ");
                mm = enter.nextDouble();
                m = mm / 1000;
                System.out.println(mm+" mm in meter is --> "+m+" m");
                break;
        }

    }
}
