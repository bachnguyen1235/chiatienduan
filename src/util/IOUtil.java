package util;

import java.util.List;

public class IOUtil {
    public <E> E findById(int customerID, List<E> lists){
        for (int j = 0; j < lists.size(); j++) {
            if (customerID == lists.get(j).getId()) {
                return lists.get(j);
            }
        }
        return null;
    }
}
