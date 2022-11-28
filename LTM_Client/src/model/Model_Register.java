package model;

import org.json.JSONException;
import org.json.JSONObject;
import swing.md5Hash.*;

public class Model_Register {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model_Register(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Model_Register() {
    }

    private String userName;
    private String password;

    public JSONObject toJsonObject() {
        try {
            JSONObject json = new JSONObject();
            json.put("userName", userName);
            json.put("password", MD5.getMd5(password) );
            return json;
        } catch (JSONException e) {
            return null;
        }
    }
}
