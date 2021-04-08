package clases;

import java.util.ArrayList;

public class Arreglo_Docente {

    private ArrayList<Docente> lista;

    public Arreglo_Docente() {

        lista = new ArrayList();

        lista.add(new Docente("Perez", 45, 28));
        lista.add(new Docente("Diaz", 33, 25));
        lista.add(new Docente("Avila", 42, 38));
        lista.add(new Docente("Gomez", 40, 24));
        lista.add(new Docente("Cardenaz", 42, 23));
        lista.add(new Docente("Ponte", 55, 24));
        lista.add(new Docente("Moran", 52, 33));
        lista.add(new Docente("Caceres", 50, 28));

    }

    public int tamaño() {

        return lista.size();

    }

    public Docente obtener(int p) {

        return lista.get(p);
    }

    public ArrayList<Docente> listado() {

        return lista;
    }

    public void adicionar(Docente d) {
        lista.add(d);
    }

    // Metodos de calculo
    public double promedio() {

        double sm = 0;

        for (Docente x : lista) {

            sm = sm + x.sueldo();

        }

        return sm / tamaño();
    }

    public double mayorSueldo() {

        // parte con el primer sueldo
        double max = obtener(0).sueldo();

        for (Docente x : lista) {

            if (x.sueldo() > max) {
                max = x.sueldo();
            }

        }
        return max;
    }

    public double menorSueldo() {

        double min = obtener(0).sueldo();

        for (Docente x : lista) {

            if (x.sueldo() < min) {

                min = x.sueldo();

            }

        }

        return min;
    }

    public double mayorTarifa() {

        double max = obtener(0).getTarifa();

        for (Docente x : lista) {

            if (x.getTarifa() > max) {

                max = x.getTarifa();
            }

        }

        return max;
    }

    public double menorTarifa() {

        double min = obtener(0).getTarifa();

        for (Docente x : lista) {

            if (x.getTarifa() < min) {

                min = x.getTarifa();
            }

        }

        return min;
    }

    /**
     * *** OPCIONAL ******
     */
    // Buscar el registro x codigo
    public Docente busca(String cod) {

        for (Docente x : lista) {

            if (x.getCodigo().equals(cod)) {

                return x;
            }
        }

        return null;
    }

    // Anular docente
    public void anula(Docente d) {

        lista.remove(d);
    }
}
