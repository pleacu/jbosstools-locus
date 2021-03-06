/*
 * Created on Feb 14, 2008
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2008-2011 the original author or authors.
 */
package org.fest.assertions;

import static org.fest.assertions.ArrayInspection.copy;
import static org.fest.assertions.ErrorMessages.*;

import java.util.Arrays;

/**
 * Assertions for {@code boolean} arrays.
 * <p>
 * To create a new instance of this class invoke <code>{@link Assertions#assertThat(boolean[])}</code>.
 * </p>
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class BooleanArrayAssert extends ArrayAssert<BooleanArrayAssert, boolean[]> {

  /**
   * Creates a new </code>{@link BooleanArrayAssert}</code>.
   * @param actual the target to verify.
   */
  protected BooleanArrayAssert(boolean... actual) {
    super(BooleanArrayAssert.class, actual);
  }

  /**
   * Verifies that the actual {@code boolean} array contains the given values.
   * @param values the values to look for.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code boolean} array is {@code null}.
   * @throws NullPointerException if the given {@code boolean} array is {@code null}.
   * @throws AssertionError if the actual {@code boolean} array does not contain the given values.
   */
  public BooleanArrayAssert contains(boolean...values) {
    assertContains(copy(values));
    return this;
  }

  /**
   * Verifies that the actual {@code boolean} array contains the given values <strong>only</strong>.
   * @param values the values to look for.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code boolean} array is {@code null}.
   * @throws NullPointerException if the given {@code boolean} array is {@code null}.
   * @throws AssertionError if the actual {@code boolean} array does not contain the given objects, or if the
   * actual {@code boolean} array contains elements other than the ones specified.
   */
  public BooleanArrayAssert containsOnly(boolean...values) {
    assertContainsOnly(copy(values));
    return this;
  }

  /**
   * Verifies that the actual {@code boolean} array does not contain the given values.
   * @param values the values the array should exclude.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code boolean} array is {@code null}.
   * @throws NullPointerException if the given {@code boolean} array is {@code null}.
   * @throws AssertionError if the actual {@code boolean} array contains any of the given values.
   */
  public BooleanArrayAssert excludes(boolean...values) {
    assertExcludes(copy(values));
    return this;
  }

  /**
   * Verifies that the actual {@code boolean} array is equal to the given array. Array equality is checked by
   * <code>{@link Arrays#equals(boolean[], boolean[])}</code>.
   * @param expected the given array to compare the actual array to.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code boolean} array is not equal to the given one.
   */
  @Override public BooleanArrayAssert isEqualTo(boolean[] expected) {
    if (Arrays.equals(actual, expected)) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedNotEqual(actual, expected));
  }

  /**
   * Verifies that the actual {@code boolean} array is not equal to the given array. Array equality is checked by
   * <code>{@link Arrays#equals(boolean[], boolean[])}</code>.
   * @param array the given array to compare the actual array to.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code boolean} array is equal to the given one.
   */
  @Override public BooleanArrayAssert isNotEqualTo(boolean[] array) {
    if (!Arrays.equals(actual, array)) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedEqual(actual, array));
  }
}
