package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenlinkInterface {

	public static void VerifyLinkActivity(String link) {

		try {
			URL url = new URL(link);
			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			connect.setConnectTimeout(3000);
			connect.connect();
			if (connect.getResponseCode() == 200) {
				System.out.println(link + "-" + connect.getResponseMessage());
			}
			if (connect.getResponseCode() == connect.HTTP_NOT_FOUND) {
				System.out.println(link + "-" + connect.getResponseMessage() + "-" + connect.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}