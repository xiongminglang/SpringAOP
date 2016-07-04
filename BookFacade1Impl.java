package com.cglib.Impl;

import com.proxy.dao.BookFacade;

/**
 * Created by Administrator on 16-6-12.
 */
public class BookFacade1Impl implements BookFacade{


    @Override
    public void addBook() {

        System.out.println("增加图书的普通方法.......");

    }
}
