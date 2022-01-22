package com.intellekta.mavenlearn;

import java.util.List;

public class ViewerStatistics {

    public int averageAge(List<Viewer> list) {
        int res = 0;
        for (Viewer pers : list) {
            res += pers.getAge();
        }
        return res;
    }
}
