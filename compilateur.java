package rpc;

import java.io.File;
import java.io.FileNotFoundException;

/*	Etapes:
	1- Ecrire un programme
	2- Lire un fichier texte
	3- Ecrire un fichier texte
	4- Comprendre l'interface
	5- Ecrire stub et skeleton
*/
public class compilateur {
 public static void main(String[] arg) throws FileNotFoundException {
	 //1) lire un fichier txt :
	File doc =new File("C:\\Users\\hp\\Desktop\\test.txt");
	java.util.Scanner lecteur ;
	lecteur = new java.util.Scanner(doc);
	 while (lecteur.hasNextLine()) {
         System.out.println(lecteur.nextLine());
     }
 }
}
