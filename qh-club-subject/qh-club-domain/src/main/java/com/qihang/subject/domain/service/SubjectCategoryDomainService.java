package com.qihang.subject.domain.service;

import com.qihang.subject.domain.entity.SubjectCategoryBO;

import java.util.List;

/**
 * @Description: 分类接口
 * @Author:bread
 * @Date: 2024-07-30 9:33
 */
public interface SubjectCategoryDomainService {


    /**
     * 新增分类
     */
    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询分类
     * @return
     */
    List<SubjectCategoryBO> queryPrimaryCategory();
}
