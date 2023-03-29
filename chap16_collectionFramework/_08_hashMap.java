package chap16_collectionFramework;

import chap06_class.Car;

import java.util.*;
import java.util.Map.Entry;

public class _08_hashMap {
    public static void main(String[] args) {
        Map<String, String> carMap = new HashMap<String, String>();

        //key value의 쌍 저장

        carMap.put("company", "현대");
        carMap.put("model", "쏘나다");
        carMap.put("color", "검정");
        carMap.put("price", "4000");

        System.out.println(carMap);
        //Map에 어떤 데이터가 들어있는지 확인할 때
        //Entry의 Set을 생성하고 Iterator를 꺼내서
        //Key,Value를 하나씩 확인한다
        Set<Entry<String, String>> carSet = carMap.entrySet();
        Iterator<Entry<String, String>> it = carSet.iterator();
        while (it.hasNext()) {
            Entry<String, String> ent = it.next();
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
        }
        Map<String, Object> objmap = new HashMap<String, Object>();
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 5; i++) {
            Car car = new Car("현대", "쏘나타20" + (10 + i), "검정", 3000);
            carList.add(car);
        }
        objmap.put("carList", carList);

        System.out.println(objmap);


    }
}
