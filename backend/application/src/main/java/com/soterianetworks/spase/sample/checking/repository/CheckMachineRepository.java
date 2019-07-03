package com.soterianetworks.spase.sample.checking.repository;

import com.soterianetworks.spase.sample.checking.domain.CheckMachine;
import com.soterianetworks.spase.sample.checking.repository.custom.CheckMachineRepositoryCustom;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CheckMachineRepository extends PagingAndSortingRepository<CheckMachine, String>, CheckMachineRepositoryCustom {

}
