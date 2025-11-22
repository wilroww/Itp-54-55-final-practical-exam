package com.rocs.self.checkout.application.app.facade.impl;

public class ItemFacadeImpl implements ItemFacade{
    private ItemDao itemDao;

    public ItemFacadeImpl() {
        this.itemDao = new ItemDaoImpl();
    }

    @Override
    public Item getItemById(String id) throws Exception {
        if(StringUtils.isEmpty(id) || StringUtils.isBlank(id)) {
            throw new Exception("Id is not present");
        }
        return itemDao.findItemById(id);
    }
}
