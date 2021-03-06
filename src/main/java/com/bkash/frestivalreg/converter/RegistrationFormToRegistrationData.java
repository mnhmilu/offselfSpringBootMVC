package com.bkash.frestivalreg.converter;


import com.bkash.frestivalreg.commands.RegistrationForm;
import com.bkash.frestivalreg.domain.Registration;
import org.springframework.stereotype.Component;

@Component
public class RegistrationFormToRegistrationData {

    public Registration convert(RegistrationForm form)
    {
        Registration entity = new Registration();

        entity.setId(form.getId());
        entity.setAccountBirthDate(form.getAccountBirthDate());
        entity.setAccountFatherName(form.getAccountFatherName());
        entity.setAccountMotherName(form.getAccountMotherName());
        entity.setAccountFirstName(form.getAccountFirstName());
        entity.setAccountLastName(form.getAccountLastName());
        entity.setAccountNumber(form.getAccountNumber());
        entity.setDetailsOfOccupation(form.getDetailsOfOccupation());
        entity.setSourceOfFund(form.getSourceOfFund());
        entity.setEstimatedMonthlyIncome(form.getEstimatedMonthlyIncome());
        entity.setGender(form.getGender());
        entity.setPresentAddress(form.getPresentAddress());
        entity.setPermanentAddress(form.getPermanentAddress());
        entity.setIdNumber(form.getIdNumber());
        entity.setIdType(form.getIdType());
        entity.setAccountHasbandWifeName(form.getAccountHasbandWifeName());

        return entity;

    }


}
