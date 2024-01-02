package com.uk.savient.lambdaexample.functions;

import com.uk.savient.lambdaexample.commons.model.DummyObject;
import com.uk.savient.lambdaexample.commons.service.DummyService;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class DummyFunctionComponent {

    public Function<?, DummyObject> dummyFunction(final DummyService dummyService) {
        return value -> dummyService.getDummyObject();
    }
}
