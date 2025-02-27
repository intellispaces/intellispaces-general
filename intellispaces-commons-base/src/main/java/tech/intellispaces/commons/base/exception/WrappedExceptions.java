package tech.intellispaces.commons.base.exception;

/**
 * Provider of the exception {@link WrappedExceptions}.
 */
public interface WrappedExceptions {

  static WrappedException of(Exception checkedException) {
    return new WrappedException(checkedException);
  }
}
