package com.drimitri.blog.dao.dos;

import lombok.Data;

// 需要访问，但不需要持久化访问的对象
@Data
public class Archives {

    private Integer year;

    private Integer month;

    private Long count;
}
