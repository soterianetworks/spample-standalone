package com.soterianetworks.spase.sample.checking.repository.custom;

import com.soterianetworks.spase.sample.checking.domain.CheckMachine;
import com.soterianetworks.spase.sample.checking.domain.CheckMachineSearchRequest;
import org.springframework.data.domain.Page;

public interface CheckMachineRepositoryCustom {

    Page<CheckMachine> search(CheckMachineSearchRequest searchRequest);

}
