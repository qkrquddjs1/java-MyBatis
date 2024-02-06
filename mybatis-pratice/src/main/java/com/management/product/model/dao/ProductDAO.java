package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface ProductDAO {




    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.
   List<ProductDTO> selectAllProductList();


    List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);
}
