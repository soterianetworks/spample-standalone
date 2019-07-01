package com.soterianetworks.spase.sample.machine.service;

import com.soterianetworks.spase.sample.machine.domain.Machine;
import com.soterianetworks.spase.sample.machine.domain.MachineSearchRequest;
import org.springframework.data.domain.Page;

public interface MachineService {

    Page<Machine> listMachines(MachineSearchRequest searchRequest);

    Machine findMachineById(String id);

    Machine createMachine(Machine machine);

    Machine updateMachine(String id, Machine machine);

    Machine deleteMachine(String id);

}
