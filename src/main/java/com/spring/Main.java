package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaxCalculator taxCalculator = context.getBean(TaxCalculator.class);
        taxCalculator.calculateTax();
    }

}
