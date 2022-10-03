package maccess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class DJson {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Object ob = gson.fromJson(new FileReader("C:\\Users\\samaddi\\Downloads\\BookStore.json"), Object.class);
		System.out.println(ob);
		String json = gson.toJson(ob);
		JSONArray arr = JsonPath.read(json, "$.store.book");
		for(int i = 0; i<arr.size(); i++) {
			
		}
		System.out.println(json);

	}

}
