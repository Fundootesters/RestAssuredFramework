package utils;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseDynamicJson {

	// How to parse dynamic JSON?
	// How to parse nested JSON?
	// Code Explanation : https://www.youtube.com/watch?v=ZjZqLUGCWxo

	public static void parseObject(JSONObject json, String key) {
		// System.out.println(json.has(key));
		System.out.println(json.get(key));
	}

	public static void getKey(JSONObject json, String key) {

		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;

		if (!exists) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKeys = (String) keys.next();
				try {

					if (json.get(nextKeys) instanceof JSONObject) {

						if (exists == false) {
							getKey(json.getJSONObject(nextKeys), key);
						}

					} else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonarray = json.getJSONArray(nextKeys);
						for (int i = 0; i < jsonarray.length(); i++) {
							String jsonarrayString = jsonarray.get(i).toString();
							JSONObject innerJSOn = new JSONObject(jsonarrayString);

							if (exists == false) {
								getKey(innerJSOn, key);
							}

						}

					}

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		} else {
			parseObject(json, key);
		}

	}

	public static void main(String[] args) {

		String inputJson = "{\n" + 
				"  \"myObjects\": [\n" + 
				"    {\n" + 
				"      \"code\": \"PQ\",\n" + 
				"      \"another_objects\": [\n" + 
				"        {\n" + 
				"          \"attr1\": \"value1\",\n" + 
				"          \"attr2\": \"value2\",\n" + 
				"          \"attrN\": \"valueN\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"attr1\": \"value1\",\n" + 
				"          \"attr2\": \"value2\",\n" + 
				"          \"attrN\": \"valueN\"\n" + 
				"        }\n" + 
				"      ]\n" + 
				"    }\n" + 
				"  ]\n" + 
				"}";
		JSONObject inputJSONOBject = new JSONObject(inputJson);

		getKey(inputJSONOBject, "attr1");

	}

}
