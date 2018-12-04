/**
 * The below HmacSHA1 algorithm is used to validate the end users / clients with the Service
 * where a "secretkey" is shared between a specific user and service
 * different users have different secretkeys
 * 
 * using the secretkey , the user is validated 
 * 
 * further details found under: https://dzone.com/articles/protect-rest-service-using
 */
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;


	public class HmacSHA1Example {
		private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

		private static String toHexString(byte[] bytes) {
			Formatter formatter = new Formatter();
			
			for (byte b : bytes) {
				formatter.format("%02x", b);
			}

			return formatter.toString();
		}

		public static String calculateRFC2104HMAC(String data, String key)
			throws SignatureException, NoSuchAlgorithmException, InvalidKeyException
		{
			SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);
			return toHexString(mac.doFinal(data.getBytes()));
		}

		public static void main(String[] args) throws Exception {
			String hmac = calculateRFC2104HMAC("vishal", "secretKey");

			System.out.println(hmac);
			assert hmac.equals("104152c5bfdca07bc633eebd46199f0255c9f49d");
		}
	}
