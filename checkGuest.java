import java.util.Scanner;

public class checkGuest{
    public static void main(String[] args) {
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Favorisca nome e cognome dell'invitato");
        String anagraficaInvitato = scan.nextLine();

        for (int i = 0; i < listaInvitati.length; i++) {
            
            if(listaInvitati[i].equals(anagraficaInvitato)){
                System.out.println("Puoi accedere alla festa");
                break;
            } else{
                System.out.println("Non puoi entrare, non sei nella lista invitati");
                break;
            }
        }

    }
}