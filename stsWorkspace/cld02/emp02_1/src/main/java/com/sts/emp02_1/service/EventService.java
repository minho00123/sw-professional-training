package com.sts.emp02_1.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.sts.emp02_1.config.MyEvent;

@Service
public class EventService {

    @EventListener
    public void func(MyEvent e) {
        if (e.type == MyEvent.ALL) {
            System.out.println("목록을 보여줍니다");
        } else if (e.type == MyEvent.ADD) {
            System.out.println(e.params + " 값으로 입력");
        } else if (e.type == MyEvent.EDIT) {
            System.out.println(e.params + " 값으로 수정");
        } else if (e.type == MyEvent.DEL) {
            System.out.println(e.params.getEmpno() + " 삭제");
        }
    }

}
