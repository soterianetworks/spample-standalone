package com.soterianetworks.spase.sample.checking.service;

import com.soterianetworks.spase.sample.checking.controller.CheckMachineView;
import com.soterianetworks.spase.sample.checking.controller.SaveCheckMachineParam;
import com.soterianetworks.spase.sample.checking.domain.CheckMachineSearchRequest;
import com.soterianetworks.spase.sample.machine.domain.Machine;
import org.springframework.data.domain.Page;

public interface CheckMachineService {

    public Page<CheckMachineView> listCheckMachines(CheckMachineSearchRequest searchRequest);

    public CheckMachineView findCheckMachineById(String id);

    public CheckMachineView createCheckMachine(SaveCheckMachineParam saveCheckMachineParam);

    public CheckMachineView updateCheckMachine(String id, SaveCheckMachineParam saveCheckMachineParam);

    public CheckMachineView deleteCheckMachine(String id);

    void generateMachineError(Machine machine);
}
