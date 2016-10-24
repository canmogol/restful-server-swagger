package com.fererlab.ss.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;
import java.util.TreeMap;

@XmlRootElement
public class GenericMapDTO<T> {

    private Map<String, T> map = new TreeMap<>();

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(String key, T value) {
        this.map.put(key, value);
    }

    public GenericMapDTO<T> put(String key, T value) {
        this.map.put(key, value);
        return this;
    }

}
