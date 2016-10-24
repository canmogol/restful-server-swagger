package com.fererlab.ss.dto;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class GenericList<T> {

    List<T> list = new LinkedList<>();

    public List getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public GenericList<T> add(T t) {
        this.list.add(t);
        return this;
    }

}
