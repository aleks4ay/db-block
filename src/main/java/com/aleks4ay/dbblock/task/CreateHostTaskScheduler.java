package com.aleks4ay.dbblock.task;

import com.aleks4ay.dbblock.persistence.DaoAlexHost;
import com.aleks4ay.dbblock.persistence.entity.AlexHost;
import com.aleks4ay.dbblock.persistence.entity.GetAlexHostParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateHostTaskScheduler {
    @Autowired
    DaoAlexHost daoAlexHost;

    private static long i = 0L;

    @Scheduled(fixedRate = 3000)
    @Transactional
    public void createHost() {
        if (i == 7L) {
            i = 0;
        }
        AlexHost alexHost = daoAlexHost.get(GetAlexHostParameter.of().withId(++i).build());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(alexHost);
    }
}
