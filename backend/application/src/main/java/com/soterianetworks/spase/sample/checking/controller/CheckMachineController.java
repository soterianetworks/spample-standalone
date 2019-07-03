package com.soterianetworks.spase.sample.checking.controller;

import com.soterianetworks.spase.sample.checking.service.CheckMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/check-machines")
@RestController
public class CheckMachineController {

    @Autowired
    private CheckMachineService machineService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<CheckMachineView> listCheckMachines(@ModelAttribute CheckMachineSearchParam searchParam) {
        return machineService.listCheckMachines(searchParam);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CheckMachineView findCheckMachineById(@PathVariable("id") String id) {
        return machineService.findCheckMachineById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public CheckMachineView createCheckMachine(@Valid @RequestBody SaveCheckMachineParam saveCheckMachineParam) {
        return machineService.createCheckMachine(saveCheckMachineParam);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CheckMachineView updateCheckMachine(@PathVariable("id") String id,
                                               @Valid @RequestBody SaveCheckMachineParam saveCheckMachineParam) {
        return machineService.updateCheckMachine(id, saveCheckMachineParam);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCheckMachine(@PathVariable("id") String id) {
        machineService.deleteCheckMachine(id);
    }

}
