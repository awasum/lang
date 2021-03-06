/*
 * Copyright 2017 The Mifos Initiative
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.core.lang.validation.constraints;

import io.mifos.core.lang.validation.CheckIdentifiers;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Checks that a list of identifiers is valid, in the same way that ValidIdentifier checks if a single identifier is
 * valid.
 *
 * @author Myrle Krantz
 */
@SuppressWarnings("unused")
@Target({ FIELD, METHOD, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = CheckIdentifiers.class)
public @interface ValidIdentifiers {
  String message() default "One or more invalid fineract identifiers.";
  Class<?>[] groups() default { };
  Class<? extends Payload>[] payload() default { };

  int maxLength() default 32;
}