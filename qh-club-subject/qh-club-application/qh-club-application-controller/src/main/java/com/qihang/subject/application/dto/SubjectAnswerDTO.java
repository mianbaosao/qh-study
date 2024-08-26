package com.qihang.subject.application.dto;

import lombok.Data;

/**
 * @Description: 题目答案DTO
 * @Author:bread
 * @Date: 2024-08-26 16:09
 */
@Data
public class SubjectAnswerDTO {
    /**
     * 题目类型
     */
    private Integer optionType;

    /**
     * 答案内容
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;
}
