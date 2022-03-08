package com.drimitri.blog.service;

import com.drimitri.blog.vo.CategoryVo;
import com.drimitri.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
