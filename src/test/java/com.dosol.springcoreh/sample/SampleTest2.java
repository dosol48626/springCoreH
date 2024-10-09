package com.dosol.springcoreh.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/test-context.xml")
public class SampleTest2 {
    @Autowired(required = false)
    @Qualifier("sample1")
    private SampleDTO sampleDTO1;

    @Autowired(required = false)
    @Qualifier("sample2")
    private  SampleDTO SampleDTO2;

    @Test
    public void beanTest2(){
        log.info("sampleDTO1");
        log.info("sampleDTO2");
    }
}
