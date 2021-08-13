package com.onlinelibrary.service;

import com.onlinelibrary.model.PurchaseHistory;
import com.onlinelibrary.repository.IPurchaseHistoryRepository;
import com.onlinelibrary.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {

    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
