package doublePlugin.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.apache.commons.codec.binary.Base64;

public class DoubleUtil {
	private static final JsonParser parser = new JsonParser();
	public static String spiltUUIDbyString(String texture) {
		StringBuilder builder = new StringBuilder(texture);
		for(int index = 1; index < builder.length(); index++) {
			if(index % 4 == 0) {
				builder.setCharAt(index, '-');
			}
		}

		return builder.toString();
	}

	public static String getContent(String link){
		try {
			URL url = new URL(link);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				return inputLine;
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getSkinUrl(String uuid){
		String json = getContent("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid);
		JsonObject o = parser.parse(json).getAsJsonObject();
		String jsonBase64 = o.get("properties").getAsJsonArray().get(0).getAsJsonObject().get("value").getAsString();

		o = parser.parse(new String(Base64.decodeBase64(jsonBase64))).getAsJsonObject();
		return o.get("textures").getAsJsonObject().get("SKIN").getAsJsonObject().get("url").getAsString();
	}

	public static GameProfile getGameProfile(String texture, String displayName) {
		String urlTexture = "http://textures.minecraft.net/texture/" + texture;
		GameProfile profile = new GameProfile(UUID.randomUUID(), displayName);
		byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", urlTexture).getBytes());
		profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

		return profile;
	}

	public static String getTextureByUUID(UUID uuid) {
		URL url_1 = null;
		try {
			url_1 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		InputStreamReader reader_1 = null;
		try {
			reader_1 = new InputStreamReader(url_1.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonObject textureProperty = new JsonParser().parse(reader_1).getAsJsonObject().get("properties").getAsJsonArray().get(0).getAsJsonObject();
		return textureProperty.get("value").getAsString();
	}
}
