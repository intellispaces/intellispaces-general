package tech.intellispaces.commons.base.entity;

/**
 * Entity reference provider.
 */
public interface References {

  static <E> Reference<E> get(E entity) {
    return new DirectReferenceImpl<>(entity);
  }
}
