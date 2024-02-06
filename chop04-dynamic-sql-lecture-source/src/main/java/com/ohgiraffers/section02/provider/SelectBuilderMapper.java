package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SelectBuilderMapper {
    @Results(id = "menuResultMap", value = {
            @Result(id = true, property = "menuCode", column = "menu_code"),
            @Result(  property = "menuName", column = "menu_name"),
            @Result( property = "menuPrice", column = "menu_price"),
            @Result( property = "categoryCode", column = "category_code"),
            @Result( property = "orderableStatus", column = "orderable_status"),

    })
    @SelectProvider(type = SelectBuilderProvider.class, method = "selectAllMenu")
    List<MenuDTO> selectAllMenu();

    @ResultMap("menuResultMap")
    @SelectProvider(type = SelectBuilderProvider.class, method = "searchMenuByNameOrCategory")
    List<MenuDTO> searchMenuByNameOrCategory(SearchCriteria searchCriteria);



}
