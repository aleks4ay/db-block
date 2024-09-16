package com.aleks4ay.dbblock.persistence.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder(setterPrefix = "with", builderMethodName = "of")
@EqualsAndHashCode
public class GetAlexDocParameter {
    private final Long hostId;
    private final Long docId;
}