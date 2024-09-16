package com.aleks4ay.dbblock.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
        prefix = "spring.datasource",
        name = "url"
)
@MapperScan(basePackages = {"com.aleks4ay.dbblock.persistence"})
//@MapperScan(basePackages = {"com.fuib.digitalbank.transformer.abominus.persistence"})
public class MyBatisScanAutoConfiguration {
}
