package com.soterianetworks.spase.sample.checking.controller;

import com.soterianetworks.spase.sample.checking.domain.CheckMachineSearchRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.validation.constraints.Max;

public class CheckMachineSearchParam implements CheckMachineSearchRequest {

    private int page = 0;

    @Max(value = 500)
    private int size = 20;

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
