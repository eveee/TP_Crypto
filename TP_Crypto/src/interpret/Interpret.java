package interpret;

import java.io.File;

public class Interpret {
	String[] args;
	String command = "";
	String algo = "";
	String path = "";
	String password = "";
	boolean quit;
	
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
		
		else {
			doHelp();
		}
		
	}
	
	public boolean isRunning(){
		return !this.quit;
	}
	
	public void doQuit(){
		this.quit = true;
	}
	
	public void doHelp(){
		System.out.println("2 commandes: crypt pour crypter et verif pour verifier l'integrite du fichier");
		System.out.println("a chaque commande on associe une option qui correspond a l'algorithme voulu:");
		System.out.println("-sha1, -sha256, -sha384 ou -sha512 pour l'algorithme HmacSHA[1|256|384|512]");
		System.out.println("(exemple : crypt -sha256 <path> <password> en remplacant <path> par le chemin vers le fichier a crypter et <password> par le mot de passe voulu.)");
		System.out.println("-md5 pour l'algorithme HmacMD5");
		System.out.println("(exemple : verif -md5 <path>)");
		System.out.println("-pbewithsha1, -pbewithsha256, -pbewithsha384, -pbewithsha512 ou -pbewithmd5 pour l'algorithme PBEwith<mac>");
		System.out.println("(exemple : crypt -pbewithsha1 <path> <password>)");
	
	}
	
	public void doHmacSHA1(){
		
	}
	
	public void doHmacSHA256(){
		
	}
	
	public void doHmacSHA384(){
		
	}
	
	public void doHmacSHA512(){
		
	}
	
	public void doHmacMD5(){
		
	}
	
	public void doPBEwithSHA1(){
		
	}
	
	public void doPBEwithSHA256(){
		
	}
	
	public void doPBEwithSHA384(){
		
	}
	
	public void doPBEwithSHA512(){
		
	}
	
	public void doPBEwithMD5(){
		
	}
	
	public void decode(){
		if (this.command.equals("crypt")){
			switch (this.algo){
			case "-sha1" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA1();
				} break;
				
			case "-sha256" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA256();
				} break;
				
			case "-sha384" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA384();
				} break;
				
			case "-sha512" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doHmacSHA512();
				} break;
				
			case "-md5" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
						doHmacMD5();
				} break;
				
			case "-pbewithsha1" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA1();
				} break;
				
			case "-pbewithsha256" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA256();
				} break;
				
			case "-pbewithsha384" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA256();
				} break;
				
			case "-pbewithsha512" :
				if (this.path.equals(""))
					System.out.println("Chemin absolu vers votre fichier SVP.");
				else {
					if (this.password.equals(""))
						System.out.println("Mot de passe requis.");
					else
						doPBEwithSHA512();
				} break;
				
			case "-pbewithmd5" :
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
		
		else if (this.command.equals("verif")){
			
		}
		
		else {
			doHelp();
		}

	}
	
}
