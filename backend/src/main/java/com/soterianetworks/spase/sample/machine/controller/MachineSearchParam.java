package com.soterianetworks.spase.sample.machine.controller;

import com.soterianetworks.spase.sample.machine.domain.MachineSearchRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.validation.constraints.Max;

public class MachineSearchParam implements MachineSearchRequest {

    private int page = 0;

    @Max(value = 500)
    private int size = 20;

    private String searchKey;

    @Override
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public Pageable resolvePageable() {
        if (page < 0) {
            page = 0;
        }
        if (size < 1) {
            size = 20;
        }

        return new PageRequest(page, size);
    }

}
