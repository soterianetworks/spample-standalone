package com.soterianetworks.spase.sample.machine.repository.custom;

import com.soterianetworks.spase.sample.machine.domain.Machine;
import com.soterianetworks.spase.sample.machine.domain.MachineSearchRequest;
import org.springframework.data.domain.Page;

public interface MachineRepositoryCustom {

    Page<Machine> search(MachineSearchRequest searchRequest);

}
