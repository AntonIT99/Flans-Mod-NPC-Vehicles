// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class TranslateUtil
{
    private static final String TranslateUrl = "http://translate.google.com/translate_a/t?client=t&text=%s&hl=en&sl=%s&tl=%s&ie=UTF-8&oe=UTF-8&multires=1&otf=1&pc=1&trs=1&ssel=3&tsel=6&sc=1";
    private static final String AudioUrl = "http://translate.google.com/translate_tts?q=%s&tl=%s";
    
    public static String Translate(final String text) {
        try {
            final String urlStr = String.format("http://translate.google.com/translate_a/t?client=t&text=%s&hl=en&sl=%s&tl=%s&ie=UTF-8&oe=UTF-8&multires=1&otf=1&pc=1&trs=1&ssel=3&tsel=6&sc=1", URLEncoder.encode(text, "utf8"), "auto", "nl");
            final URL url = new URL(urlStr);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB;     rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)");
            connection.setRequestProperty("X-HTTP-Method-Override", "GET");
            connection.connect();
            final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            final String line = reader.readLine();
            reader.close();
            connection.disconnect();
            if (line != null) {
                final String parsed = parseJson(line);
                if (parsed != null) {
                    return parsed;
                }
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
        catch (IOException e3) {
            e3.printStackTrace();
        }
        return text;
    }
    
    private static String parseJson(final String line) {
        final JsonParser parser = new JsonParser();
        JsonElement element;
        JsonArray array;
        for (element = parser.parse(line); element.isJsonArray(); element = array.get(0)) {
            array = (JsonArray)element;
            if (array.size() == 0) {
                return null;
            }
        }
        System.out.println(element.getAsString());
        return element.getAsString();
    }
}
