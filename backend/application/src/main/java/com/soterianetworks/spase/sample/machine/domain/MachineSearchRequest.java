package com.soterianetworks.spase.sample.machine.domain;

import org.springframework.data.domain.Pageable;

public interface MachineSearchRequest {

    int getPage();

    int getSize();

    String getSearchKey();

    Pageable resolvePageable();
}
