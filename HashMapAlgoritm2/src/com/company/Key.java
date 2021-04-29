package com.company;

import java.util.Objects;

public class Key {
    private  int key;
    public  Key(int key){
        this.key = key ;

    }

    @Override
    public  boolean equals(Object object){
        if(this == object)return  true;
        if(object == null || getClass()!=object.getClass()) return  false;
        Key key1 = (Key)object;
        return  Objects.equals(key,key1.key);

    }
    @Override
    public  int hashCode(){
        return Objects.hash(key);
    }
}
