package mac;
import java.io.BufferedInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * HmacSHA allows to call different methods corresponding to HmacSHA[1|256|384|512].
 * @author Brice Kessler, Eva Ly Kok
 *
 */

public class HmacSHA {
	
	/**
	 * Makes the file <i>file</i> go through the HmacSHA384 algorithm with the key <i>password</i>.
	 * @param file
	 * @param password
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static void HmacSHA384(File file, String password) throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		SecretKeySpec ks = new SecretKeySpec(password.getBytes(), "HmacSHA384");
		Mac mac = Mac.getInstance("HmacSHA384");
		
		mac.init(ks);
		byte[] buffer = new byte[1024];
		int l = 0;
		
		while((l = in.read()) != -1){
			mac.update(buffer, 0, l);
		}
		
		byte[] tag = mac.doFinal();
		FileOutputStream out = new FileOutputStream(file.getName() + "_HmacSHA384Tag");
		out.write(tag);
		
		out.close();
		in.close();
	}
	
	/**
	 * Makes the file <i>file</i> go through the HmacSHA520 algorithm with the key <i>password</i>.
	 * @param file
	 * @param password
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static void HmacSHA512(File file, String password) throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		SecretKeySpec ks = new SecretKeySpec(password.getBytes(), "HmacSHA512");
		Mac mac = Mac.getInstance("HmacSHA512");
		
		mac.init(ks);
		byte[] buffer = new byte[1024];
		int l = 0;
		
		while((l = in.read()) != -1){
			mac.update(buffer, 0, l);
		}
		
		byte[] tag = mac.doFinal();
		FileOutputStream out = new FileOutputStream(file.getName() + "_HmacSHA512Tag");
		out.write(tag);
		
		out.close();
		in.close();
	}
}
