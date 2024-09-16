package com.aleks4ay.dbblock.persistence.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder(setterPrefix = "with", builderMethodName = "of")
@EqualsAndHashCode
public class GetAlexHostParameter {
    private final Long id;
}