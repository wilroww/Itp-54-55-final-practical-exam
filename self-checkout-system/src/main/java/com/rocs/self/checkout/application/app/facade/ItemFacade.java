package com.rocs.self.checkout.application.app.facade;

import com.rocs.self.checkout.application.model.item.Item;

public interface ItemFacade {
    Item getItemById(String var1) throws Exception;

    int getSum(int var1, int var2);
}
