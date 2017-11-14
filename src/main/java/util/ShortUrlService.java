package util;

import weibo4j.ShortUrl;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;

public class ShortUrlService {
	public static JSONObject LongToShortUrl(String accessToken,String longUrl){
		ShortUrl shortUrl = new weibo4j.ShortUrl(accessToken);
		try {
			JSONObject longToShortUrl = shortUrl.longToShortUrl(longUrl);
			return longToShortUrl;
		} catch (WeiboException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
