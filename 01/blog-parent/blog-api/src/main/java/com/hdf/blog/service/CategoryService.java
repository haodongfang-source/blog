package com.hdf.blog.service;

import com.hdf.blog.vo.CategoryVo;
import com.hdf.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
