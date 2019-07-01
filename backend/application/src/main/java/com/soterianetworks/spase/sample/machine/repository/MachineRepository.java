package com.soterianetworks.spase.sample.machine.repository;

import com.soterianetworks.spase.sample.machine.domain.Machine;
import com.soterianetworks.spase.sample.machine.repository.custom.MachineRepositoryCustom;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MachineRepository extends PagingAndSortingRepository<Machine, String>, MachineRepositoryCustom {

}
