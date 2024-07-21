package com.github.gn5r.web.common.dto;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public interface BaseForm {
  default Map<String, Object> toMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    try {
      for (Field field : this.getClass().getDeclaredFields()) {
        field.setAccessible(true);
        map.put(field.getName(), field.get(this));
      }
    } catch (Exception e) {
      return null;
    }
    return map;
  }
}
