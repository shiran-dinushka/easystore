package com.easybytes.easystore.service;

import com.easybytes.easystore.dto.ContactRequestDto;
import com.easybytes.easystore.dto.ProductDto;

import java.util.List;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
