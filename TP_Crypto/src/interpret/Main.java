package interpret;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * <b>Main allows to run the application.</b>
 * @author Eva Ly Kok
 *
 */

public class Main {
	
	/**
	 * Runs the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		 Interpret interpret;
		 
		do {
			System.out.print("£ ");
			String line = in.nextLine();
			StringTokenizer st = new StringTokenizer(line, "-<>");
			int nbt = st.countTokens();
			System.out.println(nbt);
			String[] commandline = new String[nbt];
		
			for (int i = 0; i<nbt; i++){
				commandline[i] = st.nextToken();
			}
		
			interpret = new Interpret(commandline);
			interpret.decode();
		} while (interpret.isRunning());
		
		in.close();
	} 

}
