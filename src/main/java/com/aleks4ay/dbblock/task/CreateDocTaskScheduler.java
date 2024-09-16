package com.aleks4ay.dbblock.task;

import com.aleks4ay.dbblock.persistence.DaoAlexDoc;
import com.aleks4ay.dbblock.persistence.entity.AlexDoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class CreateDocTaskScheduler {
    @Autowired
    DaoAlexDoc daoAlexDoc;



    @Scheduled(fixedRate = 10000)
    @Transactional
    public void createDoc() {
        System.out.println("********* start creating Doc *****************");
        int i = ThreadLocalRandom.current().nextInt(1, 8);
        AlexDoc alexDoc = daoAlexDoc.create(new AlexDoc(null, (long)i, null, generateDescription()));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(alexDoc);
        System.out.println("********* end creating Doc *****************");
    }

    private String generateDescription() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 20; i++) {
            int j = ThreadLocalRandom.current().nextInt(32, 80);
            sb.append((char) j);
        }
        return sb.toString();
    }
}
