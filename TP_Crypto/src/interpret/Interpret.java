package interpret;

import mac.HmacSHA;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * <b>Interpret allows to interpret the command line returned by the user</b>.
 * Member variables: 
 * 	a String table <i>args</i>,
 * 	Strings <i>command</i>, <i>algo</i>, <i>path</i> et <i>password</i>,
 * 	a boolean <i>quit</i>.
 * 
 * @author Eva Ly Kok
 * 
 */

public class Interpret {
	/**
	 * String stocking the command line returned by the user.
	 */
	String[] args;
	/**
	 * String stocking the command (generation or verification) wanted by the user.
	 */
	String command = "";
	/**
	 * String stocking the MAC algorithm chosen by the user.
	 */
	String algo = "";
	/**
	 * String stocking the absolute path to the file which has to go through MAC generation or verification.
	 */
	String path = "";
	/**
	 * String stocking the password returned by the user.
	 */
	String password = "";
	/**
	 * Boolean allowing to know the state of <b>Interpret</b>.
	 */
	boolean quit;
	
	/**
	 * Valued constructor initializing <b>Interpret</b> with a command line.
	 * @param args
	 * 		Command line to deal with.
	 */
	public Interpret(String[] args){
		this.args = args;
		this.quit = false;
		int l;
		if ((l = args.length) == 4){
			this.command = args[0];
			this.algo = args[1];
			this.path = args[2];
			this.password = args[3];
		}
		
		else if (l == 3){
			this.command = args[0];
			this.algo = args[1];
			this.path = args[2];
		}
		
		else if (l == 1){
			this.command = args[0];
		}
		
		else{
			System.out.println("Pas le bon nombre d'arguments !");
		}
		
	}
	
	/**
	 * Returns <b>Interpret</b>'s state.
	 * @return
	 */
	public boolean isRunning(){
		return !this.quit;
	}
	
	/**
	 * Changes <b>Interpret</b>'s state to not running.
	 */
	public void doQuit(){
		this.quit = true;
	}
	
	/**
	 * Displays the user's guide to the application with CLI.
	 */
	public void doHelp(){
		System.out.println("3 commandes: crypt pour crypter, verif pour verifier l'integrite du fichier et quit pour quitter.");
		System.out.println("a chaque commande on associe une option qui correspond a l'algorithme voulu:");
		System.out.println("-sha1, -sha256, -sha384 ou -sha512 pour l'algorithme HmacSHA[1|256|384|512]");
		System.out.println("(exemple : crypt -sha256 <path> <password> en remplacant <path> par le chemin vers le fichier a crypter et <password> par le mot de passe voulu.)");
		System.out.println("-md5 pour l'algorithme HmacMD5");
		System.out.println("(exemple : verif -md5 <path>)");
		System.out.println("-pbewithsha1, -pbewithsha256, -pbewithsha384, -pbewithsha512 ou -pbewithmd5 pour l'algorithme PBEwith<mac>");
		System.out.println("(exemple : crypt -pbewithsha1 <path> <password>)");
	
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the HmacSHA1 algorithm with the key <i>password</i>. 
	 * @see mac.HmacSHA#HmacSHA1(File, String)
	 */
	public void doHmacSHA1(){
		
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the HmacSHA256 algorithm with the key <i>password</i>. 
	 * @see mac.HmacSHA#HmacSHA256(File, String)
	 */
	public void doHmacSHA256(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the HmacSHA384 algorithm with the key <i>password</i>. 
	 * @see mac.HmacSHA#HmacSHA384(File, String)
	 */
	public void doHmacSHA384(){
	
			try {
				File f = new File(this.path);
				HmacSHA.HmacSHA384(f, this.password);
			} catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the HmacSHA512 algorithm with the key <i>password</i>. 
	 * @see mac.HmacSHA#HmacSHA512(File, String)
	 */
	public void doHmacSHA512(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the HmacMD5 algorithm. 
	 * @see mac.HmacMD5#HmacMD5(File)
	 */
	public void doHmacMD5(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the PBEwithSHA1 algorithm with the key <i>password</i>. 
	 * @see mac.PBEwith#PBEwithSHA1(File, String)
	 */
	public void doPBEwithSHA1(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the PBEwithSHA256 algorithm with the key <i>password</i>. 
	 * @see mac.PBEwith#PBEwithSHA256(File, String)
	 */
	public void doPBEwithSHA256(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the PBEwithSHA384 algorithm with the key <i>password</i>. 
	 * @see mac.PBEwith#PBEwithSHA384(File, String)
	 */
	public void doPBEwithSHA384(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the PBEwithSHA512 algorithm with the key <i>password</i>. 
	 * @see mac.PBEwith#PBEwithSHA512(File, String)
	 */
	public void doPBEwithSHA512(){
		
	}
	
	/**
	 * Makes the file referenced by <i>path</i> go through the PBEwithMD5 algorithm with the key <i>password</i>. 
	 * @see mac.PBEwith#PBEwithMD5(File, String)
	 */
	public void doPBEwithMD5(){
		
	}
	
	/**
	 * Adapts <b>Interpret</b>'s behavior depending on the command line returned by the user. 
	 */
	public void decode(){
		if (this.command.equals("crypt ")){
			switch (this.algo){
			case "sha1 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA1();
				} break;
				
			case "sha256 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA256();
				} break;
				
			case "sha384 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA384();
				} break;
				
			case "sha512 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA512();
				} break;
				
			case "md5 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
						doHmacMD5();
				} break;
				
			case "pbewithsha1 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA1();
				} break;
				
			case "pbewithsha256 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA256();
				} break;
				
			case "pbewithsha384 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA256();
				} break;
				
			case "pbewithsha512 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA512();
				} break;
				
			case "pbewithmd5 " :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithMD5();
				} break;
				
			default :
				doHelp();
				break;
			}
			
		}
		
		else if (this.command.equals("verif ")){
			
		}
		
		else if (this.command.equals("quit")){
			doQuit();
		}
		
		else {
			doHelp();
		}

	}
	
}
