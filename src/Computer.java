import java.util.Random;
public class Computer extends Spieler {
 protected static Random rd=new Random();
 public Computer(){super("Computer");}
 public void setAktion(){super.setAktion(Aktion.getAktion(rd.nextInt(5)));}
}