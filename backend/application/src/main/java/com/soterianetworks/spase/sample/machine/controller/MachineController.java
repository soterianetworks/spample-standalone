package com.soterianetworks.spase.sample.machine.controller;

import com.soterianetworks.spase.sample.machine.domain.Machine;
import com.soterianetworks.spase.sample.machine.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/machines")
@RestController
public class MachineController {

    @Autowired
    private MachineService machineService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<Machine> listMachines(@ModelAttribute MachineSearchParam searchParam) {
        return machineService.listMachines(searchParam);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Machine findMachineById(@PathVariable("id") String id) {
        return machineService.findMachineById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public Machine createMachine(@Valid @RequestBody Machine machine) {
        return machineService.createMachine(machine);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Machine updateMachine(@PathVariable("id") String id, @Valid @RequestBody Machine machine) {
        return machineService.updateMachine(id, machine);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMachine(@PathVariable("id") String id) {
        machineService.deleteMachine(id);
    }

    @PutMapping("/{id}/error")
    @ResponseStatus(HttpStatus.OK)
    public Machine generateMachineError(@PathVariable("id") String id) {
        return machineService.generateMachineError(id);
    }

}
