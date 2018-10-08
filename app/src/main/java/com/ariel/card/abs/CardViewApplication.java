package com.ariel.card.abs;

import com.arieljin.library.abs.AbsApplication;

/**
 * @time 2018/10/8.
 * @email ariel.jin@tom.com
 */
public class CardViewApplication extends AbsApplication {


    @Override
    protected String getAppChannelMetaDataKey() {
        return null;
    }

    @Override
    public String getDB_NAME() {
        return "card.db";
    }
}
