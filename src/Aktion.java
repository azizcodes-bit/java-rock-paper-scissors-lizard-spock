public class Aktion {
 private static final String[] AKTIONEN={"Schere","Echse","Papier","Spock","Stein"};
 private static final int N=5;
 public static String getAktion(int index){return index>=0&&index<N?AKTIONEN[index]:"";}
 public static boolean istGueltigeAktion(String aktion){
  return aktion.equals("Schere")||aktion.equals("Echse")||aktion.equals("Papier")||aktion.equals("Spock")||aktion.equals("Stein");
 }
 public static int getIndex(String aktion){
  for(int i=0;i<N;i++)if(istGueltigeAktion(aktion)&&aktion.equals(AKTIONEN[i]))return i;
  return -1;
 }
 public static Spieler werGewinnt(Spieler s1,Spieler s2){
  int diff=(getIndex(s2.getAktion())-getIndex(s1.getAktion())+N)%N;
  if(getIndex(s2.getAktion())==getIndex(s1.getAktion()))return null;
  return diff<=N/2?s1:s2;
 }
}