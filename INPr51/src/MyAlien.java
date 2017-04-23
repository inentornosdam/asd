
// TODO: Auto-generated Javadoc

/*
 * 
 * #author Ihor Novoselskyy
 * 
 * */

/**
 * The Class MyAlien.
 */
public class MyAlien {
		
		/** The Constant MAXHP. */
		public static final int MAXHP=100;
		
		/** The Constant MINHP. */
		public static final int MINHP=0;
		
		/** The cont. */
		public static int cont;
		
		/** The n shoots. */
		public int nShoots;
		
		/** The n healup. */
		public int nHealup;
		
		/**
		 * The Enum Estado.
		 */
		public enum Estado {
/** The vivo. */
VIVO, 
 /** The herido. */
 HERIDO, 
 /** The grave. */
 GRAVE, 
 /** The muerto. */
 MUERTO};
		
		/** The estado. */
		private Estado estado;
		
		/** The hp. */
		private int HP;
		
		/**
		 * Instantiates a new my alien.
		 */
		/*
		 * 
		 * @author
		 * 
		 */
		MyAlien(){
			cont++;
			estado=MyAlien.Estado.VIVO; //se peude poner con MyAlien.Estado. o sin My....
			this.HP=MAXHP;
		}
		
		/**
		 * Instantiates a new my alien.
		 *
		 * @param life the life
		 */
		MyAlien(int life){
			cont++;
			estado=Estado.VIVO;
			this.HP=life;
		}
		
		/**
		 * Shoot.
		 *
		 * @param a the a
		 */
		public void shoot(int a){
			this.HP-=a;
			if(this.HP<=0)this.HP=MINHP;	
			nShoots++;
		}
		
		/**
		 * Healup.
		 *
		 * @param b the b
		 */
		public void healup(int b){
			if(this.HP<=MINHP)this.HP=MINHP;
			else if(this.HP>=MAXHP)this.HP=MAXHP;
			else {this.HP+=b;
			nHealup++;}
		}		
		
		

		/**
		 * Gets the hp.
		 *
		 * @return the hp
		 */
		public int getHP() {
			if(this.HP>100)this.HP=MAXHP;
			return HP;
		}

		/**
		 * Sets the hp.
		 *
		 * @param hP the new hp
		 */
		public void setHP(int hP) {
			HP = hP;
		}

		/**
		 * Gets the n shoots.
		 *
		 * @return the n shoots
		 */
		public int getnShoots() {
			return nShoots;
		}

		/**
		 * Sets the n shoots.
		 *
		 * @param nShoots the new n shoots
		 */
		public void setnShoots(int nShoots) {
			this.nShoots = nShoots;
		}

		/**
		 * Gets the n healup.
		 *
		 * @return the n healup
		 */
		public int getnHealup() {
			return nHealup;
		}

		/**
		 * Sets the n healup.
		 *
		 * @param nHealup the new n healup
		 */
		public void setnHealup(int nHealup) {
			this.nHealup = nHealup;
		}

		/**
		 * Gets the estado.
		 *
		 * @return the estado
		 */
		public Estado getEstado() {
			if(this.HP<100&&this.HP>50)estado=Estado.HERIDO;
			else if(this.HP<=50&&HP>0)estado=Estado.GRAVE;
			else if(this.HP>=100)estado=Estado.VIVO;
			else estado=Estado.MUERTO;
			return estado;
		}

		/**
		 * Sets the estado.
		 *
		 * @param estado the new estado
		 */
		public void setEstado(Estado estado) {
			this.estado = estado;
		}

		/**
		 * Gets the cont.
		 *
		 * @return the cont
		 */
		public static int getCont() {
			return cont;
		}

		/**
		 * Sets the cont.
		 *
		 * @param cont the new cont
		 */
		public static void setCont(int cont) {
			MyAlien.cont = cont;
		}
		
		
		
}
