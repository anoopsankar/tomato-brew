package in.rusty.tomatobrew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class WebUtils {

    public static String doGet(String url, HashMap<String, String> params) throws MalformedURLException, IOException {

        String rawJSONString = "";
        String getUrl = buildUrl(url, params);

        HttpURLConnection connection = (HttpURLConnection) new URL(getUrl).openConnection();
        connection.setRequestMethod("GET");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        rawJSONString = sb.toString();

        return rawJSONString;
    }

    private static String buildUrl(String url, HashMap<String, String> params) throws UnsupportedEncodingException {

        StringBuilder urlString = new StringBuilder(url);

        if (params.isEmpty()) {
            return urlString.toString();
        }

        urlString.append("?");

        Iterator<Entry<String, String>> it = params.entrySet().iterator();

        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            urlString.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            urlString.append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            urlString.append(it.hasNext() ? '&' : "");
        }

        return urlString.toString();
    }
}
