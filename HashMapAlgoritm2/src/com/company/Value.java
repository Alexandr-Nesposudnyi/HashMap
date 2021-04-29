package com.company;

public class Value {
    private  long value;
    public  Value(long value){
        this.value = value;
    }
    public  Value(Long value){

    }
    public  long getValue(){

        return  value;
    }

    @Override
    public  boolean equals(Object object){
        if(this == object) return  true;
        if(object == null || getClass()!= object.getClass()) return false;
        Value value1 = (Value) object;
        return  value == value1.value;
    }
}
