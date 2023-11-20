public class Main {
    /**
     * Ejemplos crear libro de diferentes formas
     * @param args
     */
    public static void main(String[] args) {
        //Crear libro
        Libro lib = new Libro();
        lib.inicializarLibro();

        //Crear libro con constructor
        lib.Libro("aa", "autor", 1990,(short) 100, 5);

        //Mostrar libro
        lib.getLibro();

        lib.inicializarLibro();
        //Crear libro
        lib.setTitulo("El Principito");
        lib.setAutor("Antoine de Saint-Exupéry");
        lib.setAno(1943);
        lib.setPaginas((short) 96);
        lib.setValoracion(4.5f);
        //Mostrar libro
        lib.getLibro();
    }

}