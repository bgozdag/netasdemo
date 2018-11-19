package com.example.demo;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@ViewScoped
public class DropdownView implements Serializable {

    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private String city;
    private String district;
    private Map<String,String> cities;
    private Map<String,String> districts;

    @PostConstruct
    public void init() {
        cities  = new HashMap<String, String>();
        cities.put("Ankara", "Ankara");
        cities.put("İstanbul", "İstanbul");
        cities.put("İzmir", "İzmir");

        Map<String,String> map = new HashMap<String, String>();
        map.put("Çankaya", "Çankaya");
        map.put("Yenimahalle", "Yenimahalle");
        map.put("Keçiören", "Keçiören");
        data.put("Ankara", map);

        map = new HashMap<String, String>();
        map.put("Bakırköy", "Bakırköy");
        map.put("Beyoğlu", "Beyoğlu");
        map.put("Zeytinburnu", "Zeytinburnu");
        data.put("İstanbul", map);

        map = new HashMap<String, String>();
        map.put("Bornova", "Bornova");
        map.put("Buca", "Buca");
        map.put("Karşıyaka", "Karşıyaka");
        data.put("İzmir", map);
    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public Map<String, String> getDistricts() {
        return districts;
    }

    public void onCityChange() {
        if(city !=null && !city.equals(""))
            cities = data.get(city);
        else
            cities = new HashMap<String, String>();
    }

}