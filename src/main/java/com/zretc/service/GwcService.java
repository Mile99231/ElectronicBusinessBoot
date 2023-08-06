package com.zretc.service;


import com.zretc.pojo.Gwc;

import java.util.ArrayList;
import java.util.List;

public interface GwcService {
    public List<Gwc> sel(String user);

    public boolean add(Gwc gwc);

    public boolean del(int gid);

    public boolean delByIds(List<Integer> ids);
}
