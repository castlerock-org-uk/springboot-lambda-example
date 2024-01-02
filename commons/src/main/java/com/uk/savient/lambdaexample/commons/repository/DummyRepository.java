package com.uk.savient.lambdaexample.commons.repository;

import com.uk.savient.lambdaexample.commons.model.DummyObject;
import org.springframework.stereotype.Repository;

@Repository
public class DummyRepository {
    public DummyObject getDummyObject() {
        return new DummyObject("dummy name");
    }
}
