package org.assertj.examples.data;

/**
 * {@link Magical} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractMagicalAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class MagicalAssert extends AbstractMagicalAssert<MagicalAssert, Magical> {

  /**
   * Creates a new <code>{@link MagicalAssert}</code> to make assertions on actual Magical.
   * @param actual the Magical we want to make assertions on.
   */
  public MagicalAssert(Magical actual) {
    super(actual, MagicalAssert.class);
  }

  /**
   * An entry point for MagicalAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myMagical)</code> and get specific assertion with code completion.
   * @param actual the Magical we want to make assertions on.
   * @return a new <code>{@link MagicalAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static MagicalAssert assertThat(Magical actual) {
    return new MagicalAssert(actual);
  }
}
