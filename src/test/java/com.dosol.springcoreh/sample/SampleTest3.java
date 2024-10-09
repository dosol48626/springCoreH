package com.dosol.springcoreh.sample;

import com.dosol.springcoreh.config.AppConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Log4j2
@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(AppConfig.class)
public class SampleTest3 {

    @Autowired(required = false)
    @Qualifier("myDTO1")
    private SampleDTO sampleDTO3;

    @Autowired(required = false)
    @Qualifier("myDTO2")
    private SampleDTO sampleDTO4;

    @Test
    public void beanTest2(){
        log.info(sampleDTO3);
        log.info(sampleDTO4);
    }
}
