package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SMS {
	public static void main(String[] args) {
		String api_key = "NCSNYFRGDBZF4MG8";
	    String api_secret = "67KWD5PKZDQ688L7HID3SEEPAJUHGQCS";
	    Message coolsms = new Message(api_key, api_secret);

	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01036316448");
	    params.put("from", "01036316448");
	    params.put("type", "SMS");
	    params.put("text", "¾È³ç.");
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	}
}
