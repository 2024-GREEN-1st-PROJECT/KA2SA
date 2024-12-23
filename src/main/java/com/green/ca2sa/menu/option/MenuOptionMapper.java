package com.green.ca2sa.menu.option;

import com.green.ca2sa.menu.model.MenuDelReq;
import com.green.ca2sa.menu.option.model.MenuOptionPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuOptionMapper {
    int insMenuOption(MenuOptionPostReq p);
    int updateMenuOption(MenuOptionPostReq p);
    int deleteMenuOption(long p);

}
