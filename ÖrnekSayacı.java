package sunum;

public class �rnekSayac� {
	private static int �rnek_no = 0;

	   protected static int getMiktar() {
	      return �rnek_no;
	   }

	   private static void add�rnek() {
	      �rnek_no++;
	   }

	   �rnekSayac�() {
	      �rnekSayac�.add�rnek();
	   }

	   public static void main(String[] arguments) {
	      System.out.println("Ba�lang��da  " + �rnekSayac�.getMiktar() + " �rnek");

	      for (int i = 0; i < 500; ++i) {
	         new �rnekSayac�();
	      }
	      System.out.println("Olu�turulan " + �rnekSayac�.getMiktar() + " �rnek");
	   }
	}

