package com.company;

import java.util.LinkedList;


public class HashMapAlgoritm {
    LinkedList<Entrys>[] hashMap = new LinkedList[2];
    int size = 0;

    public HashMapAlgoritm() {

    }

    public void put(Key key, Value value) {
        if (size >= hashMap.length) {
            resize();
        }
        int ix = getIndex(key) % hashMap.length;

        if (hashMap[ix] == null) {
            hashMap[ix] = new LinkedList<>();
            hashMap[ix].add(new Entrys(key, value));
            size++;
            return;
        } else {
            for (Entrys entry : hashMap[ix]) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    size++;
                    return;
                }
            }
            hashMap[ix].add(new Entrys(key, value));
            size++;
            return;
        }
    }

    public  Value get(Key key){
        int ix = getIndex(key) % hashMap.length;
        if(hashMap[ix] == null){
            return  null;
        }
        for (Entrys entrys : hashMap[ix]){
            if(entrys.key.equals(key)){
                return  entrys.value;
            }
        }
        return  null;
    }


    public  void resize(){
        LinkedList<Entrys>[] oldHashMap = hashMap;
        hashMap = new LinkedList[size * 2];
        size = 0;

        for(int i = 0;i< oldHashMap.length;i++){
            if(oldHashMap[i]==null)continue;
            for(Entrys entrys: oldHashMap[i]){
                put(entrys.key,entrys.value);
            }
        }
    }

    public  int getIndex(Key key){

        return  key.hashCode();
    }
    public int size() {
        return  size;

    }
}
