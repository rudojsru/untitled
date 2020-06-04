import com.google.common.base.Splitter;
import org.apache.commons.collections.map.LinkedMap;

import java.util.Map;

public class Test implements MapDecoder {
    public static void main(String[] args) {
        final String input = "one=1&two=2&three=3";
        Test t = new Test();
        System.out.println(t.decode(input));


    }

    @Override
    public Map<String, String> decode(String s) {
        Map<String,String> map= new LinkedMap();
        if(s==null){
            return null;
        }
        if ((s.replaceAll("\\s+","")).equals("")){
            return map;
        }

          map= Splitter.on('&')
                .trimResults()
                .withKeyValueSeparator(Splitter.on('=')
                .trimResults())
                .split(s);
        return map;
    }
}

// Second commit 2