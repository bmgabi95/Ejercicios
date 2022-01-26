package objectpool;

public class Principal {

	  public static void main(String[] args) {

	    //Obtenemos el Reusable del pool
	    Reusable reusable = ReusablePool.getInstance().acquire();

	    //Se usa
	    reusable.doSomeWork();

	    //Se libera
	    ReusablePool.getInstance().release(reusable);

	  }
	}
