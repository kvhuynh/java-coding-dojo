import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Billie Jean", "The kid is not my son");
        userMap.put("What Is Love", "What is Love");
        userMap.put("Stan", "This is Stan");
        userMap.put("Tequila", "When I taste Tequila");


        System.out.println(userMap.get("Stan"));
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + userMap.get(key));
        }
    }
}