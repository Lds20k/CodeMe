package br.com.zup.bootcamp.controller.validator.annotation;

import br.com.zup.bootcamp.controller.validator.GenericUnityValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = GenericUnityValidator.class)
public @interface Unique {
    String message() default "A data already registered";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String fieldName();
    Class<?> domainClass();
}
