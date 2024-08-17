package org.uitest.utils;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlUtils {

    Configurations configurations=new Configurations();

    public String getURLFromYAML(String pageName){
        String filePath="urlContainer/"+System.getProperty("brand")+".yaml";
        Yaml yaml = new Yaml();
        try (InputStream inputStream = YamlUtils.class.getClassLoader().getResourceAsStream(filePath)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("File not found: " + filePath);
            }
            Map<String, Object> data = yaml.load(inputStream);
            String key=System.getProperty("environment")+"."+System.getProperty("locale")+"."+"homepage";
            String url=getNestedValue(data, key);
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static String getNestedValue(Map<String, Object> map, String key) {
        String[] keys = key.split("\\.");
        Object value = map;
        for (String k : keys) {
            if (value instanceof Map) {
                value = ((Map<String, Object>) value).get(k);
            } else {
                return null;
            }
        }
        return value != null ? value.toString() : null;
    }

}
