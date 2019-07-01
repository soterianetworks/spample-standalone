package com.soterianetworks.spase.sample.machine.service.impl;

import com.soterianetworks.spase.sample.machine.domain.Machine;
import com.soterianetworks.spase.sample.machine.domain.MachineSearchRequest;
import com.soterianetworks.spase.sample.machine.exception.MachineNotFoundException;
import com.soterianetworks.spase.sample.machine.repository.MachineRepository;
import com.soterianetworks.spase.sample.machine.service.MachineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class MachineServiceImpl implements MachineService {

    @Autowired
    private MachineRepository machineRepository;

    @Override
    public Page<Machine> listMachines(MachineSearchRequest searchRequest) {
        return machineRepository.search(searchRequest);
    }

    @Override
    public Machine findMachineById(String id) {
        Machine machine = machineRepository.findOne(id);
        if (machine == null) {
            throw new MachineNotFoundException("Machine not found");
        }
        return machine;
    }

    @Override
    public Machine createMachine(Machine machine) {
        return machineRepository.save(machine);
    }

    @Override
    public Machine updateMachine(String id, Machine machine) {
        Machine existed = machineRepository.findOne(id);
        if (existed == null) {
            throw new MachineNotFoundException("Machine not found");
        }

        BeanUtils.copyProperties(machine, existed, "id");
        return machineRepository.save(existed);
    }

    @Override
    public Machine deleteMachine(String id) {
        Machine existed = machineRepository.findOne(id);
        if (existed == null) {
            return null;
        }
        machineRepository.delete(existed);
        return existed;
    }
}
