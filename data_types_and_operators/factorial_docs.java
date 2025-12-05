factorial_docs * Вычисляет факториал заданного целого неотрицательного числа.
 * <p>
 * Реализация использует итеративный подход. Для нуля возвращается единица.
 * </p>
 *
 * @param n число, факториал которого требуется вычислить.
 *          Должно быть неотрицательным.
 * @return факториал числа {@code n}.
 * @throws IllegalArgumentException если {@code n} является отрицательным числом.
 * @see <a href="https://en.wikipedia.org/wiki/Factorial">Factorial on Wikipedia</a>
 * @since 1.0
 */
public long calculateFactorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Число не должно быть отрицательным: " + n);
    }
    long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}