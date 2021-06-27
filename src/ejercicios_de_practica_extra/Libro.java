package ejercicios_de_practica_extra;

public class Libro {
    //Campos, propiedades o atributos
    private int ISBN;
    private String autor;
    private String titulo;
    private int num_paginas;

    /**********--Metodos--************/
    /*--Metodo constructor--*/
    public Libro(int ISBN, String autor, String titulo, int num_paginas){

        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.num_paginas = num_paginas;

    }

    /**-----Metodos Setters------**/
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setNum_paginas(int num_paginas){
        this.num_paginas = num_paginas;
    }

    /**+++++----Getters-----+++++**/
    public int getISBN(){
        return ISBN;
    }
    public int getNum_paginas(){
        return num_paginas;
    }
    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    //Metodo sobrecargado
    @Override
    public  String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+" tiene "+num_paginas+" páginas";
    }
}
