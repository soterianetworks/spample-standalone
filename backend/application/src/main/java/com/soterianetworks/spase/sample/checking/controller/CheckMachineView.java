package com.soterianetworks.spase.sample.checking.controller;

import com.soterianetworks.spase.sample.checking.domain.CheckMachine;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class CheckMachineView {

    public static final CheckMachineView from(CheckMachine checkMachine) {
        if (checkMachine == null) {
            return null;
        }
        CheckMachineView result = new CheckMachineView();
        BeanUtils.copyProperties(checkMachine, result);
        if (checkMachine.getMachine() != null) {
            result.setMachineId(checkMachine.getMachine().getId());
            result.setMachineCode(checkMachine.getMachine().getCode());
            result.setMachineName(checkMachine.getMachine().getName());
        }
        return result;
    }

    private String id;

    private String machineId;

    private String machineCode;

    private String machineName;

    private String type;

    private String description;

    private Date createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
