package com.uk.savient.lambdaexample.functions;

import com.uk.savient.lambdaexample.commons.model.DummyObject;
import com.uk.savient.lambdaexample.commons.service.DummyService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.function.Function;

@SpringBootApplication
@ComponentScan(basePackages = {"com.levi9.snapstart"})
public class FunctionsConfig {

    public static void main(final String[] args) {
        FunctionalSpringApplication.run(FunctionsConfig.class, args);
    }

    @Bean
    public Function<?, DummyObject> dummyFunction(final DummyFunctionComponent dummyFunctionComponent, final DummyService dummyService) {
        return dummyFunctionComponent.dummyFunction(dummyService);
    }
}