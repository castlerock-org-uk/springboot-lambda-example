package com.uk.savient.lambdaexample.commons.service;

import com.uk.savient.lambdaexample.commons.model.DummyObject;
import com.uk.savient.lambdaexample.commons.repository.DummyRepository;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    private final DummyRepository dummyRepository;

    public DummyService(final DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public DummyObject getDummyObject() {
        return dummyRepository.getDummyObject();
    }

}
