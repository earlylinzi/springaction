package com.early.springaction.practice;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext ctxt, AnnotatedTypeMetadata metadata) {
        Environment env = ctxt.getEnvironment();

        return true;
    }
}
