import java.util.Scanner;
public class Spiel {
 private static Scanner sc=new Scanner(System.in);
 public static void main(String[] args){
  int eingabe;
  do{
   System.out.println("Schere-Stein-Papier-Echse-Spock");
   do{
    System.out.println("1 - Spielen");
    System.out.println("2 - Programm beenden");
    eingabe=liesZahl(sc);
   }while(!checkEingabeMenu(eingabe));
   if(eingabe==1)dasSpiel();
  }while(eingabe!=2);
  sc.close();
 }
 public static boolean checkEingabeMenu(int eingabe){return eingabe==1||eingabe==2;}
 public static void dasSpiel(){
  System.out.println("Geben Sie den Namen des Spielers ein :");
  Spieler spieler=new Spieler(sc.nextLine());
  Computer c=new Computer();
  do{
   String aktion;
   do{
    System.out.println(spieler.getName()+" gib eine Aktion an (Schere ,Papier, Stein, Echse, Spock) :");
    aktion=sc.nextLine();
    spieler.setAktion(aktion);
   }while(!Aktion.istGueltigeAktion(spieler.getAktion()));
   c.setAktion();
   System.out.println("Computer waehlt Aktion "+c.getAktion());
   if(Aktion.werGewinnt(spieler,c)==null)System.out.println("Die Runde endet unentschieden.");
   else if(Aktion.werGewinnt(spieler,c)==spieler){
    System.out.println(spieler.getName()+"hat diese Runde gewonnen.");
    spieler.erhoeheRundensiege();
   }else{
    System.out.println(c.getName()+"hat diese Runde gewonnen.");
    c.erhoeheRundensiege();
   }
   System.out.println("Aktueller Stand :");
   System.out.println(spieler.getName()+": "+spieler.getRundensiege());
   System.out.println(c.getName()+": "+c.getRundensiege());
  }while(spieler.getRundensiege()<3&&c.getRundensiege()<3);
  System.out.println("Ergebnis :");
  if(spieler.getRundensiege()>c.getRundensiege())
   System.out.println(spieler.getName()+" hat mit "+spieler.getRundensiege()+": "+c.getRundensiege()+"gewonnen");
  else System.out.println(c.getName()+" hat mit "+c.getRundensiege()+": "+spieler.getRundensiege()+"gewonnen");
 }
 private static int liesZahl(Scanner scanner){
  while(true)try{return Integer.parseInt(scanner.nextLine().trim());}
  catch(NumberFormatException e){System.out.println("Bitte eine ganze Zahl eingeben.");}
 }
}