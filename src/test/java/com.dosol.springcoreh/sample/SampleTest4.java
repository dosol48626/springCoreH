package com.dosol.springcoreh.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/root-context.xml"})
public class SampleTest4 {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testService6() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);

    }
}
