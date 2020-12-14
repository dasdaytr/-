package laba26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> countValues(Map<String, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (String value : map.values()) {
            result.put(value, result.getOrDefault(value, 0) + 1);
        }
        return result;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, Integer> count = countValues(map);
        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (count.get(pair.getValue()) > 1) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Пупкинн ", "Вася");
        map.put("Елизарьев", "Никита");
        map.put("Колосов", "Андрей");
        map.put("Овечкинн", "Генадий");
        map.put("Пупкин ", "Вася");
        map.put("Овечкин", "Генадий");
        map.put("Клименко", "Григорий");
        map.put("Cеменов", "Доберман");
        map.put("Суверинов", "Владислав");
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
        Map<String, ArrayList<String>> map1 = new HashMap();
        map1.put("Россия", new ArrayList<>(Arrays.asList("Москва","Питер","Екатеренбург")));
        map1.put("Испания", new ArrayList<>(Arrays.asList("Барселона","Реал Мадрид","Севилья")));
        for (Map.Entry<String, ArrayList<String>> pair : map1.entrySet()) {
            System.out.println(pair.getKey()+" = "+pair.getValue());
        }
    }
}
