package game.wuerfel;

import java.util.Scanner;

public class Wuerfel {     //Klassen-Definition
    public static void main(String[] args) {   //Start-Methode
        new Wuerfel().run();
    }
    
    public void run() { //Ablauf-Methode
        int sysRanNum = 0;       //Zufallszahl des Systems
        int userTipp = 0;        //Benutzereingabe
        final int maxRound = 3;  //max. Rundenanzahl
        int sysScore = 0;        //Rundengewinne des Systems
        int userScore = 0;       //Rundengewinne des Benutzers
        
        System.out.println("Auf geht's zum lustigen Würfelspiel.\n");
        System.out.println("Rate welche Augenzahl ich gewürfelt habe!\n");
        System.out.println("=========================================\n\n\n");
        
        int actRound = 0;        //aktuelle Runde
        do {
            actRound++;
            sysRanNum = (int) (Math.random() * 6 + 1);
            System.out.println("So, ich habe gewürfelt. Jetzt bist du mit deinem Tipp dran.");
            
            userTipp = new Scanner(System.in).nextInt();
            System.out.println("\nTja, Ich habe eine " + sysRanNum + " gewürfelt.");
            
            if (sysRanNum > userTipp) {
                sysScore++;
                System.out.println("Und damit habe ICH die Runde " + actRound + " gewonnen. :)");
            } else if (sysRanNum == userTipp) {
                System.out.println("Gleichstand. Keiner von uns beiden hat die Runde " + actRound + " gewonnen.");
            } else if (sysRanNum < userTipp) {
                System.out.println("Mist. Die Runde " + actRound + " hast du gewonnen.");
                userScore++;
            }
            if (actRound < maxRound) {
                System.out.println("\nLos! Auf ein Neues.");
            }
        } while (actRound < maxRound);
        
        System.out.println("\nIch denke es reicht. Der Endstand ist: " + sysScore + ":" + userScore);
        if (sysScore > userScore) {
            System.out.println("Ich habe das Spiel gewonnen.");
        } else if (sysScore == userScore) {
            System.out.println("Gleichstand. Keiner von uns beiden hat das Spiel gewonnen.");
        } else if (sysScore < userScore) {
            System.out.println("Du hast das Spiel gewonnen. ");
        }
    }
}