/**
 * clase libro
 */
public class Libro {
    /**
     * titulo del libro
     */
    String titulo;
    /**
     * autor del libro
     */
    String autor;
    /**
     * ano del libro
     */
    int ano;
    /**
     * numero paginas del libro
     */
    short numPaginas;
    /**
     * valoracion del libro
     */
    float valoracion;

    public void Libro() {
    }

    /**
     * crear un libro
     * @param tit titulo del libro
     * @param aut autor del libro
     * @param an ano del libro
     * @param paginas paginas del libro
     * @param valora valoracion del libro
     */
    public void Libro(String tit, String aut, int an, short paginas, float valora) {
        titulo = tit;
        autor = aut;
        ano = an;
        numPaginas = paginas;
        valoracion = valora;
    }

    /**
     * obtener libro
     */
    public void getLibro() {
        System.out.println("\nInformación del libro\ntitulo = " + titulo + "\nautor = " + autor + "\nano = " + ano + "\nnumero de paxinas = " + numPaginas + "\nvaloracion = " + valoracion);
    }

    /**
     * inicializar libro
     */
    public void inicializarLibro() {
        titulo = "";
        autor = "";
        ano = 0;
        numPaginas = 0;
        valoracion = 0.0f;
    }

    /**
     * establecer titulo del libro
     * @param m titulo del libro
     */
    public void setTitulo(String m) {
        titulo = m;
        //System.out.println("Establecido el titulo en = " + m);
    }

    /**
     * establecer autor del libro
     * @param m autor del libro
     */
    public void setAutor(String m) {
        autor = m;
        //System.out.println("Establecido el autor en = " + m);
    }

    /**
     * establecer año del libro
     * @param m año del libro
     */
    public void setAno(int m) {
        ano = m;
        //System.out.println("Establecido el año en = " + m);
    }

    /**
     * establecer paginas del libro
     * @param m paginas del libro
     */
    public void setPaginas(short m) {
        numPaginas = m;
        //System.out.println("Establecido el numero de paginas en = " + m);
    }

    /**
     * establecer valoracion del libro
     * @param m valoracion del libro
     */
    public void setValoracion(float m) {
        valoracion = m;
        //System.out.println("Establecida la valoracion en = " + m);
    }

    /**
     * obtener titulo del libro
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * obtener autor del libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * obtener ano del libro
     * @return ano del libro
     */
    public int getAno() {
        return ano;
    }

    /**
     * obtener paginas del libro
     * @return paginas del libro
     */
    public short getPaginas() {
        return numPaginas;
    }

    /**
     * obtener valoracion del libro
     * @return valoracion del libro
     */
    public float getValoracion() {
        return valoracion;
    }
}
