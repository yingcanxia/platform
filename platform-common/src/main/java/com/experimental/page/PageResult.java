package com.experimental.page;

import lombok.Data;

import java.util.List;

@Data
public class PageResult {
    private int pageNum;
    private int pageSize;
    private Long totalSize;
    private int totalPages;
    private List<?>content;
}
