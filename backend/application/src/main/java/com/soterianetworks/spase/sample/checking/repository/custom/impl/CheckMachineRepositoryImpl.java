package com.soterianetworks.spase.sample.checking.repository.custom.impl;

import com.soterianetworks.spase.sample.checking.domain.CheckMachine;
import com.soterianetworks.spase.sample.checking.domain.CheckMachineSearchRequest;
import com.soterianetworks.spase.sample.checking.repository.custom.CheckMachineRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

@Repository
public class CheckMachineRepositoryImpl implements CheckMachineRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Page<CheckMachine> search(CheckMachineSearchRequest searchRequest) {
        Pageable pageable = searchRequest.resolvePageable();
        Query query = new Query();
        query.with(pageable);
        long count = mongoTemplate.count(query, CheckMachine.class);
        List<CheckMachine> list = mongoTemplate.find(query, CheckMachine.class);
        return new PageImpl<>(list, pageable, count);
    }

}
