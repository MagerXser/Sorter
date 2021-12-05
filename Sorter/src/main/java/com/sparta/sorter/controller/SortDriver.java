package com.sparta.sorter.controller;

import com.sparta.sorter.Interface;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SortDriver {

    private static Logger logger = LogManager.getLogger("My Sparta App");

    public static void main(String[] args) {
        logger.info("The application has started");
        Interface i = new Interface();
        i.userInterface();

    }
}
