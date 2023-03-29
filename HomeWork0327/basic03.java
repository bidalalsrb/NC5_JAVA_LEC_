package HomeWork0327;

import java.util.HashMap;
import java.util.Map;

// Map<String, 인티저>을 하나 생성하여 key는
// 알파벳(대소문자 구분) value는 해당 알파벳의
// 유니코드 값을 Integer형태로 저장하세요.
public class basic03 {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        for (int i = 65; i <=122; i++) {
        map.put(Character.toString(i),i);
            System.out.println(map);
        }
    }
}
