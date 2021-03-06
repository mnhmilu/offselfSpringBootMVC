package com.bkash.frestivalreg.converter;

import com.bkash.frestivalreg.commands.RegistrationForm;
import com.bkash.frestivalreg.domain.Registration;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RegistrationDataToRegistrationForm implements Converter<Registration, RegistrationForm> {

    public  RegistrationForm convert(Registration data)
    {
        RegistrationForm form = new RegistrationForm();

        form.setId(data.getId());
        form.setAccountBirthDate(data.getAccountBirthDate());
        form.setAccountFatherName(data.getAccountFatherName());
        form.setAccountMotherName(data.getAccountMotherName());
        form.setAccountFirstName(data.getAccountFirstName());
        form.setAccountLastName(data.getAccountLastName());
        form.setAccountNumber(data.getAccountNumber());
        form.setDetailsOfOccupation(data.getDetailsOfOccupation());
        form.setSourceOfFund(data.getSourceOfFund());
        form.setEstimatedMonthlyIncome(data.getEstimatedMonthlyIncome());
        form.setGender(data.getGender());
        form.setPresentAddress(data.getPresentAddress());
        form.setPermanentAddress(data.getPermanentAddress());
        form.setIdNumber(data.getIdNumber());
        form.setIdType(data.getIdType());
        form.setAccountHasbandWifeName(data.getAccountHasbandWifeName());

        return  form;
    }



}
