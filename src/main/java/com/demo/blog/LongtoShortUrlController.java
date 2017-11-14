package com.demo.blog;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

import util.ShortUrl;
import util.ShortUrlService;
import weibo4j.org.json.JSONObject;
import weibo4j.org.json.JSONString;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.demo.common.model.Blog;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogController
 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */

public class LongtoShortUrlController extends Controller {
	
	public void index() {
		String url = getPara("url");
		getResponse().setHeader("Access-Control-Allow-Origin", "*");
		getResponse().setContentType("application/json;charset=utf-8");
//		new ShortUrl();
//		HashMap<String,Object> map = new HashMap<String,Object>();
//		new Random();
//		map.put("url_short", ShortUrl.ShortText(url)[new Random().nextInt(4)]);
//		renderJson(map);
		JSONObject longToShortUrl = ShortUrlService.LongToShortUrl("2.00T6OdwFmTOdUBd6ab78a53a3mhpQC", url);
		System.out.println(longToShortUrl.toString());
		renderJson(longToShortUrl.toString());
	}
	
	
}


