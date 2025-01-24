import java.util.Scanner;

public class checkGuestBonus {
    public static void main(String[] args) {
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Favorisca nome e cognome dell'invitato");
        String anagraficaInvitato = scan.nextLine();

        int i = 0;
        while(i < listaInvitati.length){
            if(listaInvitati[i].equals(anagraficaInvitato)){
                System.out.println("Puoi accedere alla festa");
                return;
            }

            i++;
        }

        System.out.println("Non sei presente nella lista, non sei stato invitato");
    }
}
