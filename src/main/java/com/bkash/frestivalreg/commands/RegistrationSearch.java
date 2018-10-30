package com.bkash.frestivalreg.commands;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationSearch {

    @NotNull
    @Size(min=11, max=11)
    private String searchKey;

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
}
