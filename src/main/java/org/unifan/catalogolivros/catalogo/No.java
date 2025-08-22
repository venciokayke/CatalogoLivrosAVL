package org.unifan.catalogolivros.catalogo;

public class No {

    Livro livro;
    No esq, dir;
    int altura;

    public No(No dir, No esq, Livro livro) {
        this.dir = dir;
        this.esq = esq;
        this.livro = livro;
        this.altura = 1; // altura inicial de um novo nó
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}