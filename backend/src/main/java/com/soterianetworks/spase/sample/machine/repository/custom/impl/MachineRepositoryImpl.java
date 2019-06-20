package com.soterianetworks.spase.sample.machine.repository.custom.impl;

import com.soterianetworks.spase.sample.machine.domain.Machine;
import com.soterianetworks.spase.sample.machine.domain.MachineSearchRequest;
import com.soterianetworks.spase.sample.machine.repository.custom.MachineRepositoryCustom;
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
public class MachineRepositoryImpl implements MachineRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Page<Machine> search(MachineSearchRequest searchRequest) {
        Pageable pageable = searchRequest.resolvePageable();
        Query query = new Query();
        if (!StringUtils.isEmpty(searchRequest.getSearchKey())) {
            query.addCriteria(new Criteria().orOperator(Criteria.where("code").regex(searchRequest.getSearchKey()),
                                                        Criteria.where("name").regex(searchRequest.getSearchKey())));
        }
        query.with(pageable);
        long count = mongoTemplate.count(query, Machine.class);
        List<Machine> list = mongoTemplate.find(query, Machine.class);
        return new PageImpl<>(list, pageable, count);
    }

}
