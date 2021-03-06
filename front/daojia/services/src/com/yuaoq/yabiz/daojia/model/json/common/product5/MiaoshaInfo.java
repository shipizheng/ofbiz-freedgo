package com.yuaoq.yabiz.daojia.model.json.common.product5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by changsy on 2016/10/19.
 */
public   class MiaoshaInfo {
    public String miaoshaRemainName;
    public String button;
    public int miaoShaSate;
    public boolean miaosha;
    
    public MiaoshaInfo(String miaoshaRemainName, String button, int miaoShaSate, boolean miaosha) {
        this.miaoshaRemainName = miaoshaRemainName;
        this.button = button;
        this.miaoShaSate = miaoShaSate;
        this.miaosha = miaosha;
    }
    
    public static MiaoshaInfo objectFromData(String str) {
        
        return new Gson().fromJson(str, MiaoshaInfo.class);
    }
    
    public static MiaoshaInfo objectFromData(String str, String key) {
        
        try {
            JSONObject jsonObject = new JSONObject(str);
            
            return new Gson().fromJson(jsonObject.getString(str), MiaoshaInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static List<MiaoshaInfo> arrayMiaoshaInfoFromData(String str) {
        
        Type listType = new TypeToken<ArrayList<MiaoshaInfo>>() {
        }.getType();
        
        return new Gson().fromJson(str, listType);
    }
    
    
}
