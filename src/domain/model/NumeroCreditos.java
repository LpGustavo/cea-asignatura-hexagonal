package domain.model;

public class NumeroCreditos {
    private final int valor;

    public NumeroCreditos(int valor) {
        if (valor < 1 || valor > 6) {
            throw new ExcepcionNumeroCreditosInvalido("El número de créditos debe estar entre 1 y 6.");
        }
        this.valor = valor;
    }

    public int getValor() { return valor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeroCreditos)) return false;
        NumeroCreditos that = (NumeroCreditos) o;
        return valor == that.valor;
    }

    @Override
    public int hashCode() { return Integer.hashCode(valor); }
}
