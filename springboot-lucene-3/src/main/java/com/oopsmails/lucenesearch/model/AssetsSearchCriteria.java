package com.oopsmails.lucenesearch.model;

import com.oopsmails.lucenesearch.service.OopsSearchTerm;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
public class AssetsSearchCriteria {
    @NotBlank
    private String text;

    private List<String> fields = new ArrayList<>();

    @Min(1)
    private int limit;

    private OopsSearchTerm searchTermKeywordMatch = OopsSearchTerm.UNKNOWN;
    private OopsSearchTerm searchTermOperator = OopsSearchTerm.UNKNOWN;
}