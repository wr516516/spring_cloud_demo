import com.google.common.collect.Maps;

import java.util.Map;

public class ss {
    public static void main(String[] args) {
        Object[] objects = {""};
        Map<String, Object> params = Maps.newHashMap();
        params.put("123",123);
        params.put("321",321);
        Object[] objects2 = {"params"};
        System.out.println(objects2);
        for (Object o : objects2) {
            System.out.println(o);
        }

    }
}
