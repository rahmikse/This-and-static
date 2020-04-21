package sunum;

public class ÖrnekSayacı {
	private static int Örnek_no = 0;

	   protected static int getMiktar() {
	      return Örnek_no;
	   }

	   private static void addÖrnek() {
	      Örnek_no++;
	   }

	   ÖrnekSayacı() {
	      ÖrnekSayacı.addÖrnek();
	   }

	   public static void main(String[] arguments) {
	      System.out.println("Başlangıçda  " + ÖrnekSayacı.getMiktar() + " Örnek");

	      for (int i = 0; i < 500; ++i) {
	         new ÖrnekSayacı();
	      }
	      System.out.println("Oluşturulan " + ÖrnekSayacı.getMiktar() + " Örnek");
	   }
	}

