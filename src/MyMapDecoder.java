import com.google.common.base.Splitter;
import org.apache.commons.collections.map.LinkedMap;

import java.util.Map;


    public class MyMapDecoder implements  MapDecoder {

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
         //   throw new UnsupportedOperationException("Please implement me!");
        }
    }

