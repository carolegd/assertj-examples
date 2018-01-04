package org.assertj.examples.data;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Mansion} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractMansionAssert<S extends AbstractMansionAssert<S, A>, A extends Mansion> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractMansionAssert}</code> to make assertions on actual Mansion.
   * @param actual the Mansion we want to make assertions on.
   */
  protected AbstractMansionAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Mansion's candlestick is equal to the given one.
   * @param candlestick the given candlestick to compare the actual Mansion's candlestick to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's candlestick is not equal to the given one.
   */
  public S hasCandlestick(String candlestick) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting candlestick of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCandlestick = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("candlestick", String.class, actual);
    if (!Objects.areEqual(actualCandlestick, candlestick)) {
      failWithMessage(assertjErrorMessage, actual, candlestick, actualCandlestick);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Mansion's colonel is equal to the given one.
   * @param colonel the given colonel to compare the actual Mansion's colonel to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's colonel is not equal to the given one.
   */
  public S hasColonel(String colonel) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting colonel of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualColonel = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("colonel", String.class, actual);
    if (!Objects.areEqual(actualColonel, colonel)) {
      failWithMessage(assertjErrorMessage, actual, colonel, actualColonel);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Mansion's guests is equal to the given one.
   * @param guests the given guests to compare the actual Mansion's guests to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's guests is not equal to the given one.
   */
  public S hasGuests(int guests) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting guests of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualGuests = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("guests", int.class, actual);
    if (actualGuests != guests) {
      failWithMessage(assertjErrorMessage, actual, guests, actualGuests);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Mansion's kitchen is equal to the given one.
   * @param kitchen the given kitchen to compare the actual Mansion's kitchen to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's kitchen is not equal to the given one.
   */
  public S hasKitchen(String kitchen) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting kitchen of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualKitchen = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("kitchen", String.class, actual);
    if (!Objects.areEqual(actualKitchen, kitchen)) {
      failWithMessage(assertjErrorMessage, actual, kitchen, actualKitchen);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Mansion's library is equal to the given one.
   * @param library the given library to compare the actual Mansion's library to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's library is not equal to the given one.
   */
  public S hasLibrary(String library) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting library of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualLibrary = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("library", String.class, actual);
    if (!Objects.areEqual(actualLibrary, library)) {
      failWithMessage(assertjErrorMessage, actual, library, actualLibrary);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Mansion's professor is equal to the given one.
   * @param professor the given professor to compare the actual Mansion's professor to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's professor is not equal to the given one.
   */
  public S hasProfessor(String professor) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting professor of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualProfessor = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("professor", String.class, actual);
    if (!Objects.areEqual(actualProfessor, professor)) {
      failWithMessage(assertjErrorMessage, actual, professor, actualProfessor);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Mansion's revolverAmmo is equal to the given one.
   * @param revolverAmmo the given revolverAmmo to compare the actual Mansion's revolverAmmo to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Mansion's revolverAmmo is not equal to the given one.
   */
  public S hasRevolverAmmo(int revolverAmmo) {
    // check that actual Mansion we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting revolverAmmo of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualRevolverAmmo = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("revolverAmmo", int.class, actual);
    if (actualRevolverAmmo != revolverAmmo) {
      failWithMessage(assertjErrorMessage, actual, revolverAmmo, actualRevolverAmmo);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
