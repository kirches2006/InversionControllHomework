package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean first = context.getBean(FirstBean.class);
        SecondBean second = context.getBean(SecondBean.class);


        PrototypeBean p1 = context.getBean(PrototypeBean.class);
        PrototypeBean p2 = context.getBean(PrototypeBean.class);
        PrototypeBean p3 = context.getBean(PrototypeBean.class);

    }
}
