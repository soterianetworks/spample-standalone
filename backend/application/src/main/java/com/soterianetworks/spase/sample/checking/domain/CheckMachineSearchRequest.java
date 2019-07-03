package com.soterianetworks.spase.sample.checking.domain;

import org.springframework.data.domain.Pageable;

public interface CheckMachineSearchRequest {

    int getPage();

    int getSize();

    Pageable resolvePageable();
}
