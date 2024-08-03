package JavaUtileExam;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001","kim");
        map.put("002","lee");
        map.put("003", "choi");
        // 같은 key가 2개 있을 수 없습니다. 첫번째로 저장했던 001, kim은 001, kang으로 바뀐다.
        map.put("001", "kang");
        System.out.println(map.size());

        // 키가 001, 002, 003인 값을 꺼내 출력합니다.
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));
        System.out.println(map.get("003"));

        Set<String> key = map.keySet();
        Iterator<String> iter = key.iterator();
        while(iter.hasNext()) {
            // key를 꺼냅니다.
            String key2 = iter.next();
            // key에 해당하는 value를 꺼냅니다.
            String value = map.get(key2);
            // key와 value를 출력합니다.
            System.out.println(key2 + " : " + value);
        }
    }
}
