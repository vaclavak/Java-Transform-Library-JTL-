package net.vac.jtl.pcutils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class PCU {

	public static void Forceshutdown() {
		try {
			Runtime.getRuntime().exec("shutdown -s");
		} catch (Exception ignored) {
		}
	}

	public static String getPublicIP() throws Exception {
		URL url = new URL("https://ipinfo.io/ip");
		URLConnection conn = url.openConnection();
		conn.setConnectTimeout(5000);
		conn.setReadTimeout(5000);
		conn.addRequestProperty("User-Agent", "Mozilla/5.0");
		conn.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String ip = reader.readLine().trim();
		return ip;
	}

	public static String getPrivateIP() throws Exception {
		InetAddress myIP = InetAddress.getLocalHost();
		return myIP.getHostAddress();
	}

}
