package com.spring.core.chap01;

import org.springframework.stereotype.Component;

//@NoArgsConstructor

public class WesternRestaurant implements Restaurant{

    // 의존 객체
    private final Chef chef;
    private FrenchCourse course = new FrenchCourse();

    public WesternRestaurant(Chef chef) {
        this.chef = chef;
    }


    // 요리를 주문하는 기능
    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        // 요리 코스 메뉴를 구성해야함.
        course.combineMenu();
        // 요리사에게 요리명령을 내려야함
        chef.cook();
    }
}
