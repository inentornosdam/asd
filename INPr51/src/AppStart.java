
// TODO: Auto-generated Javadoc
/**
 * The Class AppStart.
 */
public class AppStart {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAlien a1=new MyAlien();
		System.out.println(a1.getHP());
		System.out.println(a1.getEstado());
		a1.shoot(50);
		
		System.out.println(a1.getHP());
		System.out.println(a1.getEstado());
		a1.shoot(100);
		
		System.out.println(a1.getHP());
		System.out.println(a1.getEstado());
		a1.healup(70);
		System.out.println(a1.getHP());
		
		System.out.printf("Total aliens creados: %d \n",MyAlien.getCont());
		System.out.printf("Disparos recibidos por primer alien: %d \n",a1.getnShoots());
		System.out.printf("Pociones tomadas por primer alien: %d \n",a1.getnHealup());
	}

}
