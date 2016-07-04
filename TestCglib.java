package com.cglib.test;

import com.cglib.Impl.BookFacade1Impl;
import com.cglib.Impl.BookFacadeCglib;

/**
 * 测试使用Cglib
 * Created by Administrator on 16-6-12.
 */
public class TestCglib {


    public static void main() {

        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacade1Impl bookCglib = (BookFacade1Impl)cglib.getInstance(new BookFacade1Impl());

        bookCglib.addBook();
    }

}
