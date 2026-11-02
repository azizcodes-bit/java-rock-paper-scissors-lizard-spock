public class Spieler {
 String name;
 String aktion;
 int rundensiege;
 public Spieler(String name){this.name=name;}
 public String getName(){return name;}
 public String getAktion(){return aktion;}
 public int getRundensiege(){return rundensiege;}
 public void setName(String name){this.name=name;}
 public void setAktion(String aktion){this.aktion=aktion;}
 public void erhoeheRundensiege(){rundensiege++;}
}