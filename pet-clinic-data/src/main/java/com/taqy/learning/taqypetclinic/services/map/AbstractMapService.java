package com.taqy.learning.taqypetclinic.services.map;

import com.taqy.learning.taqypetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
      return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNexId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("object cannot be null!");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNexId(){
        return map.isEmpty()? 1L : Collections.max(map.keySet()) + 1;
    }
}
