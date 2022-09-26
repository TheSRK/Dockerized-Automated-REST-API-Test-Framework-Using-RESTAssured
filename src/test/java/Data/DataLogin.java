package Data;

import Commons.Constants;
import Utils.PropertiesManager;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataLogin {
    public Map<String, Object> getDataMapLoginPayload() {
        return dataMapLoginPayload;
    }

    public void setDataMapLoginPayload(Map<String, Object> dataMapLoginPayload) {
        dataMapLoginPayload.put(Constants.username, PropertiesManager.getProperty("username"));
        dataMapLoginPayload.put(Constants.password, PropertiesManager.getProperty("password"));
        this.dataMapLoginPayload = dataMapLoginPayload;
    }

    Map<String, Object> dataMapLoginPayload = new LinkedHashMap<>();

}
