package com.banking.user.services.impl;

import com.banking.user.domain.Card;
import com.banking.user.repo.CardRepo;
import com.banking.user.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepo cardRepo;

    public void saveCard(Card card){
        cardRepo.save(card);
    }
}
