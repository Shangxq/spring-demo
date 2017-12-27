package com.shang.spring.learn.enableannotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConditionBean {
    String condition;

    ConditionBean(){
        this.condition="hahah";
    }

    ConditionBean(String condition) {
        super();
        this.condition = condition;
    }

    public void outCondition() {
        System.out.println(this.condition);
    }
}
